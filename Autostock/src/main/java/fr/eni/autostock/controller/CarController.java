package fr.eni.autostock.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.eni.autostock.bo.Car;
import fr.eni.autostock.service.CarService;

@Controller
@RequestMapping("/vehicules")
public class CarController {
	
	@Autowired
	private CarService carService;
	
	@GetMapping
	public String listeVehiculesRoute(Model model) {
		
		model.addAttribute("listeVehicules", carService.ListCars());
		return "liste_vehicules";
	}
	
	@GetMapping("/add")
	public String addVehiculeRoute(Model model) {
		
		
		model.addAttribute("listeMarques", carService.listBrands());
		model.addAttribute("listeOptions", carService.listOptions());
		model.addAttribute("listeEnergies", carService.listEnergies());
		
		
		return "ajouter_vehicule";
	}
	
	@PostMapping("/add")
	public String saveVehiculeRoute(@ModelAttribute("newCar") Car newCar) {
		
		carService.saveCar(newCar);
		
		
		return "redirect:/vehicules";
	}

}
