package com.soccer.team;


public class Players_Responsibilities implements Assistance_Couch {

	@Override
	public String helpingGoalKeepers() {
		
		return "All Goal Keepers need cach the ball for 30 minutes";
	}

	@Override
	public String helpingDefenders() {
	
		return "All the defenders must run 100 meters for 40 minute";
	}

	@Override
	public String helpiingMiddfielders() {
	
		return "All middfielders need to work with defendeers and farwards ";
	}

	@Override
	public String helpiingFarwards() {
		
		return "all farwards need to shot the ball to the goal 40 menuts";
	}

	 

}
