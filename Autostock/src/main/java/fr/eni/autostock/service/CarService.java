package fr.eni.autostock.service;

import java.util.List;

import fr.eni.autostock.bo.Brand;
import fr.eni.autostock.bo.Car;
import fr.eni.autostock.bo.Energy;
import fr.eni.autostock.bo.Option;

public interface CarService {
	
	void saveCar(Car car);
	Car getCar(long idCar);
	boolean deleteCar(long idCar);
	
	
	List<Car> ListCars();
	
	List<Brand> listBrands();
	List<Energy> listEnergies();
	List<Option> listOptions();
}
