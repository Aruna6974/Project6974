package com.Constructor;

public class Player
{
	private int playerId;
	private String playerName;
	private String playerGame;
	private int playerAge;
	public Player(int playerId, String playerName, String playerGame, int playerAge) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.playerGame = playerGame;
		this.playerAge = playerAge;
	}
	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playerName=" + playerName + ", playerGame=" + playerGame
				+ ", playerAge=" + playerAge + "]";
	}
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}