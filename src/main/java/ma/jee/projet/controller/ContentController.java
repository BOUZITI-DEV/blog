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

import ma.jee.projet.model.Content;
import ma.jee.projet.repository.ContentRepository;

@RestController
@RequestMapping("/api/content")
public class ContentController {
	@Autowired
	private ContentRepository contentRepository;

	@GetMapping("/find/{id}")
	public Content findById(@PathVariable(required = true) int id) {
		return contentRepository.findById(id);
	}

	@GetMapping("/findAll")
	public List<Content> findAll() {
		return contentRepository.findAll();
	}

	@PostMapping("/save")
	public void save(@RequestBody(required = true) Content content) {
		contentRepository.save(content);
	}

	@PostMapping("/put")
	public void put(@RequestBody(required = true) Content content) {
		contentRepository.save(content);
	}

	@DeleteMapping("/delete")
	public void delete(@PathVariable(required = true) int id) {
		contentRepository.delete(contentRepository.findById(id));
	}

	@GetMapping("/count")
	public void count() {
		contentRepository.count();
	}

}
