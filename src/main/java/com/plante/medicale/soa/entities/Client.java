package com.plante.medicale.soa.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/////////////////////////////////////////////////////
//Lombok qui gére les constructeurs, les getters et les setters automatiquement
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
/////////////////////////////////////////////////////

@Entity
@Table(name = "clients")
public class Client {
	//primary key
	@Id
	//auto incrementation
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private long code;

	private String nom;
	
	@ManyToOne
	private Type type;
	
	private Double coef;
		
	private String adresse;
		
	private Long tel;
		
	private String email;
		
	private String login;
	
	private String password;

	
}



/*

package com.plante.medicale.soa.entities;



import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Value;



/////////////////////////////////////////////////////
//Lombok qui gére les constructeurs, les getters et les setters automatiquement
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
////////////////////////////////////////////////////

@Entity
public class User {
	
	//cle primere
	@Id
	//auto incrementation
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//Code user ????????????? CODE OU BIEN IDUser
	private Long idUser;
	
	private String nomUser;
	private String typeUser;
	private Double coefFidelite;
	
	private String adresseUser;
	
	private Long telephone;
	
	private String email;
	
	private String login;
	
	private String password;
	
	//?????????????????????????????????????????????????????????
	private Long quantite;
	private Double remise;
	

}

*/



