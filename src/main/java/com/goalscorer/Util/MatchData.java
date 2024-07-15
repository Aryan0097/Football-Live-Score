package com.goalscorer.Util;

import java.util.ArrayList;

public class MatchData {
	public ArrayList<MatchContainer> getData(){
		ArrayList<MatchContainer> matchList=new ArrayList<>();
		


        String[] teams = {
            "RMA", "BRA", "FCB", "ATM", "CHE", "MUN", "BVB", "BAY", "MCFC", "LFC", "KBFC", "CFC"
        };
        
        String[] tournaments = {
            "La Liga", "Premier League", "Bundesliga", "Indian Super League"
        };

        for (int i = 0; i < 12; i++) {
            MatchContainer container = new MatchContainer();
            container.setStatus("Live");
            container.setTeam1(teams[i % teams.length]);
            container.setTeam2(teams[(i + 1) % teams.length]);
            container.setT1Score((int) (Math.random() * 5));
            container.setT2Score((int) (Math.random() * 5));
            container.setTime((int) (Math.random() * 90) + "'");
            container.setTournament(tournaments[i % tournaments.length]);
            matchList.add(container);
        }
		    
		
		return matchList;
	}
}
