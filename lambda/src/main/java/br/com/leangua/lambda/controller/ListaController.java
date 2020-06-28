package br.com.leangua.lambda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ListaController {

	@RequestMapping("/")
	@ResponseBody
	public String hello() {
		return "Hello World";
	}
}
