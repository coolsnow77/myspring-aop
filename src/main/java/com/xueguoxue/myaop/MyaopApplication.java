package com.xueguoxue.myaop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.xueguoxue.myaop"})
//强制使用cglib 代理
//@EnableAspectJAutoProxy(proxyTargetClass = true)
@EnableCaching
public class MyaopApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyaopApplication.class, args);
	}
}
