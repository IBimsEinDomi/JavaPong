package de.dbuettner.pong;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;
import java.util.Timer;
import java.util.TimerTask;

public class BallKollision {
Timer kollision;
	public BallKollision() {
		kollision = new Timer();
		URL url = Gui.class.getResource("/point.wav");
		AudioClip point = Applet.newAudioClip(url);
		
		kollision.scheduleAtFixedRate(new TimerTask(){

			@Override
			public void run() {
				
				if(Variables.bally +50 >= Variables.screenheight){
					Variables.balldiry = -1;
				}
				
				if(Variables.bally <= 0){
					Variables.balldiry = 1;
				}
				
				if(Variables.ballx +20 >= Variables.screenwidth){
					
					Variables.ballx = Variables.screenwidth /2 -10;
					Variables.bally = Variables.screenheight /2 -10;
					
					Variables.balldirx = -1;
					Variables.playerAPoints += 1;
					point.play();
					
				}
				
				if(Variables.ballx <= 0){
					
					Variables.ballx = Variables.screenwidth /2 -10;
					Variables.bally = Variables.screenheight /2 -10;
					
					Variables.balldirx = 1;
					Variables.playerBPoints += 1;
					point.play();
					
					
				}
				
				if(Variables.ballx < Variables.Ax +25 && Variables.ballx > Variables.Ax && Variables.bally -20 < Variables.Ay + 150 &&  Variables.bally > Variables.Ay){
					Variables.balldirx = 1;
				}
				
				if(Variables.ballx < Variables.Bx && Variables.ballx > Variables.Bx -20 && Variables.bally -20 < Variables.By + 150 &&  Variables.bally > Variables.By){
					Variables.balldirx = -1;
				}
				
			}
			
		}, 0, Variables.ballMovementSpeed);
	}

}
