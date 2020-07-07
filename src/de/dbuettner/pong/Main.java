package de.dbuettner.pong;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;

public class Main {

	public static void main(String[] args) {
		
		URL url = Gui.class.getResource("/start.wav");
		AudioClip start = Applet.newAudioClip(url);
		start.play();
		
		new Gui();
		new Variables();
		new PlayerAmovement();
		new PlayerBmovement();
		new BallMovement();
		new BallKollision();
	}

}
