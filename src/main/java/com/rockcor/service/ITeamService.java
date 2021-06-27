/**
 * 
 */
package com.rockcor.service;

import java.util.List;

import com.rockcor.model.Player;

/**
 * @author ricardodelgadocarreno
 *
 */
public interface ITeamService<T> {
	
	/**
	 * Find all T
	 * @return
	 */
	List<T> findAll();
	
	/**
	 * Save T Object
	 * @param t
	 */
	void save(T t);

}
