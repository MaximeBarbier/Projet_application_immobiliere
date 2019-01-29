package com.intiformation.gestion.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="visite")
@Table(name="visites")
//@NamedQueries({@NamedQuery(name="Visite.findAll",query="SELECT v from visite v")})
public class Visite {
	
	/*____________________________________________Attributs__________________________________________________*/
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_visite")
	private int id;
	@Column(name="date_visite")
	private Date date_disite;
	@Column(name="horaire_visite")
	private Date horaire_visite;
	
	/*____________________________________________ctor__________________________________________________*/
	
	/**
	 * ctor vide
	 */
	public Visite() {
		super();
	}

	/**
	 * ctor charg� sans l'id
	 * @param date_disite
	 * @param horaire_visite
	 */
	public Visite(Date date_disite, Date horaire_visite) {
		super();
		this.date_disite = date_disite;
		this.horaire_visite = horaire_visite;
	}

	/**
	 * ctor charg� avec l'id
	 * @param id
	 * @param date_disite
	 * @param horaire_visite
	 */
	public Visite(int id, Date date_disite, Date horaire_visite) {
		super();
		this.id = id;
		this.date_disite = date_disite;
		this.horaire_visite = horaire_visite;
	}
	
	/*____________________________________________get/set/string__________________________________________________*/

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the date_disite
	 */
	public Date getDate_disite() {
		return date_disite;
	}

	/**
	 * @param date_disite the date_disite to set
	 */
	public void setDate_disite(Date date_disite) {
		this.date_disite = date_disite;
	}

	/**
	 * @return the horaire_visite
	 */
	public Date getHoraire_visite() {
		return horaire_visite;
	}

	/**
	 * @param horaire_visite the horaire_visite to set
	 */
	public void setHoraire_visite(Date horaire_visite) {
		this.horaire_visite = horaire_visite;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Visite [id=" + id + ", date_disite=" + date_disite + ", horaire_visite=" + horaire_visite + "]";
	}
	
	

}