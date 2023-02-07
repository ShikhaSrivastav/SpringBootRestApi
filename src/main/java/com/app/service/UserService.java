package com.app.service;


import java.util.List;
import java.util.Optional;

import com.app.dto.LoginRequestDto;
import com.app.dto.UserSpecificDetails;
import com.app.entities.User;

public interface UserService {

	List<User> getAllUsers();

	Optional<User> getUserDetailById(Integer userId);

	User addUserDetails(User user);

	String deleteUserDetails(Integer userId);

	UserSpecificDetails validateUser(LoginRequestDto dto);

}
