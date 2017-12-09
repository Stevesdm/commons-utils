package com.steve.commonloggeraction.logrcollect;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * @Description: 收集日志
 * @Author: stevejobson
 * @CreateDate: 2017/11/23 下午3:09
 */
@Component
public class LogActionEngine implements Runnable {

    private static final Logger logger = LoggerFactory.getLogger(LogActionEngine.class);

    private static LinkedBlockingQueue<JSONObject> queue = new LinkedBlockingQueue<>();
    private static boolean terminate = false;
    private static int timeout = 10;


    public static void pushEvent(JSONObject logAction) {
        try {
            queue.put(logAction);
        } catch (Exception e) {
            logger.error("pushEvent error", e);
        }
    }

    public void run() {
        while (!terminate) {
            try {
                JSONObject jsonObject = queue.poll(timeout, TimeUnit.SECONDS);
                logger.info(jsonObject.toJSONString());
            } catch (Exception e) {
                logger.error("save log index exception:", e);
            }
        }
    }
}
