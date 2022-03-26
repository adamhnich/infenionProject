package tn.esprit.spring.repository;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.Employee;
import tn.esprit.spring.entities.Post;
import tn.esprit.spring.entities.likes;
//import tn.esprit.spring.entities.like;
@Repository
public interface LikeRepository extends CrudRepository <likes, Integer> {

	
	}
