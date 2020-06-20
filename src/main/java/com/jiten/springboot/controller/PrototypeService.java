package com.jiten.springboot.controller;

import java.time.LocalDateTime;
import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class PrototypeService {
	
	private String dateTime = LocalDateTime.now().toString();
	public String getMethod() {
		return "PrototypeService : " + dateTime;
	}

}
