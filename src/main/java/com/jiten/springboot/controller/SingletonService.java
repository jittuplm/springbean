package com.jiten.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SingletonService {
	@Autowired
	PrototypeService proto;
	
	public String getMethod() {
		return proto.getMethod();
	}

}
