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
	
		this.setBounds(0, 0, 1950, 1273);
		this.setLayout(new BorderLayout(0, 0));
	
		this.add(center,BorderLayout.CENTER);

		
	}
}