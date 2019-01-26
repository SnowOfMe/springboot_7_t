package com.wkcto.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@EnableRedisHttpSession
@SpringBootApplication
public class Application9090 {

	public static void main(String[] args) {
		SpringApplication.run(Application9090.class, args);
	}
}
