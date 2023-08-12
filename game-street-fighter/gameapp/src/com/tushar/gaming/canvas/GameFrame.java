package com.tushar.gaming.canvas;

import javax.swing.JFrame;

public class GameFrame extends JFrame {

	public GameFrame() {
		setResizable(false);
		setTitle("Streen Fighter Game");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(1400, 900);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		GameFrame obj = new GameFrame();
	}

}
