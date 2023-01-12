package fr.eni.autostock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller("/connexion")
@SessionAttributes({"listeVehiculesPanier", "nbCarInPanier"})
public class ConnexionController {

}
