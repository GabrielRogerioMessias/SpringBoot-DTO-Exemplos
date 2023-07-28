package com.gabriel.dto.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabriel.dto.entities.User;
import com.gabriel.dto.entities.dto.UserDTO;
import com.gabriel.dto.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository repository;

	public UserDTO findById(Long id) {
		User user = repository.findById(id).get();
		UserDTO usDto = new UserDTO(user);
		return usDto;
	}

	public List<UserDTO> findAll() {
		List<User> listUser = repository.findAll();
		List<UserDTO> listDTO = listUser.stream().map(userList -> new UserDTO(userList)).collect(Collectors.toList());
		return listDTO;

	}

}
