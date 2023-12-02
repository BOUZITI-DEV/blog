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

import ma.jee.projet.model.Comment;
import ma.jee.projet.repository.CommentRepository;

@RestController
@RequestMapping("/api/comment")
public class CommentController {
	@Autowired
	private CommentRepository commentRepository;

	@GetMapping("/find/{id}")
	public Comment findById(@PathVariable(required = true) int id) {
		return commentRepository.findById(id);
	}

	@GetMapping("/findAll")
	public List<Comment> findAll() {
		return commentRepository.findAll();
	}

	@PostMapping("/save")
	public void save(@RequestBody(required = true) Comment comment) {
		commentRepository.save(comment);
	}

	@PostMapping("/put")
	public void put(@RequestBody(required = true) Comment comment) {
		commentRepository.save(comment);
	}

	@DeleteMapping("/delete")
	public void delete(@PathVariable(required = true) int id) {
		commentRepository.delete(commentRepository.findById(id));
	}

	@GetMapping("/count")
	public void count() {
		commentRepository.count();
	}

}
