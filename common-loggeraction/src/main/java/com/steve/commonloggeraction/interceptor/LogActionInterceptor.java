package com.steve.commonloggeraction.interceptor;

import com.alibaba.fastjson.JSONObject;
import com.steve.commonloggeraction.annotation.LogActionAnnotation;
import com.steve.commonloggeraction.logrcollect.LogActionEngine;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

/**
 * @Description: 日志拦截器
 * @Author: stevejobson
 * @CreateDate: 2017/11/23 下午3:06
 */
public class LogActionInterceptor implements HandlerInterceptor {


    static JSONObject logActionJsonObject = null;

    static {
        logActionJsonObject = new JSONObject();
    }


    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        if (o instanceof HandlerMethod) {
            //获取HandlerMethod准备参数
            HandlerMethod handlerMethod = (HandlerMethod) o;
            final Method method = handlerMethod.getMethod();
            final LogActionAnnotation annotation = method.getAnnotation(LogActionAnnotation.class);
            if (annotation != null) {
                logAction(httpServletRequest, annotation, method);
            }
        }
    }


    private void logAction(HttpServletRequest request, LogActionAnnotation annotation, Method method) {


        logActionJsonObject.put("action", annotation.action());
        logActionJsonObject.put("module", annotation.module());
        logActionJsonObject.put("comment", annotation.comment());

        System.out.println(logActionJsonObject.toJSONString());

        //构造logAction对象,异步入库
        LogActionEngine.pushEvent(logActionJsonObject);
    }
}
