/**
 * 
 */
package com.rockcor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rockcor.model.Team;
import com.rockcor.repository.ITeamRepository;

/**
 * @author ricardodelgadocarreno
 *
 */
@Service
public class TeamServiceImpl implements ITeamService<Team>{
	
	@Autowired
	private ITeamRepository _teamRepository;

	@Override
	public List<Team> findAll() {
		return _teamRepository.findAll();
	}

	@Override
	public void save(Team t) {
		_teamRepository.save(t);
	}

}
