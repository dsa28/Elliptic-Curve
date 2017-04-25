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

public class PolynomialArithmetic extends JPanel {

	/**
	 * Create the panel.
	 */
	public PolynomialArithmetic() {
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);

		
		setPreferredSize(new Dimension(595,527));
		setVisible(true);

		setBackground(SystemColor.window);
		
		JButton btnDivide = new JButton("Divide");
		springLayout.putConstraint(SpringLayout.NORTH, btnDivide, 156, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, btnDivide, -237, SpringLayout.EAST, this);
		add(btnDivide);
		
		JButton btnInverse = new JButton("Inverse");
		springLayout.putConstraint(SpringLayout.NORTH, btnInverse, 0, SpringLayout.NORTH, btnDivide);
		springLayout.putConstraint(SpringLayout.EAST, btnInverse, -26, SpringLayout.WEST, btnDivide);
		add(btnInverse);
		
		JButton btnAdd = new JButton("Add");
		springLayout.putConstraint(SpringLayout.NORTH, btnAdd, 32, SpringLayout.SOUTH, btnDivide);
		add(btnAdd);
		
		JButton btnMultiply = new JButton("Multiply");
		springLayout.putConstraint(SpringLayout.NORTH, btnMultiply, 69, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, btnMultiply, 77, SpringLayout.WEST, this);
		add(btnMultiply);
		
		JButton btnNewButton_3 = new JButton("New button");
		springLayout.putConstraint(SpringLayout.WEST, btnAdd, 33, SpringLayout.EAST, btnNewButton_3);
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_3, 7, SpringLayout.SOUTH, btnInverse);
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton_3, 0, SpringLayout.EAST, btnMultiply);
		add(btnNewButton_3);


		
	}
}