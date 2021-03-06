/**
 * 
 */
package com.rockcor.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


/**
 * @author ricardodelgadocarreno
 *
 */
@Entity
public class Player {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPersona;
	
	@Column(name="name", length=50)
	private String name;
	
	@Column(name="number", length=2)
	private int number;
	
	@Column(name="position", length=20)
	private String position;
	
	@Column(name="kick", length=2)
	private int kick;
	
	@Column(name="pass", length=2)
	private int pass;
	
	@Column(name="dodge", length=2)
	private int dodge;
	
	@ManyToOne
		@JoinColumn(name="idTeam")
	private Team team;
	

	/**
	 * 
	 */
	public Player() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param idPersona
	 * @param name
	 * @param number
	 * @param position
	 * @param kick
	 * @param pass
	 * @param dodge
	 */
	public Player(int idPersona, String name, int number, String position, int kick, int pass, int dodge) {
		super();
		this.idPersona = idPersona;
		this.name = name;
		this.number = number;
		this.position = position;
		this.kick = kick;
		this.pass = pass;
		this.dodge = dodge;
	}
	
	/**
	 * @param idPersona
	 * @param name
	 * @param number
	 * @param position
	 * @param kick
	 * @param pass
	 * @param dodge
	 */
	public Player(String name, int number, String position, int kick, int pass, int dodge) {
		super();
		this.name = name;
		this.number = number;
		this.position = position;
		this.kick = kick;
		this.pass = pass;
		this.dodge = dodge;
	}
	

	/**
	 * @param name
	 * @param number
	 * @param position
	 * @param kick
	 * @param pass
	 * @param dodge
	 * @param team
	 */
	public Player(String name, int number, String position, int kick, int pass, int dodge, Team team) {
		super();
		this.name = name;
		this.number = number;
		this.position = position;
		this.kick = kick;
		this.pass = pass;
		this.dodge = dodge;
		this.team = team;
	}

	/**
	 * @return the team
	 */
	public Team getTeam() {
		return team;
	}

	/**
	 * @param team the team to set
	 */
	public void setTeam(Team team) {
		this.team = team;
	}

	/**
	 * @return the idPersona
	 */
	public int getIdPersona() {
		return idPersona;
	}

	/**
	 * @param idPersona the idPersona to set
	 */
	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
	}

	/**
	 * @return the position
	 */
	public String getPosition() {
		return position;
	}

	/**
	 * @param position the position to set
	 */
	public void setPosition(String position) {
		this.position = position;
	}

	/**
	 * @return the kick
	 */
	public int getKick() {
		return kick;
	}

	/**
	 * @param kick the kick to set
	 */
	public void setKick(int kick) {
		this.kick = kick;
	}

	/**
	 * @return the pass
	 */
	public int getPass() {
		return pass;
	}

	/**
	 * @param pass the pass to set
	 */
	public void setPass(int pass) {
		this.pass = pass;
	}

	/**
	 * @return the dodge
	 */
	public int getDodge() {
		return dodge;
	}

	/**
	 * @param dodge the dodge to set
	 */
	public void setDodge(int dodge) {
		this.dodge = dodge;
	}
	
	

}
