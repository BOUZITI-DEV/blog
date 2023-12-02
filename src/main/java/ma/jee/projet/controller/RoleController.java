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

import ma.jee.projet.model.Role;
import ma.jee.projet.repository.RoleRepository;

@RestController
@RequestMapping("/api/role")
public class RoleController {
	@Autowired
	private RoleRepository roleRepository;

	@GetMapping("/find/{id}")
	public Role findById(@PathVariable(required = true) int id) {
		return roleRepository.findById(id);
	}

	@GetMapping("/findAll")
	public List<Role> findAll() {
		return roleRepository.findAll();
	}

	@PostMapping("/save")
	public void save(@RequestBody(required = true) Role role) {
		roleRepository.save(role);
	}

	@PostMapping("/put")
	public void put(@RequestBody(required = true) Role role) {
		roleRepository.save(role);
	}

	@DeleteMapping("/delete")
	public void delete(@PathVariable(required = true) int id) {
		roleRepository.delete(roleRepository.findById(id));
	}

	@GetMapping("/count")
	public void count() {
		roleRepository.count();
	}

}
