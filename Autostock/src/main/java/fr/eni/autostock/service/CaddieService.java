package fr.eni.autostock.service;

import java.util.List;

import fr.eni.autostock.bo.Caddie;
import fr.eni.autostock.bo.CaddieItem;

public interface CaddieService {
	
	void saveCaddie(Caddie caddie);
	boolean ifCaddieExist(long idCaddie);
	Caddie getCaddie(long idCaddie);
	
	List<Caddie> listCaddie();
	List<CaddieItem> listCaddieItem(long idCaddie);

}
