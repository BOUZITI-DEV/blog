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

import ma.jee.projet.model.User;
import ma.jee.projet.repository.UserRepository;

@RestController
@RequestMapping("/api/user")
public class UserController {
	@Autowired
	private UserRepository userRepository;

	@GetMapping("/find/{id}")
	public User findById(@PathVariable(required = true) int id) {
		return userRepository.findById(id);
	}

	@GetMapping("/findAll")
	public List<User> findAll() {
		return userRepository.findAll();
	}

	@PostMapping("/save")
	public void save(@RequestBody(required = true) User user) {
		userRepository.save(user);
	}

	@PostMapping("/put")
	public void put(@RequestBody(required = true) User user) {
		userRepository.save(user);
	}

	@DeleteMapping("/delete")
	public void delete(@PathVariable(required = true) int id) {
		userRepository.delete(userRepository.findById(id));
	}

	@GetMapping("/count")
	public void count() {
		userRepository.count();
	}

}
