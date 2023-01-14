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

import fr.eni.autostock.bo.User;
import fr.eni.autostock.service.UserService;

@Controller
@RequestMapping("/connexion")
@SessionAttributes({"listeVehiculesPanier", "nbCarInPanier"})
public class ConnexionController {
	
	
	@Autowired
	private UserService userService;
	
	@GetMapping
	public String loginForm() {

		return "connexion";
	}
	
	
	@PostMapping("/login")
	public String seConnecter(Model model, HttpSession session, @RequestParam(required = true) String email,
			@RequestParam(required = true) String password) {

		User userCheck = userService.getUserByCredential(email, password);

		if (userCheck != null) {
			session.setAttribute("userConnected", userCheck.getFirstName());
			
			System.out.println(userCheck.getFirstName());

			return "redirect:/";
		}
		
		model.addAttribute("msgLoginMotdePasseKO", "Adresse Email ou mot de passe erroné(e)!");
		return "connexion";
		
	}
	
	@GetMapping("/logout")
	public String seDeconnecter(Model model, HttpSession session) {
		
		session.invalidate();

		return "redirect:/";
	}

}
