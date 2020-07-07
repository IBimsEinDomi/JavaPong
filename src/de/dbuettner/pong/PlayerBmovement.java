package de.dbuettner.pong;

import java.util.Timer;
import java.util.TimerTask;

public class PlayerBmovement {
Timer move;
	public PlayerBmovement() {
		move = new Timer();
		move.scheduleAtFixedRate(new TimerTask(){

			@Override
			public void run() {
				
				if(Variables.moveupB == true){
					
					if(Variables.By >=20){
						Variables.By -=2;
					}
				}else if(Variables.movedownB == true){
					
					if(Variables.By <= Variables.screenheight - 200){
						Variables.By += 2;
					}
				}
				
			}
			
		}, 0, 6);
	}

}
