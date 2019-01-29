package com.intiformation.gestion.entity;

import javax.persistence.Entity;

@Entity
public class Client extends Personne{

	/* Import des champs h�rit�s de la classe Personne */
	@Override
	public int getId() {
		return super.getId();
	}

	@Override
	public void setId(int id) {
		super.setId(id);
	}

	@Override
	public String getNom() {
		return super.getNom();
	}


	@Override
	public String getAdresse() {
		return super.getAdresse();
	}

	@Override
	public void setAdresse(String adresse) {
		super.setAdresse(adresse);
	}

	@Override
	public String getTelephone() {
		return super.getTelephone();
	}

	@Override
	public void setTelephone(String telephone) {
		super.setTelephone(telephone);
	}

	@Override
	public String toString() {
		return super.toString();
	}

	
	/* ctors h�rit�s de la classe Personne */
	/**
	 * ctor vide
	 */
	public Client() {
		super();
	}

	/**
	 * ctor charg�
	 * @param id
	 * @param nom
	 * @param adresse
	 * @param telephone
	 */
	public Client(int id, String nom, String adresse, String telephone) {
		super(id, nom, adresse, telephone);
	}

	/**
	 * ctor charg� sans l'ID
	 * @param nom
	 * @param adresse
	 * @param telephone
	 */
	public Client(String nom, String adresse, String telephone) {
		super(nom, adresse, telephone);
	}
	
	

}