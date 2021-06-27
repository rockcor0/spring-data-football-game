/**
 * 
 */
package com.rockcor.service;

import java.util.List;

import com.rockcor.model.Player;

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
	
	
}
