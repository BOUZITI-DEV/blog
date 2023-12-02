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

import ma.jee.projet.model.Post;
import ma.jee.projet.repository.PostRepository;

@RestController
@RequestMapping("/api/post")
public class PostController {
	@Autowired
	private PostRepository postRepository;

	@GetMapping("/find/{id}")
	public Post findById(@PathVariable(required = true) int id) {
		return postRepository.findById(id);
	}

	@GetMapping("/findAll")
	public List<Post> findAll() {
		return postRepository.findAll();
	}

	@PostMapping("/save")
	public void save(@RequestBody(required = true) Post post) {
		postRepository.save(post);
	}

	@PostMapping("/put")
	public void put(@RequestBody(required = true) Post post) {
		postRepository.save(post);
	}

	@DeleteMapping("/delete")
	public void delete(@PathVariable(required = true) int id) {
		postRepository.delete(postRepository.findById(id));
	}

	@GetMapping("/count")
	public void count() {
		postRepository.count();
	}

}
