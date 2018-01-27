package cn.senninha.web;

import cn.senninha.db.DbManager;
import cn.senninha.db.dao.TestDao;
import cn.senninha.db.entity.Test;
import cn.senninha.equipment.container.ClientContainer;
import cn.senninha.equipment.container.PushHelper;
import cn.senninha.equipment.container.client.Client;
import cn.senninha.sserver.message.HelloMessage;
import cn.senninha.web.authority.AuthorityManager;
import cn.senninha.web.common.Json;
import cn.senninha.web.common.ResConstant;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;

/**
 * browser--> web -->db --> tcp --> remote tcpClient
 * Coded by senninha on 18-1-22
 */
@Controller
public class SenninhaController {
    @RequestMapping(path = "/")
    @ResponseBody
    public List<Test> root(int cur) {
        SqlSession session = DbManager.openSession(true);
        TestDao dao = session.getMapper(TestDao.class);
        PushHelper.sendAllOL(new HelloMessage());
        return dao.selectAll();
    }

    @RequestMapping(path = "/isLogin")
    @ResponseBody
    public Json isLogin(HttpServletRequest request) {
        String user = (String) request.getSession().getAttribute("user");
        Json j = null;
        if (user == null) {
            request.getSession().setAttribute("user", "user");
            j = Json.valueOf(ResConstant.NOT_LOGIN);

        } else {
            j = Json.valueOf(ResConstant.LOGIN);
        }
        return j;
    }

    @RequestMapping(path = "/loginOut")
    @ResponseBody
    public Json loginOut(HttpServletRequest request) {
        request.getSession().invalidate();
        Json j = Json.valueOf(ResConstant.NOT_LOGIN);
        return j;
    }

    @RequestMapping(path = "/login")
    @ResponseBody
    public Json login(HttpServletRequest request, String username, String password){
        Json j = Json.valueOf(ResConstant.LOGIN);
        return j;
    }

    @RequestMapping(path = "/admin/level")
    @ResponseBody
    public Json url(int level){
        Json j = Json.valueOf(ResConstant.LOGIN);
        j.setData(AuthorityManager.getInstance().getURLS(level));
        return j;
    }

}
