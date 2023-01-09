package fr.eni.autostock.bll;

import java.util.List;
import java.util.Optional;

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
		userRepository.save(user);
	}

	@Override
	public boolean deleteUser(long idUser) {
		User userToDelte = getUser(idUser);

		if (userToDelte != null) {
			userRepository.delete(userToDelte);
			return true;
		}
		return false;
	}

	@Override
	public User getUser(long idUser) {
		Optional<User> userCheck = userRepository.findById(idUser);

		if (userCheck.isEmpty())
			return null;

		return userCheck.get();
	}

	@Override
	public User getUserByCredential(String email, String password) {
		User userByEmailAndPassword = userRepository.findByLoginAndPassword(email, password);

		if (userByEmailAndPassword == null) {
			return null;
		}

		return userByEmailAndPassword;
	}

	@Override
	public List<Caddie> listUserCaddies(long idUser) {
		return caddieRepository.findByUser(idUser);
	}

	@Override
	public List<Gender> listGenders() {
		return genderRepository.findAll();
	}

	@Override
	public List<City> listCities() {
		return cityRepository.findAll();
	}

}
