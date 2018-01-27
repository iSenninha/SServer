package cn.senninha.web.admin.controller;

import cn.senninha.web.common.Json;
import cn.senninha.web.common.ResConstant;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Coded by senninha on 18-1-26
 */
@Controller
public class AdminController {
    /**
     * 登陆
     * @param request
     * @param username
     * @param password
     * @return
     */
    @RequestMapping
    @ResponseBody
    public Json login(HttpServletRequest request, String username, String password) {
        Json j = null;
        if (StringUtils.isEmpty(username) || StringUtils.isEmpty(password)) {
            Json.valueOf(ResConstant.MISS_PARAM);
        } else {
            //
            request.getSession().setAttribute("user", username);
            Json.valueOf(ResConstant.LOGIN);
        }
        return j;
    }
}
