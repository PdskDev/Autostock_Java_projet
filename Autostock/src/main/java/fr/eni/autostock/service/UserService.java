package fr.eni.autostock.service;

import java.util.List;

import fr.eni.autostock.bo.Caddie;
import fr.eni.autostock.bo.City;
import fr.eni.autostock.bo.Gender;
import fr.eni.autostock.bo.User;

public interface UserService {
	
	void saveUser(User user);
	boolean deleteUser(long idUser);
	User getUser(long idUser);
	User getUserByCredential(String email, String password);
	
	List<Caddie> listUserCaddies(long idUser);
	List<Gender> listGenders();
	List<City> listCities();
	
}