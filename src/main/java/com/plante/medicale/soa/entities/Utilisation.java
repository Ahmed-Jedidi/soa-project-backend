package com.plante.medicale.soa.entities;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Value;



/////////////////////////////////////////////////////
/*Lombok qui gére les constructeurs, les getters et les setters automatiquement*/
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
////////////////////////////////////////////////////

@Entity
public class Utilisation {
	
	//cle primere
	@Id
	//auto incrementation
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "utilisation_id")
	private Long utilisation_id;//idUtilisation
	
	private String titre;
	private String detaille;


}

