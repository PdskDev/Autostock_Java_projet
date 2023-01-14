package fr.eni.autostock.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import fr.eni.autostock.bo.Car;
import fr.eni.autostock.service.CarService;
import fr.eni.autostock.service.PanierService;

@Controller
@RequestMapping("/panier")
@SessionAttributes({"nbCarInPanier"})
public class CaddieController {
	
	@Autowired
	private PanierService panierService;
	
	@Autowired
	private CarService carService;
	
	
	@GetMapping
	public String afficherPanier(Model model, HttpSession session) {

		model.addAttribute("listeVehiculesPanier", panierService.vehiclesInPanier());
		model.addAttribute("nbCarInPanier", panierService.nbCarsInPanier());

		return "panier";
	}

	@PostMapping
	public String ajouterPanier(Model model, HttpSession session, @RequestParam(required = true) String marque,
			@RequestParam(required = true) String ref_id) {
		Car carChoisi = carService.getCar(Long.parseLong(ref_id));

		panierService.ajouterDansPanier(carChoisi);

		model.addAttribute("nbCarInPanier", panierService.nbCarsInPanier());

		return "redirect:/panier";
	}

	@PostMapping("/vider")
	public String viderPanier(Model model, HttpSession session) {

		panierService.effacerPanier();

		model.addAttribute("listeVehiculesPanier", "");
		model.addAttribute("nbCarInPanier", 0);

		return "panier";
	}

	@PostMapping("/retirer")
	public String retirerDuPanier(Model model, HttpSession session, @RequestParam(required = true) long car_id) {

		panierService.retirerDuPanier(car_id);

		return "redirect:/panier";
	}
	
	

}
