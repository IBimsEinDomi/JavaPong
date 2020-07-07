package de.dbuettner.pong;

import javax.swing.JFrame;

public class Gui {

	public Gui() {
	
		Variables.jf1 = new JFrame();
		Variables.jf1.setSize(Variables.screenwidth, Variables.screenheight);
		Variables.jf1.setTitle("Pong");
		Variables.jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Variables.jf1.setLayout(null);
		Variables.jf1.setResizable(false);
		Variables.jf1.setVisible(true);
		Variables.jf1.setLocationRelativeTo(null);
		Variables.jf1.addKeyListener(new KeyHandler());
		Variables.jf1.requestFocus();
		
		Draw lbldraw = new Draw();
		lbldraw.setBounds(0,0, Variables.screenwidth, Variables.screenheight);
		lbldraw.setVisible(true);
		Variables.jf1.add(lbldraw);
	}

}
