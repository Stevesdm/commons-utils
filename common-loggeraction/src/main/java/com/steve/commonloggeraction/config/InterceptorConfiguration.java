package com.steve.commonloggeraction.config;

import com.steve.commonloggeraction.interceptor.LogActionInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @Description:
 * @Author: stevejobson
 * @CreateDate: 2017/11/23 下午3:40
 */
@Configuration
public class InterceptorConfiguration extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 多个拦截器组成一个拦截器链
        // addPathPatterns 用于添加拦截规则
        // excludePathPatterns 用户排除拦截
        registry.addInterceptor(new LogActionInterceptor()).addPathPatterns("/**");
        super.addInterceptors(registry);
    }

}
