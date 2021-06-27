/**
 * 
 */
package com.rockcor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rockcor.model.Team;

/**
 * @author ricardodelgadocarreno
 *
 */
public interface ITeamRepository extends JpaRepository<Team, Integer>{

}
