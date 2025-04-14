   package com.codit.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codit.dao.MatchDao;
import com.codit.model.Match;

@Service
public class MatchService {
      @Autowired
      MatchDao matchDao;
      
      public String addMatch(Match match) {
    	  String msg = matchDao.addMatch(match);
		return msg;
    	  
      }
     
      public ArrayList<Match>getAllMatches() {
    	  ArrayList<Match> allMatches = matchDao.getAllMatches();
		return allMatches;
	
      }
      
      public Match getMatchbyId(int id) {
    	  Match match = matchDao.getMatchbyId(id);
		return match;
    	  
      }
      public String deleteMatch(int id) {
    	  String msg = matchDao.deleteMatch(id);
		return msg;
    	  
      }
     
}
