package com.jiten.springboot.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Testing sample for spring scopes - prototype in singleton
 * prototype in singleton to create multiple beans using Lookup annotation
 * @author jitendranath
 *
 */
@RestController
@RequestMapping("/v1/scopes")
public class ScopeController {
	
	@Autowired
	private SingletonService single;
	
	@GetMapping("/sample")
	public List<String> getSingletonScope() throws InterruptedException{
		String first = single.getMethod();
		Thread.sleep(1000);
		String second = single.getMethod();
		return Arrays.asList(first,second);
	}
}
