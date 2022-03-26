package tn.esprit.spring.entities;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity

public class Post {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPost;
	private String title, body;
	@JsonFormat(pattern = "yyyy-MM-dd", shape = Shape.STRING)
	@Column(name="datePost")
	private Date datePost;
	 
	@OneToMany(cascade = CascadeType.REMOVE, mappedBy = "posts")
	private Set<Comment> comments;
	
	@ManyToOne
	private Employee employees;
	
	@OneToMany(cascade = CascadeType.REMOVE, mappedBy = "posts")
	private Set<likes> likes;
	@OneToMany(cascade = CascadeType.REMOVE, mappedBy = "posts")
	private Set<Dislike> Dislike;
	public int getIdPost() {
		return idPost;
	}
	public void setIdPost(int idPost) {
		this.idPost = idPost;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public Date getDatePost() {
		return datePost;
	}
	public void setDatePost(Date datePost) {
		this.datePost = datePost;
	}
	public Set<Comment> getComments() {
		return comments;
	}
	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}
	public Employee getEmployees() {
		return employees;
	}
	public void setEmployees(Employee employees) {
		this.employees = employees;
	}
	public Set<likes> getLikes() {
		return likes;
	}
	public void setLikes(Set<likes> likes) {
		this.likes = likes;
	}
	public Set<Dislike> getDislike() {
		return Dislike;
	}
	public void setDislike(Set<Dislike> dislike) {
		Dislike = dislike;
	}



}
