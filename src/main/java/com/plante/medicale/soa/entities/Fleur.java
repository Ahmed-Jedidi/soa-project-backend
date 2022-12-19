package com.plante.medicale.soa.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Value;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.plante.medicale.soa.convert.StringListConverter;

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
@Table(name = "fleur")
public class Fleur {
	
	//cle primere
	@Id
	//auto incrementation
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@Column(name = "id")
	private Long id;
	//@Column(name = "nom")
	private String nom;
	private String couleur;
	private String odeur;
	private Double prix;
	
	//@ElementCollection
	//private List<Utilisation> utilisationsFleur = new ArrayList<Utilisation>();
	
	//?????????????????????????????????????????????????????????
	private Long quantite;
	private Double promotion;
	
	
	///////////////////////////////////////////////////////////////////
	/*@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "fleur_utilisation", joinColumns = @JoinColumn(name = "id"),
			   inverseJoinColumns = @JoinColumn(name = "utilisation_id"))

	private List<Utilisation> utilisations;*/
	private String utilisations;
	///@Convert(converter = StringListConverter.class)
	///private List<String> utilisations;
	

	/*@OneToOne
    @MapsId
    @JoinColumn(name = "plante_id")*/
	
	//Master and vassal relation which entity depend on who
	@JsonIgnore
	@OneToOne(mappedBy = "fleur")
	private Plante plante;


}
