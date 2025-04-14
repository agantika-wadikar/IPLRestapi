package com.codit.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codit.dao.PlayerDao;
import com.codit.model.Player;

@Service
public class PlayerService {
	@Autowired
	PlayerDao playerDao;

	public String addPlayer(Player player) {
		String msg = playerDao.addPlayer(player);
		return msg;
	}
	public ArrayList<Player>getAllPlayers() {
		ArrayList<Player> allPlayers = playerDao.getAllPlayers();
		return allPlayers;
		
	}
	public Player getPlayerbyID(int id) {
		Player player = playerDao.getPlayerbyID(id);
		return player;
		
	}
	
	public String deletePlayer(int id) {
		String msg = playerDao.deletePlayer(id);
		return msg;
		
	}
}
