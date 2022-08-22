package com.andikscript.springcachepostgre;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringCachePostgreApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCachePostgreApplication.class, args);
	}

}
