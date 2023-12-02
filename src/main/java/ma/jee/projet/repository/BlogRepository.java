package ma.jee.projet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.jee.projet.model.Blog;

public interface BlogRepository extends JpaRepository<Blog, Integer> {
	Blog findById(int id);
}
