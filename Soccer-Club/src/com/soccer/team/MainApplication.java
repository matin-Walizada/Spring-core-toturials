package com.soccer.team;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.soccer.team.Couch;


public class MainApplication {

	public static void main(String[] args) {
	
		// we connected our main application class to teamdata.xml file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("TeamData.xml");
		
		
		
		Team object = (Team) context.getBean("MyTeam", Couch.class);
		
		System.out.println(" Team Name " +object.getTeamName());
		System.out.println(" Team Couch " +object.getTeamCouch());
		System.out.println(" Team jersey color  " +object.getTeamJerseyColor());
		System.out.println(" Team stedium " +object.getTeamStedium());
		System.out.println(" Team owner " +object.getTeamOwner());
		
		System.out.println(object.pachasingPlayers());
		
		System.out.println(object.trainTheTeam());
		System.out.println(object.settTheMaches());
		System.out.println(object.SwapthePlayersInMaches());
		System.out.println(object.goalKeepers());
		System.out.println(object.defenders());
		System.out.println(object.middFielders());
		System.out.println(object.playersBreakast());
		System.out.println(object.playersLunch());
		System.out.println(object.playersDinner());
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
