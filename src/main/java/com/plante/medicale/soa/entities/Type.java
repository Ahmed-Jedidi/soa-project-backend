package com.plante.medicale.soa.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "type")
public class Type {
	//cle primere
	@Id
	//auto incrementation
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Long idType;
	private String nomType;
	
	//
	@OneToMany (mappedBy = "type")
	@JsonIgnore
	private List<Client> clients;

	@Override
	public String toString() {
		return "Type [idType=" + idType + ", nomType=" + nomType + "]";
	}
	


}