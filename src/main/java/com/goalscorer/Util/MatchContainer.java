package com.goalscorer.Util;

public class MatchContainer {
	private String status;
	private String team1;
	private String team2;
	private int t1Score;
	private int t2Score;
	private String time;
	private String tournament;
	
	public String getTournament() {
		return tournament;
	}
	public void setTournament(String tournament) {
		this.tournament = tournament;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTeam1() {
		return team1;
	}
	public void setTeam1(String team1) {
		this.team1 = team1;
	}
	public String getTeam2() {
		return team2;
	}
	public void setTeam2(String team2) {
		this.team2 = team2;
	}
	public int getT1Score() {
		return t1Score;
	}
	public void setT1Score(int t1Score) {
		this.t1Score = t1Score;
	}
	public int getT2Score() {
		return t2Score;
	}
	public void setT2Score(int t2Score) {
		this.t2Score = t2Score;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
}
