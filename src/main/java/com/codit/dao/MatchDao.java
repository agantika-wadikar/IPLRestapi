package com.codit.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.codit.model.Match;

@Repository
public class MatchDao {

	ArrayList<Match> matchs = new ArrayList<Match>();
	public String addMatch(Match match) {
		matchs.add(match);
		return "Added Successfully";
		
	}
	
	public ArrayList<Match>getAllMatches() {
		return matchs;
		
	}
	
	public Match getMatchbyId(int id) {
		for (Match match : matchs) {
			if (match.getMatchId() == id) {
				return match;
			}
		}
		return null;	
	}
	
	public String deleteMatch(int id) {
		String msg;
		for (Match match : matchs) {
			if (match.getMatchId() == id) {
				 matchs.remove(match);
				 msg = "The match has deleted";
				 return msg;
			}
		}
		msg = " team not found to delete";
		return msg;
	}
	
}
