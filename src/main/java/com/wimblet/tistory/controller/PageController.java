package com.wimblet.tistory.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

	@RequestMapping(value = "/home")
	public String home() {

		return "index";
	}
}