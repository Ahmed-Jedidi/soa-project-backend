package com.plante.medicale.soa.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Value;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
@Table(name = "plante")
public class Plante {
	//cle primere
	@Id
	//auto incrementation
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	private String nom;
	private String origine;
	
	//Best of Best couleurs Begin
	///@ElementCollection(fetch = FetchType.EAGER/*, targetClass = */) // 1
    ///@CollectionTable(name = "my_couleurs", joinColumns = @JoinColumn(name = "id")) // 2
    ///@Column(name = "couleurs") // 3
	///private List<String> couleurs = new ArrayList<String>();
	//Best of Best couleurs End
	private String couleurs;
	
	
	private Double prix;
	private String description;
	
	////////////////////////////////////////////////////////////////
	
	//@ElementCollection
	//private List<Image> photos = new ArrayList<String>();
	
	////////////////////////////////////////////////////////////////
@OneToOne(cascade = CascadeType.ALL)
	//@OneToOne(/*mappedBy = "plante", */ cascade = CascadeType.ALL)
@JoinColumn(name = "fleur_id", referencedColumnName = "id")
	/*@PrimaryKeyJoinColumn*/
private Fleur fleur;
	////////////////////////////////////////////////////////////////

	//@JsonIgnore
	//@OneToMany (mappedBy = "plante")

	//@ElementCollection
	//private List<Utilisation> utilisations = new ArrayList<Utilisation>();
	
	//?????????????????????????????????????????????????????????
	private Long quantite;
	private Double promotion;
	
	
	
	///////////////////////////////////////////////////////////////////
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "plante_utilisation", joinColumns = @JoinColumn(name = "id"),
			   inverseJoinColumns = @JoinColumn(name = "utilisation_id"))

	private List<Utilisation> utilisations;
	

}
