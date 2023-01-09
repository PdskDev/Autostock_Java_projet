package fr.eni.autostock.bll;

import java.util.List;
import java.util.Optional;

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
		carRepository.save(car);
	}

	@Override
	public Car getCar(long idCar) {
		Optional<Car> carCheck = carRepository.findById(idCar);

		if (carCheck.isEmpty())
			return null;
		return carCheck.get();
	}

	@Override
	public boolean deleteCar(long idCar) {
		
		Car carToDelte = getCar(idCar);

		if (carToDelte != null) {
			carRepository.delete(carToDelte);
			return true;
		}
		return false;
	}

	@Override
	public List<Car> ListCars() {
		return carRepository.findAll();
	}

	@Override
	public List<Brand> listBrands() {
		return brandRepository.findAll();
	}

	@Override
	public List<Energy> listEnergies() {
		return energyRepository.findAll();
	}

	@Override
	public List<Option> listOptions() {
		return optionRepository.findAll();
	}

}
