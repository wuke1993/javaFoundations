package chap06;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.*;

import javax.swing.*;


public class HearPanel extends JPanel
{
	private JLabel label;
	private int num;
	private JButton button;
	
	public HearPanel()
	{
		num = 0;
	    label = new JLabel("You Can Click It !");	
	    button = new JButton("Click Me!");	
	    
	    ButtonListener listener = new ButtonListener();
	    button.addActionListener(listener);
	
	    add(label);
	    add(button);
	    
	    setPreferredSize(new Dimension(300,50));
	    setBackground(Color.yellow);
	}
	
	private class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			num++;
			label.setText("You Click It " + num + " times!");
		}
	}

}
