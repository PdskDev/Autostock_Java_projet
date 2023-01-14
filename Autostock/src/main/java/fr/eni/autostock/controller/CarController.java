package fr.eni.autostock.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import fr.eni.autostock.bo.Car;
import fr.eni.autostock.bo.Option;
import fr.eni.autostock.service.CarService;
//import fr.eni.autostock.service.PanierService;

@Controller
@RequestMapping("/vehicules")
@SessionAttributes({ "listeVehicules", "listeVehiculesPanier", "nbCarInPanier" })
public class CarController {

	@Autowired
	private CarService carService;

	/*
	 * @Autowired private PanierService panierService;
	 */

	@GetMapping
	public String listeVehiculesRoute(Model model) {

		model.addAttribute("listeVehicules", carService.ListCars());
		return "liste_vehicules";
	}

	@GetMapping("/add")
	public String addVehiculeRoute(Model model, HttpSession session) {
		
		boolean userIsLogged = loggedOrRedirect(session);

		if (userIsLogged) {
			
			model.addAttribute("listeMarques", carService.listBrands());
			model.addAttribute("listeOptions", carService.listOptions());
			model.addAttribute("listeEnergies", carService.listEnergies());

			return "ajouter_vehicule";
		}
		
		return "redirect:/connexion";
	}

	@PostMapping("/add")
	public String saveVehiculeRoute(HttpSession session, @ModelAttribute("car") @RequestParam(required = true) String brand,
			@RequestParam(required = true) String model, @RequestParam(required = true) String energy,
			@RequestParam(required = true) String picture, @RequestParam(required = true) int price,
			@RequestParam(required = false) Long opt1, @RequestParam(required = false) Long opt2,
			@RequestParam(required = false) Long opt3, @RequestParam(required = false) Long opt4) {
		
		boolean userIsLogged = loggedOrRedirect(session);

		if (userIsLogged) {
			
			List<Option> listOptionsVehicule = new ArrayList<>();

			if (opt1 == 1 && opt1 != null) {
				listOptionsVehicule.add(carService.getOption(opt1));
			} 

			if (opt2 == 2 && opt2 != null) {
				listOptionsVehicule.add(carService.getOption(opt2));
			}

			if (opt3 == 3 && opt3 != null) {
				listOptionsVehicule.add(carService.getOption(opt3));
			}

			if (opt4 == 4 && opt4 != null) {
				listOptionsVehicule.add(carService.getOption(opt4));
			}

			Car newCar = new Car();

			newCar.setBrand(brand);
			newCar.setModel(model);
			newCar.setEnergy(energy);
			//newCar.setOptions(listOptionsVehicule);
			newCar.setPicture(picture);
			newCar.setPrice(price);
			newCar.setOptionOpt(3);

			carService.saveCar(newCar);

			return "redirect:/vehicules";
		}
		
		return "redirect:/user/connexion";
	}

	

	private boolean loggedOrRedirect(HttpSession session) {

		if (session.getAttribute("userConnected") == null) {

			return false;
		}
		return true;
	}

}
