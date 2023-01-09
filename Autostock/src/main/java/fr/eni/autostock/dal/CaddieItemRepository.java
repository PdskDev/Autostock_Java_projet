package fr.eni.autostock.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.eni.autostock.bo.CaddieItem;

public interface CaddieItemRepository extends JpaRepository<CaddieItem, Long> {

}
