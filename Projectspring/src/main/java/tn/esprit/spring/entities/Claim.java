package tn.esprit.spring.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


import java.util.Set;

@Entity
@Table( name ="Claim")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Claim  implements Serializable{




/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
@Column(name="idClaim")
private Long idClaim;


LocalDate date = LocalDate.now();
@NotNull(message="the description is required")
@Size(min=2 ,message=" description hould have at least 2 carac")
private String description;

@NotNull (message="Type should not be null ")
@Enumerated(EnumType.STRING)

private Type  type;
private String topicOfclaim;
private String response;

private boolean  status;

@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "user_id")
private User user;
}