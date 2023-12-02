package ma.jee.projet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.jee.projet.model.Score;
import ma.jee.projet.repository.ScoreRepository;

@RestController
@RequestMapping("/api/score")
public class ScoreController {
	@Autowired
	private ScoreRepository scoreRepository;

	@GetMapping("/find/{id}")
	public Score findById(@PathVariable(required = true) int id) {
		return scoreRepository.findById(id);
	}

	@GetMapping("/findAll")
	public List<Score> findAll() {
		return scoreRepository.findAll();
	}

	@PostMapping("/save")
	public void save(@RequestBody(required = true) Score score) {
		scoreRepository.save(score);
	}

	@PostMapping("/put")
	public void put(@RequestBody(required = true) Score score) {
		scoreRepository.save(score);
	}

	@DeleteMapping("/delete")
	public void delete(@PathVariable(required = true) int id) {
		scoreRepository.delete(scoreRepository.findById(id));
	}

	@GetMapping("/count")
	public void count() {
		scoreRepository.count();
	}

}
