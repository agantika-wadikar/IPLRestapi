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

import com.codit.model.Team;
import com.codit.service.TeamService;

@RestController
public class TeamController {
	@Autowired
	TeamService teamService;
	@PostMapping("/api/teams")
 public String addTeam(@RequestBody Team team) {
	 String msg = teamService.addTeam(team);
	return msg;
 }
 
 @GetMapping("/api/teams")
 public ArrayList<Team> getallTeams(){
	 ArrayList<Team> allTeams = teamService.getAllTeams();
	return allTeams;
	 
 }
 @GetMapping("/api/team{id}")
 public Object getTeambyId(@RequestParam int id) {
	 Team team = teamService.getTeambyId(id);
	 if (team!= null) {
		return team;
	}
	 else {
		return "The team not found";
	 }
	}
 public String deleteTeam(@PathVariable int id) {
	return null;
	 
	 
 }
 
 
 
 
 

}