package com.tp3.demo;

import com.tp3.demo.dao.UserDao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProyectoTp3Application {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoTp3Application.class, args);

		UserDao userDao = new UserDao();
		userDao.createAdmin();
	}

}
