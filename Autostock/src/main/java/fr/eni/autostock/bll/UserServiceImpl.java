package fr.eni.autostock.bll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.eni.autostock.bo.Caddie;
import fr.eni.autostock.bo.City;
import fr.eni.autostock.bo.Gender;
import fr.eni.autostock.bo.User;
import fr.eni.autostock.dal.CaddieRepository;
import fr.eni.autostock.dal.CityRepository;
import fr.eni.autostock.dal.GenderRepository;
import fr.eni.autostock.dal.UserRepository;
import fr.eni.autostock.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	private UserRepository userRepository;
	private CaddieRepository caddieRepository;
	private GenderRepository genderRepository;
	private CityRepository cityRepository;

	@Autowired
	public UserServiceImpl(UserRepository userRepository, CaddieRepository caddieRepository,
			GenderRepository genderRepository, CityRepository cityRepository) {
		super();
		this.userRepository = userRepository;
		this.caddieRepository = caddieRepository;
		this.genderRepository = genderRepository;
		this.cityRepository = cityRepository;
	}

	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser(long idUser) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User getUser(long idUser) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserByCredential(String email, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Caddie> listUserCaddies(long idUser) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Gender> listGenders() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<City> listCities() {
		// TODO Auto-generated method stub
		return null;
	}

}
