package tn.esprit.spring.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity

public class likes {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private java.util.Date dateDislike;

	//@ManyToOne
	//private Post posts;
	@ManyToOne
	private Post posts;
	@ManyToOne
	private Employee employees;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public java.util.Date getDateDislike() {
		return dateDislike;
	}
	public void setDateDislike(java.util.Date dateDislike) {
		this.dateDislike = dateDislike;
	}
	public Post getPosts() {
		return posts;
	}
	public void setPosts(Post posts) {
		this.posts = posts;
	}
	public Employee getEmployees() {
		return employees;
	}
	public void setEmployees(Employee employees) {
		this.employees = employees;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}