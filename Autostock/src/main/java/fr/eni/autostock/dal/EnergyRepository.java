package fr.eni.autostock.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.eni.autostock.bo.Energy;

public interface EnergyRepository extends JpaRepository<Energy, Long> {

}
