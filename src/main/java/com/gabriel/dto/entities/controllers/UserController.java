package com.gabriel.dto.entities.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gabriel.dto.entities.dto.UserDTO;
import com.gabriel.dto.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserController {
	@Autowired
	private UserService service;

	@GetMapping("/{id}")
	public ResponseEntity<UserDTO> findByID(@PathVariable Long id) {
		UserDTO user = service.findById(id);
		return ResponseEntity.ok().body(user);
	}
	
	@GetMapping
	public ResponseEntity<List<UserDTO>> findAll(){
		List<UserDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
