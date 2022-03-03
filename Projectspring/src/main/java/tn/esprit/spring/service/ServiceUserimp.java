package tn.esprit.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.User;
import tn.esprit.spring.repository.UserRepository;
@Service
public class ServiceUserimp implements IServiceUser {
	@Autowired
	UserRepository repo;

	@Override
	public User addUser(User user) {
		
		return repo.save(user);}

}
