package com.formacionbdi.springboot.app.productos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringBootServicioProductos1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootServicioProductos1Application.class, args);
	}

}
