package fr.eni.autostock.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.eni.autostock.bo.Car;

public interface CarRepository extends JpaRepository<Car, Long> {

}
