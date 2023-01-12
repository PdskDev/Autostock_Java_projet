package fr.eni.autostock.bll;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.eni.autostock.bo.Car;
import fr.eni.autostock.service.CarService;
import fr.eni.autostock.service.PanierService;


@Service
public class PanierServiceImpl implements PanierService {
	
	private static List<Car> listeCarPanier;
	
	@Autowired
	private CarService carService;
	

	public PanierServiceImpl() {
		super();
		listeCarPanier = new ArrayList<>(); 
	}

	@Override
	public List<Car> vehiclesInPanier() {
		
		return listeCarPanier;
	}

	@Override
	public Car getVehicleInPanier(long id) {
		for (Car vehicule : listeCarPanier) {
			if (vehicule.getId() == id) {
				return vehicule;
			}
		}
		return null;
	}

	@Override
	public void ajouterDansPanier(Car car) {
		listeCarPanier.add(car);
	}

	@Override
	public int nbCarsInPanier() {
		
		return listeCarPanier.size();
	}

	@Override
	public void effacerPanier() {
		listeCarPanier.clear();
		
	}

	@Override
	public void retirerDuPanier(long id) {
		/*
		 * for (Car car : listeCarPanier) { if (car.getId() == id) {
		 * 
		 * listeCarPanier.remove(car); System.out.println(car); } }
		 */
		
		Car carDemande = carService.getCar(id);
		 
		boolean isRemoved = listeCarPanier.remove(carDemande);
		
		System.out.println(isRemoved);
		
		
	}

}
