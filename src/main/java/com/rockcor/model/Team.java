/**
 * 
 */
package com.rockcor.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * @author ricardodelgadocarreno
 *
 */
@Entity
public class Team {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "team")
	private Set<Player> players = new HashSet<Player>();
	

	/**
	 * 
	 */
	public Team() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	/**
	 * @param name
	 * @param players
	 */
	public Team(String name, Set<Player> players) {
		super();
		this.name = name;
		this.players = players;
	}

	/**
	 * @param name
	 */
	public Team(String name) {
		super();
		this.name = name;
	}

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
	 * @return the players
	 */
	public Set<Player> getPlayers() {
		return players;
	}

	/**
	 * @param players the players to set
	 */
	public void setPlayers(Set<Player> players) {
		this.players = players;
	}
	
	
}
