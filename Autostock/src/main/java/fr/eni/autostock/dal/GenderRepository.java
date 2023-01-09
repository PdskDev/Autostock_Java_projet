package fr.eni.autostock.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.eni.autostock.bo.Gender;

public interface GenderRepository extends JpaRepository<Gender, Long> {

}
