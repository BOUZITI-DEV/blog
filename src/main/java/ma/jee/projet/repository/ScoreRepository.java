package ma.jee.projet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.jee.projet.model.Score;

public interface ScoreRepository extends JpaRepository<Score, Integer> {
	Score findById(int id);
}
