package fr.eni.autostock.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import fr.eni.autostock.bo.User;
import fr.eni.autostock.service.UserService;

@Controller
@RequestMapping("/user")
@SessionAttributes({ "listeGenres", "listeVilles", "listeVehiculesPanier", "nbCarInPanier"})
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/inscription")
	public String inscription(Model model) {

		model.addAttribute("listeGenres", userService.listGenders());
		model.addAttribute("listeVilles", userService.listCities());

		return "inscription";
	}


	@PostMapping("/inscription")
	public String signup(Model model, RedirectAttributes redirectAttrs,
			@ModelAttribute("user") @RequestParam(required = true) String gender,
			@RequestParam(required = true) String lastName, @RequestParam(required = true) String firstName,
			@RequestParam(required = true) String email, @RequestParam(required = true) String phone,
			@RequestParam(required = true) String password, @RequestParam(required = true) String confirmPassword,
			@RequestParam(required = true) String adresse, @RequestParam(required = true) String codePostal,
			@RequestParam(required = true) String city) {

		if (password.equals(confirmPassword)) {
			User newUser = new User();

			newUser.setGender(gender);
			newUser.setFirstName(firstName);
			newUser.setLastName(lastName);
			newUser.setEmail(email);
			newUser.setPhone(phone);
			newUser.setPassword(password);
			newUser.setAdresse(adresse);
			newUser.setCodePostal(codePostal);
			newUser.setCity(city);

			System.out.println(newUser);

			redirectAttrs.addFlashAttribute("msgInscriptionOK", "Vous ??tes d??sormais inscrit(e) sur le site.");

			// model.addAttribute("msgInscriptionOK", "Vous ??tes d??sormais inscrit sur le
			// site.");

			userService.saveUser(newUser);

			return "redirect:/";
		}

		model.addAttribute("msgPasswordNotEqual", "Les mots de passe saisis sont diff??rents");

		return "inscription";
	}

	

}
