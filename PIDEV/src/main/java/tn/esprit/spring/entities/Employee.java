package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity

public class Employee  implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idEmployee;
	
	@NonNull private String  email,password;
	@NonNull private int numTel;

	@NonNull private String FirstName, LastName;
	@NonNull private float salary;
	
	@JsonFormat(pattern = "yyyy-MM-dd", shape = Shape.STRING)
	//@Temporal(TemporalType.DATE)
	@NonNull private java.util.Date dateNaissance;

	@Enumerated(EnumType.STRING)
	private Profession profession;
	
		@JsonIgnore

		@OneToMany(cascade = CascadeType.ALL, mappedBy="employees")
		private Set<Comment> comments;
		
		@OneToMany(cascade = CascadeType.REMOVE, mappedBy="employees")
		private Set<likes> likes;
			
		@ManyToOne
		private Entreprise entreprises;

		public int getIdEmployee() {
			return idEmployee;
		}

		public void setIdEmployee(int idEmployee) {
			this.idEmployee = idEmployee;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public int getNumTel() {
			return numTel;
		}

		public void setNumTel(int numTel) {
			this.numTel = numTel;
		}

		public String getFirstName() {
			return FirstName;
		}

		public void setFirstName(String firstName) {
			FirstName = firstName;
		}

		public String getLastName() {
			return LastName;
		}

		public void setLastName(String lastName) {
			LastName = lastName;
		}

		public float getSalary() {
			return salary;
		}

		public void setSalary(float salary) {
			this.salary = salary;
		}

		public java.util.Date getDateNaissance() {
			return dateNaissance;
		}

		public void setDateNaissance(java.util.Date dateNaissance) {
			this.dateNaissance = dateNaissance;
		}

		public Profession getProfession() {
			return profession;
		}

		public void setProfession(Profession profession) {
			this.profession = profession;
		}

		public Set<Comment> getComments() {
			return comments;
		}

		public void setComments(Set<Comment> comments) {
			this.comments = comments;
		}

		public Set<likes> getLikes() {
			return likes;
		}

		public void setLikes(Set<likes> likes) {
			this.likes = likes;
		}

		public Entreprise getEntreprises() {
			return entreprises;
		}

		public void setEntreprises(Entreprise entreprises) {
			this.entreprises = entreprises;
		}

		public static long getSerialversionuid() {
			return serialVersionUID;
		}
	
	
}
