package de.dbuettner.pong;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JLabel;

@SuppressWarnings("serial")
public class Draw extends JLabel{

	protected void paintComponent(Graphics g){
		
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, Variables.screenwidth, Variables.screenheight);
		
		g.setColor(Color.WHITE);
		
		for(int i = 0; i<= 50; i++){
			g.fillRect(Variables.screenwidth/2 -5, i * 20, 10, 10);
		}
		
		g.fillRect(Variables.Ax, Variables.Ay, 25, 150);
		g.fillRect(Variables.Bx, Variables.By, 25, 150);
		
		g.setFont(Variables.pixelfont);
		g.drawString("" + Variables.playerAPoints, Variables.screenwidth/2 - 95, 75);
		g.drawString("" + Variables.playerBPoints, Variables.screenwidth/2 + 50, 75);
		
		g.fillRect(Variables.ballx, Variables.bally, 20, 20);
		
		repaint();
		
	}
	
}
