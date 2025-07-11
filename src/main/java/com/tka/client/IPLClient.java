package com.tka.client;

import java.util.List;

import com.tka.controller.IPLController;
import com.tka.entity.Player;
import com.tka.entity.Player;

public class IPLClient {

	public static void main(String[] args) {
		System.out.println("welcome to the IPL Client Application!");
		 System.out.println("In IPLUser class");
   	  
   	  IPLController iplcontroller=new IPLController();
   	  List<Player> allplayer_list=iplcontroller.getAllPlayers();
   	  
		System.out.println("allplayer list \n"+allplayer_list);

 Player player = new Player(105, 9, "virat", 2300, 0, "CSK");
		
  //int ack = iplcontroller.insertplayer(player);
		
		
	//if (ack > 0) {		
	//	System.out.println("Player inserted successfully");
	//} else {		
		//System.out.println("Player insertion failed");
		//}
	
	//int i=iplcontroller.updatedata(5400,103);
	//if (i != 0) 
	//{		
		//System.out.println("Player Updated Data successfully");
	//} else
	//{		
		//System.out.println("Player Data updation failed");
		//}
	
	
//	int a=iplcontroller.deleteplayer(103);
	//if (a != 0) 
	//{		
		//System.out.println("Player  Data  deleted successfully");
	//} else
	//{		
		//System.out.println("Player Data Not deleted ");
		//}

	
	List<Player> bowler=iplcontroller.BatsmanOrBowler(0);
	System.out.println(bowler);

	

	}

}
