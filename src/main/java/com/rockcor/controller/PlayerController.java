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
import com.rockcor.service.IPlayerService;

/**
 * @author ricardodelgadocarreno
 * @param <T>
 *
 */
@Controller
public class PlayerController<T> {
	
	@Autowired
	private IPlayerService<T> _playerService;

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
		
		
		_playerService.save(new Player(1,"Ricardo Delgado", 10, "Delantero", 10, 10, 10));
		_playerService.save(new Player(2,"Lilly Duque", 8, "Armadora", 10, 10, 10));
		_playerService.save(new Player(3,"Gandalf", 2, "Defensa Central", 10, 10, 10));
		_playerService.save(new Player(4,"Arya", 1, "Arquera", 10, 10, 10));


		model.addAttribute("players", _playerService.findAll());
		
		return "list";
	}

}
