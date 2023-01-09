package fr.eni.autostock.bll;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.eni.autostock.bo.Caddie;
import fr.eni.autostock.bo.CaddieItem;
import fr.eni.autostock.dal.CaddieItemRepository;
import fr.eni.autostock.dal.CaddieRepository;
import fr.eni.autostock.service.CaddieService;

@Service
public class CaddieServiceImpl implements CaddieService {

	private CaddieRepository caddieRepository;
	private CaddieItemRepository caddieItemRepository;

	@Autowired
	public CaddieServiceImpl(CaddieRepository caddieRepository, CaddieItemRepository caddieItemRepository) {
		super();
		this.caddieRepository = caddieRepository;
		this.caddieItemRepository = caddieItemRepository;
	}

	@Override
	public void saveCaddie(Caddie caddie) {
		caddieRepository.save(caddie);
	}

	@Override
	public boolean ifCaddieExist(long idCaddie) {

		Optional<Caddie> caddieCheck = caddieRepository.findById(idCaddie);

		if (caddieCheck.isEmpty())
			return false;

		return true;
	}

	@Override
	public Caddie getCaddie(long idCaddie) {
		
		Optional<Caddie> caddieCheck = caddieRepository.findById(idCaddie);

		if (caddieCheck.isPresent())
			return caddieCheck.get();

		return null;
	}

	@Override
	public List<Caddie> listCaddie() {
		return caddieRepository.findAll();
	}

	@Override
	public List<CaddieItem> listCaddieItem(long idCaddie) {
		return caddieItemRepository.findAll();
	}

}
