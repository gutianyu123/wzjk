package com.wzjk;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan("com.wzjk.mapper")
@EnableSwagger2
public class WzjkApplication {

	public static void main(String[] args) {
		SpringApplication.run(WzjkApplication.class, args);
	}

}
