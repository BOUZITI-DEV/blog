package ma.jee.projet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.jee.projet.model.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {
	Post findById(int id);
}
