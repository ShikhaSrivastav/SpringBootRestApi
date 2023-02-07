package com.app.service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.customexception.ResourseNotFoundException;
import com.app.dto.LoginRequestDto;
import com.app.dto.UserSpecificDetails;
import com.app.entities.User;
import com.app.repository.UserRepository;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private ModelMapper mapper;
	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

	@Override
	public Optional<User> getUserDetailById(Integer userId) {
		// TODO Auto-generated method stub
		return userRepo.findById(userId);
	}
	@Override
	public User addUserDetails(User user) {
		return userRepo.save(user);
	}
	@Override
	public String deleteUserDetails(Integer userId) {
		if(userRepo.existsById(userId)) {
		userRepo.deleteById(userId);
		return "user deleted";
		}
		return "Deletion Failed";
	}

	@Override
	public UserSpecificDetails validateUser(LoginRequestDto dto) {
		
//		User user=userRepo.findByEmailAndPassword(dto.getEmail(),dto.getPassword()).orElseThrow(()->new
//				 ResourseNotFoundException("Bad Credentials!!!!!!!!!"));
		User user = userRepo.findByEmailAndPassword(dto.getEmail(),dto.getPassword()).orElseThrow(()-> new ResourseNotFoundException("bad credentials"));
		return mapper.map(user,UserSpecificDetails.class);
	}

}
