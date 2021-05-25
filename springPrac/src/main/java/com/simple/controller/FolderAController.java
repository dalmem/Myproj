package com.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/FolderA")
public class FolderAController {

	
	@RequestMapping(value="/abc")
	public String abc() {
		System.out.println("½ÇÇà");
		return "request/abc";
	}
}
