package com.tka.service;

import java.util.LinkedList;
import java.util.List;

import com.tka.dao.IPLDao;
import com.tka.entity.Player;

public class IPLService {
private IPLDao iplDao = null;
	
	public List<Player> getAllPlayers() {
		System.out.println("In IPLService.getAllPlayers() method");
		
		iplDao = new IPLDao();
		List<Player> allPlayersList = iplDao.getallplayers();
		
		return allPlayersList;
	}

	public int insertPlayer(Player player) {
		iplDao = new IPLDao();
		int ack = iplDao.insertPlayer(player);
		
		return ack;
	}

	public int updatePlayer(int i, int j) {
		iplDao=new IPLDao();
		int ack2=iplDao.updatePlayer(i,j);
		return ack2;
	}

	

	public int deletePlayer(int d) {
		iplDao=new IPLDao();
		int ack3=iplDao.deletePlayer(d);
		return ack3;
	}

	public List<Player> BatsmanOrBowler(int i)
	{
		List<Player> bowler=new LinkedList<>();
		List<Player> batsman=new LinkedList<>();
		iplDao=new IPLDao();
		List<Player> p=iplDao.getallplayers();
		for(Player Players:p) {
			if(Players.getWickets()==0) {
				batsman.add(Players);
			}
			
		}
		return batsman;
		
	}


}
