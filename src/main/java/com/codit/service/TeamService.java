package com.codit.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codit.dao.TeamDao;
import com.codit.model.Team;

@Service
public class TeamService {
     @Autowired
     TeamDao teamDao;
	public String addTeam(Team team) {
		String msg = teamDao.addTeam(team);
		return msg;
		
	}
	
	public ArrayList<Team> getAllTeams(){
		ArrayList<Team> allTeam = teamDao.getAllTeam();
		return allTeam;
		
	}
	
	public Team getTeambyId(int id) {
		Team team = teamDao.getTeambyId(id);
		return team;
		
	}
	
	public String deleteTeam(int id) {
		return null;
		
	}
}
