package ma.jee.projet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.jee.projet.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	User findById(int id);
}
