import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.NumberFormat;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class Window extends JFrame{

	/**
	 * Class Window for a customized window
	 * 
	 */
	
	
	CartesianPlane p;
	
	void put(Point point)
	{
		p.addPoint(point);
		//p.repaint();
	}
	//Constructors
	//Can use the default window or name it
	Window()
	{
		CardLayout c = new CardLayout();
		JPanel panel = new JPanel();
		
		
		this.setSize(700, 600); //size of the window
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); //exit when press stop button

		//this.setVisible(true);
		this.setAlwaysOnTop(false);
		
	
		
		
		p = new CartesianPlane(this.getWidth(), this.getHeight());
	
	
		
		c.addLayoutComponent(p,"plane");
	
	
		
	
		panel.setLayout(c);
		panel.add(p);
		
		
		
		//Buttons
		JButton button = new JButton(">");
		button.addActionListener(new ActionListener()
		{public void actionPerformed(ActionEvent arg0){p.moveRight(50);};});
	
		JButton button2 = new JButton("<");
		button2.addActionListener(new ActionListener()
		{public void actionPerformed(ActionEvent arg0){p.moveLeft(50);};});
	
		JButton button3 = new JButton("^");
		button3.addActionListener(new ActionListener()
		{public void actionPerformed(ActionEvent arg0){p.moveUp(50);};});
	
		JButton button4 = new JButton("v");
		button4.addActionListener(new ActionListener()
		{public void actionPerformed(ActionEvent arg0){p.moveDown(50);};});
	
		JButton button5 = new JButton("+");
		button5.addActionListener(new ActionListener()
		{public void actionPerformed(ActionEvent arg0){p.zoomIn(2);};});
	
		JButton button6 = new JButton("-");
		button6.addActionListener(new ActionListener()
		{public void actionPerformed(ActionEvent arg0){p.zoomOut(2);};});
	
		JButton button7 = new JButton("select");
		button7.addActionListener(new ActionListener()
		{public void actionPerformed(ActionEvent arg0){p.setSelect();};});
	
		JButton button8 = new JButton("add");
		button8.addActionListener(new ActionListener()
		{public void actionPerformed(ActionEvent arg0){p.setAddition();};});
	
		JButton button9 = new JButton("multiply");
		button9.addActionListener(new ActionListener()
		{public void actionPerformed(ActionEvent arg0){p.setMultiplication();};});
	
		
		JPanel buttonPane = new JPanel();

		buttonPane.add(button2);
		buttonPane.add(button3);
		buttonPane.add(button);
		buttonPane.add(button4);
		buttonPane.add(button5);
		buttonPane.add(button6);
		buttonPane.add(button7);
		buttonPane.add(button8);
		buttonPane.add(button9);
		

		SpinnerModel nums = new SpinnerNumberModel(1,1,1000,1);
		JSpinner j = new JSpinner(nums);
		j.addChangeListener(new ChangeListener()
				{@Override
					public void stateChanged(ChangeEvent arg0) {
						// TODO Auto-generated method stub
					p.setScalar(j.getValue().toString());
						
					}});
		
		buttonPane.add(j);
		
		buttonPane.setVisible(true);
	
		this.getContentPane().add(buttonPane,BorderLayout.SOUTH);
		this.getContentPane().add(panel,BorderLayout.CENTER); //Set content pannel
		this.getContentPane().setVisible(true);
	
		
		//Always at the end
		this.setVisible(true);
	}
	
	Window(String name)
	{
		this();
		this.setTitle(name);
	}
	
}
