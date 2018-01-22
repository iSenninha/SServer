package cn.senninha.web;

import cn.senninha.db.DbManager;
import cn.senninha.db.dao.TestDao;
import cn.senninha.db.entity.Test;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Req--->Dao--->Res请求过程
 * Coded by senninha on 18-1-22
 */
@Controller
public class SenninhaController {
    @RequestMapping(path = "/")
    @ResponseBody
    public List<Test> root(){
        SqlSession session = DbManager.openSession(true);
        TestDao dao = session.getMapper(TestDao.class);
        return dao.selectAll();
    }

}
