package com.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.app.customexception.ResourseNotFoundException;
import com.app.dto.ApiResponse;
import com.app.dto.LoginRequestDto;
import com.app.entities.User;
import com.app.service.UserService;



@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userservice;
	
	@GetMapping
	public List<User> getUsers(){
		return userservice.getAllUsers();
	}
	@GetMapping("/{userId}")
	public Optional<User> getUserById(@PathVariable Integer userId) {
		return Optional.of(userservice.getUserDetailById(userId).orElseThrow(()->new ResourseNotFoundException("User not found")));
	}
	@PostMapping
	public User addUser(@RequestBody User user) {
		return userservice.addUserDetails(user);
	}
	@DeleteMapping("/{userId}")
	public ApiResponse deleteUser(@PathVariable Integer userId) {
		return new ApiResponse(userservice.deleteUserDetails(userId));
	}
	@PostMapping("/login")
	public ResponseEntity<?> userLogin(@RequestBody LoginRequestDto dto){
		return ResponseEntity.ok(userservice.validateUser(dto));
	}
}
