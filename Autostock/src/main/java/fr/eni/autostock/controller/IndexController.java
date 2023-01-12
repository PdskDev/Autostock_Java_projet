package fr.eni.autostock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping("/")
@SessionAttributes({"listeVehiculesPanier", "nbCarInPanier"})
public class IndexController {

	@GetMapping
	public String index() {
		return "index";
	}

	@GetMapping("/inscription")
	public String listeVehicules() {

		return "redirect:/user/inscription";
	}

}
