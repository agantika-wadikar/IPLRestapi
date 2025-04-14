package com.codit.model;

public class Player {
private int playerId;
private String Name;
private int Age;
private int teamId;
private String Role;
public Player() {
	super();
	// TODO Auto-generated constructor stub
}
public Player(int playerId, String name, int age, int teamId, String role) {
	super();
	this.playerId = playerId;
	Name = name;
	Age = age;
	this.teamId = teamId;
	Role = role;
}
public int getPlayerId() {
	return playerId;
}
public void setPlayerId(int playerId) {
	this.playerId = playerId;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public int getAge() {
	return Age;
}
public void setAge(int age) {
	Age = age;
}
public int getTeamId() {
	return teamId;
}
public void setTeamId(int teamId) {
	this.teamId = teamId;
}
public String getRole() {
	return Role;
}
public void setRole(String role) {
	Role = role;
}
@Override
public String toString() {
	return "Player [playerId=" + playerId + ", Name=" + Name + ", Age=" + Age + ", teamId=" + teamId + ", Role=" + Role
			+ "]";
}



}
