/**
 * 
 */
package com.rockcor.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rockcor.model.Player;
import com.rockcor.model.Team;

/**
 * @author ricardodelgadocarreno
 *
 */
public interface IPlayerRepository extends JpaRepository<Player, Integer> {
	
	List<Player> findByTeam(Team team);

}
