package fr.eni.autostock.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.eni.autostock.bo.Brand;

public interface BrandRepository extends JpaRepository<Brand, Long> {

}
