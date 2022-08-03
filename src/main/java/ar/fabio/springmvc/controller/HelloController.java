package ar.fabio.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	@RequestMapping("/hello")
	public String hola() {		
		// esta es la vista de retorno que necesitamos
		return "hello";		
	}
	
	@RequestMapping("/ping")
	public String ping() {
		return "pong";
	}
}
