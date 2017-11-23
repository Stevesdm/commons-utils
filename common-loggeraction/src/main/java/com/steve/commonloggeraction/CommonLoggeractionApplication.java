package com.steve.commonloggeraction;

import com.steve.commonloggeraction.logrcollect.LogActionEngine;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CommonLoggeractionApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(CommonLoggeractionApplication.class, args);
		Thread logThread = new Thread(ctx.getBean(LogActionEngine.class));
		//启动线程收集日志
		logThread.start();
	}
}
