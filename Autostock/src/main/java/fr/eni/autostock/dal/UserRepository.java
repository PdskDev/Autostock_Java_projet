package fr.eni.autostock.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.eni.autostock.bo.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByLoginAndPassword(String login, String password);

}
