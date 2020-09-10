package com.echotech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.echotech.model.User;
import com.echotech.repository.InterfaceUser;




@RestController
@RequestMapping("/User")
public class UserController {

	@Autowired
	private InterfaceUser userRepository;
	
	@GetMapping
	public List<User> listaUsuarios()
	{
		return (List<User>) userRepository.findAll();
	}
	@PostMapping
	public void insert(@RequestBody User usuario)
	{
		userRepository.save(usuario);
	}
	@PutMapping
	public void modificar(@RequestBody User usuario) {
		userRepository.save(usuario);
	}
	@DeleteMapping(value = "/{id}")
	public void eliminar(@PathVariable("id") Integer id)
	{
		userRepository.deleteById(id);
	}
} 
