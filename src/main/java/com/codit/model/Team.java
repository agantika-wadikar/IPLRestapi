package com.codit.model;

public class Team {
 private int teamId;
 private String Name;
 private String City;
 private String Coach;
public Team() {
	super();
	// TODO Auto-generated constructor stub
}
public Team(int teamId, String name, String city, String coach) {
	super();
	this.teamId = teamId;
	Name = name;
	City = city;
	Coach = coach;
}
public int getTeamId() {
	return teamId;
}
public void setTeamId(int teamId) {
	this.teamId = teamId;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getCity() {
	return City;
}
public void setCity(String city) {
	City = city;
}
public String getCoach() {
	return Coach;
}
public void setCoach(String coach) {
	Coach = coach;
}
@Override
public String toString() {
	return "Team [teamId=" + teamId + ", Name=" + Name + ", City=" + City + ", Coach=" + Coach + "]";
}
 
 
 
 
}
