package de.dbuettner.pong;

import java.util.Timer;
import java.util.TimerTask;

public class PlayerAmovement {
Timer move;
	public PlayerAmovement() {
		move = new Timer();
		move.scheduleAtFixedRate(new TimerTask(){

			@Override
			public void run() {
				
				if(Variables.moveupA == true){
					
					if(Variables.Ay >=20){
						Variables.Ay -=2;
					}
				}else if(Variables.movedownA == true){
					
					if(Variables.Ay <= Variables.screenheight - 200){
						Variables.Ay += 2;
					}
				}
				
			}
			
		}, 0, 6);
	}

}
