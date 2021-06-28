/**
 * 
 */
package com.rockcor.service;

import java.util.List;

import com.rockcor.model.Player;
import com.rockcor.model.Team;

/**
 * @author ricardodelgadocarreno
 * @param <T>
 *
 */
public interface IPlayerService<T> {

	T createPlayer();
	public T save();
	List<T> findAll();
	void save(T t);
	List<T> findByTeam(Team team);
	
	
}
