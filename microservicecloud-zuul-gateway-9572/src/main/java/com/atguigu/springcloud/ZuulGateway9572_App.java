package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ZuulGateway9572_App {

	public static void main(String[] args)
	  {
	   SpringApplication.run(ZuulGateway9572_App.class, args);
	  }
}
