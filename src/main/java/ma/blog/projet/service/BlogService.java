package ma.blog.projet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.jee.projet.model.Blog;
import ma.jee.projet.repository.BlogRepository;

@Service
public class BlogService {
	@Autowired
	private BlogRepository blogRepository;

	public Blog findById(int id) {
		return blogRepository.findById(id);
	}

	public List<Blog> findAll() {
		return blogRepository.findAll();
	}

	public void save(Blog blog) {
		blogRepository.save(blog);
	}

	public void put(Blog blog) {
		blogRepository.save(blog);
	}

	public void delete(int id) {
		blogRepository.delete(blogRepository.findById(id));
	}

	public long count() {
		return blogRepository.count();
	}
}
