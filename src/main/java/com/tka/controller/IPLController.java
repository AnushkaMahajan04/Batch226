package com.tka.controller;

import java.util.List;

import com.tka.entity.Player;
import com.tka.service.IPLService;

public class IPLController {
	private IPLService iplservice=null;
	public List<Player> getAllPlayers() {
		System.out.println("In IPLController.getAllPlayers() method");
		
		 iplservice=new IPLService();
		 List<Player> allplayer=iplservice.getAllPlayers();
		 
		
		return allplayer;
	}
	public int insertplayer(Player player) {
		
		
		iplservice = new IPLService();
		int ack = iplservice.insertPlayer(player);
		
		return ack;
	}
	
	public int updatedata(int i, int j) {
		iplservice = new IPLService();
		int ack2 = iplservice.updatePlayer(i,j);
		
		return ack2;
	}
	
	public int deleteplayer(int d) {
	    iplservice = new IPLService();
	    int ack3 = iplservice.deletePlayer(d);
	    
	    return ack3;
	}
	public List<Player> BatsmanOrBowler(int i) {
		iplservice =new IPLService();
		List<Player> role=iplservice.BatsmanOrBowler(i);
		return role;
	


		
		
	}
}
