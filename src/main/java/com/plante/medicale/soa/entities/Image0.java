package com.plante.medicale.soa.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

/*@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "photoplante")*/
public class Image0 {
    /*@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idImage ;
    private String name ;
    private String type ;
    
    //LOB - Large OBject refers to a variable length datatype for storing large objects
    @Lob
    //BLOB – Binary Large Object is for storing binary data like image, audio, or video
    @Column(name = "image", columnDefinition="BLOB")
    private byte[] image;

    //@JsonIgnore
    //@OneToMany(mappedBy = "image")
    //List<Entreprise> entreprises ;
    
    

    public Long getIdImage() {
        return idImage;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public byte[] getImage() {
        return image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }*/

    /*public List<Entreprise> getEntreprises() {
        return entreprises;
    }*/
}