package com.amplet;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Launcher {
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("projeto amplet");
		
		frame.setSize(new Dimension(500,500));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Box box = Box.createVerticalBox();	
		
		JPanel panel = new JPanel();
		
		JButton btn1 = new JButton("OK");	
		
		frame.add(btn1);
		
		frame.add(box, BorderLayout.CENTER);
		
		
		
		frame.setVisible(true);
		
	}
}
