package com.springbootprojects.petclinicspringboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springbootprojects.petclinicspringboot.service.OwnerService;

@RequestMapping("/owners")
@Controller
public class OwnerController {
	
	private final OwnerService ownerService;
	
	@RequestMapping({"","/" , "/index" ,"/index.html"  })
	public String listOfOwners( Model model ) {
		
		model.addAttribute("owners", ownerService.findAll());
		return "owners/index";
	}

	public OwnerController(OwnerService ownerService) {
		this.ownerService = ownerService;
	}

}
