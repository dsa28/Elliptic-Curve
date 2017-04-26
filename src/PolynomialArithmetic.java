import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JToggleButton;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SpringLayout;
import javax.swing.JTextField;

public class PolynomialArithmetic extends JPanel {

	/**
	 * Create the panel.
	 */
	public PolynomialArithmetic() {
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);

		
		setVisible(true);

		setBackground(SystemColor.window);

		
		CenterPanel2 center = new CenterPanel2();
		LeftPanel2 left = new LeftPanel2();
		RightPanel2 right = new RightPanel2();
		LowerPanel2 lower = new LowerPanel2();
		UpperPanel2 upper = new UpperPanel2();
		
		this.setBounds(0, 0, 1950, 1273);
		this.setLayout(new BorderLayout(0, 0));
	
		
		this.add(upper,BorderLayout.NORTH);
		this.add(left, BorderLayout.WEST);
		this.add(right, BorderLayout.EAST);
		this.add(lower,BorderLayout.SOUTH);
		this.add(center,BorderLayout.CENTER);

		
	}
}