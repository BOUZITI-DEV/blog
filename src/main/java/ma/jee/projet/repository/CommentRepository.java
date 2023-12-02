package ma.jee.projet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.jee.projet.model.Comment;

public interface CommentRepository extends JpaRepository<Comment, Integer> {
	Comment findById(int id);
}
