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

import ma.jee.projet.model.Blog;
import ma.jee.projet.repository.BlogRepository;

@RestController
@RequestMapping("/api/blog")
public class BlogController {
	@Autowired
	private BlogRepository blogRepository;

	@GetMapping("/find/{id}")
	public Blog findById(@PathVariable(required = true) int id) {
		return blogRepository.findById(id);
	}

	@GetMapping("/findAll")
	public List<Blog> findAll() {
		return blogRepository.findAll();
	}

	@PostMapping("/save")
	public void save(@RequestBody(required = true) Blog blog) {
		blogRepository.save(blog);
	}

	@PostMapping("/put")
	public void put(@RequestBody(required = true) Blog blog) {
		blogRepository.save(blog);
	}

	@DeleteMapping("/delete")
	public void delete(@PathVariable(required = true) int id) {
		blogRepository.delete(blogRepository.findById(id));
	}

	@GetMapping("/count")
	public void count() {
		blogRepository.count();
	}

}
