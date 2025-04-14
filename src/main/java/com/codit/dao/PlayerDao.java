package com.codit.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.codit.model.Player;

@Repository
public class PlayerDao {
	
	ArrayList<Player> players = new ArrayList<Player>();
	public String addPlayer(Player player) {
		players.add(player);
		return "Added Successfully";
		
	}

	public ArrayList<Player>getAllPlayers(){
		return players;
		
	}
	
	public Player getPlayerbyID(int id) {
		for (Player player : players) {
			if (player.getPlayerId() == id) {
				return player;	
			}
			}
		return null;
	}
	public String deletePlayer(int id) {
		String msg;
		for (Player player : players) {
			if (player.getPlayerId()== id) {
				players.remove(id);
				msg = "Player has deleted";
				return msg;
			}
		}
		msg = "The Players not found";
		return msg;
}
}