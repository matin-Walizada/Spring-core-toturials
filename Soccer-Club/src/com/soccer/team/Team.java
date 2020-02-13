package com.soccer.team;


public class Team extends Players_Responsibilities  implements Couch {
	
	
	
	// we injected the players_meal class into team class 
	private Players_Meal players_Meal;
	
	
	
	public Team(Players_Meal players_Meal) {
	
		this.players_Meal = players_Meal;
	}

	private String teamName;
	private String TeamCouch;
	private String teamJerseyColor;
	private String TeamStedium;
	private String TeamOwner;
	
	
	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getTeamCouch() {
		return TeamCouch;
	}

	public void setTeamCouch(String teamCouch) {
		TeamCouch = teamCouch;
	}

	public String getTeamJerseyColor() {
		return teamJerseyColor;
	}

	public void setTeamJerseyColor(String teamJerseyColor) {
		this.teamJerseyColor = teamJerseyColor;
	}

	public String getTeamStedium() {
		return TeamStedium;
	}

	public void setTeamStedium(String teamStedium) {
		TeamStedium = teamStedium;
	}

	public String getTeamOwner() {
		return TeamOwner;
	}

	public void setTeamOwner(String teamOwner) {
		TeamOwner = teamOwner;
	}

	@Override
	public String pachasingPlayers() {
		
		return "a best alwats buy phanomenal players.";
	}

	@Override
	public String trainTheTeam() {
		
		return "AN EXPIRIANCED Couch trains the team very strong ";
	}

	@Override
	public String settTheMaches() {
		 
		return "A good couch always selects best playser for team maches";
	}

	@Override
	public String SwapthePlayersInMaches() {
		
		return "the couch of the team always swap the players based on thier activies phesices";
	}
	
	public String goalKeepers() {
		return helpingGoalKeepers();
	}
	
	public String defenders() {
		
		return helpingDefenders();
	}
	
	public String middFielders() {
		return helpiingMiddfielders();
	}
	
	
	public String playersBreakast() {
		
		return  players_Meal.BreakFast();
	}
	
	
	
	public String playersLunch() {
		
		
		return  players_Meal.lunch();
	}
	
	
	public String playersDinner() {
		
		return  players_Meal.Dinner();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
