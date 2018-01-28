package cn.senninha.web.admin.controller;

import cn.senninha.equipment.container.PushHelper;
import cn.senninha.sserver.lang.codec.CodecFactory;
import cn.senninha.sserver.lang.message.BaseMessage;
import cn.senninha.sserver.logger.LoggerManager;
import cn.senninha.sserver.logger.LoggerSystem;
import cn.senninha.web.common.Json;
import cn.senninha.web.common.ResConstant;
import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 *  触发发送的接口
 * Coded by senninha on 18-1-28
 */
@Controller
public class TestController {
    private Logger logger = LoggerManager.getLogger(LoggerSystem.NET);

    @RequestMapping(path = "/test/start")
    @ResponseBody
    public Json request(String command){
        Json j = null;
        CodecFactory.MessageWrapper mw = CodecFactory.getInstance().getMessageWrapper(Short.valueOf(command));
        BaseMessage res = null;
        try {
            if(mw == null){
              logger.error("不存在的协议", command);
              j = Json.valueOf(ResConstant.DONT_EXIST);
            }else {
                res = (BaseMessage) mw.clazz.newInstance();
                List<String> target = PushHelper.sendAllOL(res);
                j = Json.valueOf(ResConstant.SUCCESS);
                j.setData(target);
            }
        } catch (Exception e){
            logger.error("发送协议出错{}", e);
            j = Json.valueOf(ResConstant.MISS_PARAM);
            j.setInfo(e.toString());
        }

        return j;
    }
}
