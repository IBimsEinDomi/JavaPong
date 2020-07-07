package de.dbuettner.pong;

import java.util.Timer;
import java.util.TimerTask;

public class BallMovement {
	Timer timer;
	
	class SpeedMovement extends TimerTask{
		@Override
		public void run() {
			Variables.ballx += Variables.balldirx;
			Variables.bally += Variables.balldiry;
		}
	}
	public BallMovement() {
		timer = new Timer();
		timer.scheduleAtFixedRate(new SpeedMovement(), 0, Variables.ballMovementSpeed);
	}

}
