package ma.jee.projet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.jee.projet.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
	Role findById(int id);
}
