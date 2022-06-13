package com.example.demo.rest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
@RequestMapping("")
public class Controlador {
	
	@GetMapping("/")
	public String iniciar(Model model) {
		model.addAttribute("titulo","FORMULARIO DE ACCESO");
		return "login";			
	}
	
	@PostMapping("/")
	public String login(Usuario usuario,Model model) {
		if(usuario.getNombre().equals("edu") && usuario.getPassword().equals("edu"))
			return "consulta";
		else
			return "login";
	}
			
}
