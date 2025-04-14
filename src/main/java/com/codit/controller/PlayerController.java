package com.codit.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.codit.model.Player;
import com.codit.service.PlayerService;

@RestController
public class PlayerController {
	@Autowired
	PlayerService playerService;
	@PostMapping("/api/players")
	public String addPlayer(@RequestBody Player player) {
		String msg = playerService.addPlayer(player);
		return msg;
		
	}
	@GetMapping("/api/players")
	public ArrayList<Player>getAllPlayers(){
		ArrayList<Player> allPlayers = playerService.getAllPlayers();
		return allPlayers;
		
	}
	@GetMapping("/api/player{id}")
	public Object getPlayerbyID(@RequestParam int id) {
		Player player = playerService.getPlayerbyID(id);
		if (player!= null) {
			return player;
		}
		else {
			return "player not found";
		}
		
		
	}
	@DeleteMapping("/api/player/{id}")
    public String deletePlayer(@PathVariable int id) {
	String msg = playerService.deletePlayer(id);
	return msg;
	
}
}
