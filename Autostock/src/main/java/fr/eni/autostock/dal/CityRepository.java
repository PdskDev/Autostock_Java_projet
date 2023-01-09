package fr.eni.autostock.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.eni.autostock.bo.City;

public interface CityRepository extends JpaRepository<City, Long> {

}
