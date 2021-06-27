/**
 * 
 */
package com.rockcor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rockcor.model.Player;
import com.rockcor.model.Team;
import com.rockcor.service.IPlayerService;
import com.rockcor.service.ITeamService;

/**
 * @author ricardodelgadocarreno
 * @param <T>
 *
 */
@Controller
public class GameController<T> {
	
	@Autowired
	private IPlayerService<T> _playerService;
	
	@Autowired
	private ITeamService<T> _teamService;

	@GetMapping("/hello")
	public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
		
		Player player = (Player) _playerService.save();
		
		model.addAttribute("playerId", player.getIdPersona());
		model.addAttribute("name", player.getName());
		model.addAttribute("number", player.getNumber());
		model.addAttribute("position", player.getPosition());
		//greeting is the name of html page in resourses/templates
		return "greeting";
	}
	
	@GetMapping("/list")
	public String getPlayers(Model model) {
		
		Team team = new Team("My Family");
		
		_teamService.save((T) team);
		_playerService.save((T) new Player("Ricardo Delgado", 10, "Delantero", 10, 10, 10, team));
		_playerService.save((T) new Player("Lilly Duque", 8, "Armadora", 10, 10, 10, team));
		_playerService.save((T) new Player("Gandalf", 2, "Defensa Central", 10, 10, 10, team));
		_playerService.save((T) new Player("Arya", 1, "Arquera", 10, 10, 10, team));

		model.addAttribute("players", _playerService.findAll());
		
		return "list";
	}

}
