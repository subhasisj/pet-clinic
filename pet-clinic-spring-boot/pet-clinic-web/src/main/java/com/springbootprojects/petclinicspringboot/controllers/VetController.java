package com.springbootprojects.petclinicspringboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springbootprojects.petclinicspringboot.service.VetService;

@Controller
public class VetController {
	
	private final VetService vetService;
	
	protected VetController(VetService vetService) {
		this.vetService = vetService;
	}

	@RequestMapping({"/vets" , "/vets/index" ,"/vets/index.html"  })
	public String listOfVets( Model model) {
		
		model.addAttribute("vets", vetService.findAll());		
		return "vets/index";
	}

}
