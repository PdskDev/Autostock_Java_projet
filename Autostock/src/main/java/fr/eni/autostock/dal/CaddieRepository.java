package fr.eni.autostock.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.eni.autostock.bo.Caddie;

public interface CaddieRepository extends JpaRepository<Caddie, Long> {

}
