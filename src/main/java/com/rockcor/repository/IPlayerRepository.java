/**
 * 
 */
package com.rockcor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rockcor.model.Player;

/**
 * @author ricardodelgadocarreno
 *
 */
public interface IPlayerRepository extends JpaRepository<Player, Integer> {
	
	

}
