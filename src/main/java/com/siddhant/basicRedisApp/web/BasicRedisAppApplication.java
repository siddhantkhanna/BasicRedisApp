package com.siddhant.basicRedisApp.web;

import com.siddhant.basicRedisApp.service.DataService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@SpringBootApplication(scanBasePackages={"com.siddhant.basicRedisApp"})
@EnableAutoConfiguration
public class BasicRedisAppApplication {
	public static void main(String[] args) {
		SpringApplication.run(BasicRedisAppApplication.class, args);
	}
}
