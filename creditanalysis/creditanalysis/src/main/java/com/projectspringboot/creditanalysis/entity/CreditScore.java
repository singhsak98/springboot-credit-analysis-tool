package com.projectspringboot.creditanalysis.entity;

public class CreditScore {
	
	private int id;
	private int userId;
	private long score;
	private String date;
	
	//constructor  
	public CreditScore( int userId, long score, String date) {
		this.userId = userId;
		this.score = score;
		this.date = date;
	}

	
	// getter and setters 
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public long getScore() {
		return score;
	}

	public void setScore(long score) {
		this.score = score;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
}
