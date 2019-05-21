package com.wimblet.tistory.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WimController {

	@RequestMapping(value = "/string", method = RequestMethod.GET)
	public String getHomeString() {

		return "index";
	}

}
