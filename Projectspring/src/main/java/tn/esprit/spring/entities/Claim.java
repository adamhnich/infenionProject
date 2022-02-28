package tn.esprit.spring.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

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
@Temporal(TemporalType.DATE)
private Date dateClaim;
private String description;
@Enumerated(EnumType.STRING)
private Type  type;
@Enumerated(EnumType.STRING)
private Status  status;
}