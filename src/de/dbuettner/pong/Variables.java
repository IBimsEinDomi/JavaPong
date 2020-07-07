package de.dbuettner.pong;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.IOException;

import javax.swing.*;

public class Variables {

	static JFrame jf1;
	static int screenwidth = 1400, screenheight = 1000;
	
	static int Ax = 20, Ay = 415;
	static int Bx = 1355, By = 415;
	static int ballx = 200, bally = 200;
	static int ballMovementSpeed = 4;
	
	static boolean moveupA = false, movedownA = false;
	static boolean moveupB = false, movedownB = false;
	
	static int balldirx = 1, balldiry = -1;
	
	static int playerAPoints = 0, playerBPoints = 0;
	
	static Font pixelfont;
	
	public Variables() {
		
		try {
			pixelfont = Font.createFont(Font.TRUETYPE_FONT, ResourceLoader.load("pixelfont.ttf")).deriveFont(125f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, ResourceLoader.load("pixelfont.ttf")));
		} catch (FontFormatException | IOException e) {
			e.printStackTrace();
		}
		
	}

}
