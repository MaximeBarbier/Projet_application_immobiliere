package com.intiformation.gestion.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contrat {

	/* D�claration des champs */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="reference_contrat")
	private int ref_contrat;
	
	/* ctors */
	/**
	 * ctor vide
	 */
	public Contrat() {
		super();
	}

	/**
	 * ctor charg�
	 * @param ref_contrat
	 */
	public Contrat(int ref_contrat) {
		super();
		this.ref_contrat = ref_contrat;
	}


	/* Getters et setters */
	public int getRef_contrat() {
		return ref_contrat;
	}

	public void setRef_contrat(int ref_contrat) {
		this.ref_contrat = ref_contrat;
	}

	/*  M�thode toString() */
	@Override
	public String toString() {
		return "Contrat [ref_contrat=" + ref_contrat + "]";
	}
	
	
	
}