package fr.eni.autostock.service;


import java.util.List;


import fr.eni.autostock.bo.Car;


public interface PanierService {
	
	public List<Car> vehiclesInPanier();
	
	public Car getVehicleInPanier(long id);
	
	public void ajouterDansPanier(Car car);
	
	public int nbCarsInPanier();
	
	void effacerPanier();
	
	void retirerDuPanier(long id);
}
