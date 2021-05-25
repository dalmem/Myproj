package com.simple.jaeho;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ABC")
public class ABController {

	@RequestMapping("/Afile")
	public void Afile() {
		System.out.println("½ÇÇà");
	}
}
