package ma.jee.projet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.jee.projet.model.Content;

public interface ContentRepository extends JpaRepository<Content, Integer> {
	Content findById(int id);
}
