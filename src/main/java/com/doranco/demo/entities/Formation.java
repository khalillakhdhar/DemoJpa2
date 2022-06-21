package com.doranco.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Formation {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
@NotBlank
@Column(nullable = false)
private String titre;
@Column(length = 100)
private String description;
@Column(unique = true, length = 30)
private String formateur;
@Column(nullable = false)
private int duree;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getTitre() {
	return titre;
}
public void setTitre(String titre) {
	this.titre = titre;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getFormateur() {
	return formateur;
}
public void setFormateur(String formateur) {
	this.formateur = formateur;
}
public int getDuree() {
	return duree;
}
public void setDuree(int duree) {
	this.duree = duree;
}



}
