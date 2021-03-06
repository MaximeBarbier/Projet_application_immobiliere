package com.intiformation.gestion.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity(name="proprietaire")
@Table(name="proprietaires")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Proprietaire extends Personne {

	/* Déclaration des champs de la classe */
	@Column(name="telephone_travail")
	private String telephoneTravail;
	
	@OneToMany(mappedBy="proprietaire", fetch=FetchType.EAGER)
	private List<BienImmobilier> listeBiens;

	/* CTORS */
	public Proprietaire() {
		super();
	}

	public Proprietaire(String nom, String adresse, String codePostal, String localite, String telephonePrive,
			String telephoneTravail, List<BienImmobilier> listeBiens) {
		super(nom, adresse, codePostal, localite, telephonePrive);
		this.telephoneTravail = telephoneTravail;
		this.listeBiens = listeBiens;
	}

	public Proprietaire(int id, String nom, String adresse, String codePostal, String localite, String telephonePrive,
			String telephoneTravail, List<BienImmobilier> listeBiens) {
		super(id, nom, adresse, codePostal, localite, telephonePrive);
		this.telephoneTravail = telephoneTravail;
		this.listeBiens = listeBiens;
	}

	/* GETTERS AND SETTERS */
	public String getTelephoneTravail() {
		return telephoneTravail;
	}

	public void setTelephoneTravail(String telephoneTravail) {
		this.telephoneTravail = telephoneTravail;
	}

	public List<BienImmobilier> getListeBiens() {
		return listeBiens;
	}

	public void setListeBiens(List<BienImmobilier> listeBiens) {
		this.listeBiens = listeBiens;
	}

	@Override
	public String toString() {
		return "Proprietaire [telephoneTravail=" + telephoneTravail + ", listeBiens=" + listeBiens + "]";
	}
	
}
