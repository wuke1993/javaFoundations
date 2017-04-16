package chap06;

import java.awt.event.*;
import javax.swing.*;

public class Hear
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Hear");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//frame.getContentPane().add(new HearPanel());
		frame.setContentPane(new HearPanel());
		
		frame.pack();
		frame.setVisible(true);
	}
}
