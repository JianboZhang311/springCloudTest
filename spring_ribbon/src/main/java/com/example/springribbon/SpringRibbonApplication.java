package com.example.springribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan("com.test")
public class SpringRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRibbonApplication.class, args);
	}

	@Bean
	@LoadBalanced  //做负载均衡
	RestTemplate restTemplate(){
		return new RestTemplate();
	}

}
