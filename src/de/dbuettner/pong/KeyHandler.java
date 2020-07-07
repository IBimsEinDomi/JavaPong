package de.dbuettner.pong;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {

		if (e.getKeyCode() == KeyEvent.VK_W) {
			Variables.moveupA = true;
		
		} else if (e.getKeyCode() == KeyEvent.VK_S) {
			Variables.movedownA = true;
		}if (e.getKeyCode() == KeyEvent.VK_UP) {
			Variables.moveupB = true;
		
		} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			Variables.movedownB = true;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {

		if (e.getKeyCode() == KeyEvent.VK_W) {
			Variables.moveupA = false;
		} else if (e.getKeyCode() == KeyEvent.VK_S) {
			Variables.movedownA = false;
		}if (e.getKeyCode() == KeyEvent.VK_UP) {
			Variables.moveupB = false;
		} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			Variables.movedownB = false;
		}
		
	}

}
