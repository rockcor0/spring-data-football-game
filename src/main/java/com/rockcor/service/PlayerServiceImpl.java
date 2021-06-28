/**
 * 
 */
package com.rockcor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rockcor.model.Player;
import com.rockcor.model.Team;
import com.rockcor.repository.IPlayerRepository;

/**
 * @author ricardodelgadocarreno
 *
 */
@Service
public class PlayerServiceImpl implements IPlayerService<Player>{
	
	@Autowired
	private IPlayerRepository _playerRepository;

	@Override
	public Player createPlayer() {
		return new Player("Ricardo Delgado", 10, "Delantero", 10, 10, 10);
	}

	@Override
	public Player save() {
		Player player = createPlayer();
		_playerRepository.save(player);
		
		return player;
	}

	@Override
	public List<Player> findAll() {
		return _playerRepository.findAll();
	}

	@Override
	public void save(Player player) {
		_playerRepository.save(player);
	}

	@Override
	public List<Player> findByTeam(Team team) {
		return _playerRepository.findByTeam(team);
	}
	
	

}
