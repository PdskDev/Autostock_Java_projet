package fr.eni.autostock.bll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.eni.autostock.bo.Brand;
import fr.eni.autostock.bo.Car;
import fr.eni.autostock.bo.Energy;
import fr.eni.autostock.bo.Option;
import fr.eni.autostock.dal.BrandRepository;
import fr.eni.autostock.dal.CarRepository;
import fr.eni.autostock.dal.EnergyRepository;
import fr.eni.autostock.dal.OptionRepository;
import fr.eni.autostock.service.CarService;

@Service
public class CarServiceImpl implements CarService {
	
	private CarRepository carRepository;
	private BrandRepository brandRepository;
	private EnergyRepository energyRepository;
	private OptionRepository optionRepository;

	@Autowired
	public CarServiceImpl(CarRepository carRepository, BrandRepository brandRepository,
			EnergyRepository energyRepository, OptionRepository optionRepository) {
		super();
		this.carRepository = carRepository;
		this.brandRepository = brandRepository;
		this.energyRepository = energyRepository;
		this.optionRepository = optionRepository;
	}

	@Override
	public void saveCar(Car car) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Car getCar(long idCar) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCar(long idCar) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Car> ListCars() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Brand> listBrands() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Energy> listEnergies() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Option> listOptions() {
		// TODO Auto-generated method stub
		return null;
	}

}
