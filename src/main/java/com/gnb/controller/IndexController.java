package com.gnb.controller;

import org.springframework.boot.autoconfigure.web.ErrorProperties;
import org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController implements ErrorController{

	private static final String PATH = "/error";
	
	@GetMapping(PATH)
	public String error() {
		return "error-handling";
	}
	
	@Override
	public String getErrorPath() {
		return PATH;
	}



}
