package com.ifxstudygroup.javaspringstarter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HealthCheckController {

	@GetMapping("/")
	public String index() {
		return "Hello World!";
	}

	@GetMapping("/health")
	public String health() {
		return "OK";
	}
}
