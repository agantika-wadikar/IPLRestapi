package com.codit.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.codit.model.Team;

@Repository
public class TeamDao {
	
	ArrayList<Team> teams = new ArrayList<Team>();
	public String addTeam(Team team) {
		teams.add(team);
		return "The Team Added Successfull";
	}
	
	public ArrayList<Team> getAllTeam(){
		return teams;
		
	}
	
	public Team getTeambyId(int id) {
		for (Team team : teams) {
			if (team.getTeamId() == id) {
				team.getTeamId();
				return team;
			}
		}
		return null;
	}
	
	public String deleteTeam(int id) {
		String msg;
		for (Team team : teams) {
	       if (team.getTeamId() == id) {
			teams.remove(id);
			msg = "The team has deleted";
			return msg;
		}		
		}
		msg = "The team is not deleted";
		return msg;
	}
	
}
