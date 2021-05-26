package com.simple.jaeho;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/ABC")
public class ABController {

	@RequestMapping("/Afile")
	public void Afile() {
		System.out.println("½ÇÇà");
	}
	
	@RequestMapping(value="/form",method=RequestMethod.POST)
	public String form(@RequestParam("uId") String id,
			@RequestParam("uPw") String pw) {
		
		System.out.println(id);
		System.out.println(pw);
		return "redirect:/";
	}
}
