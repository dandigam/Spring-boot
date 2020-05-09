package com.rest.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleRestController {

	@GetMapping("/welcome-msg")
	public String getMessage() {

		return "Welcome to spring boot!!!";
	}

}
