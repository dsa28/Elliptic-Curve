import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JToggleButton;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.SpringLayout;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTable;

public class PolynomialWelcome extends JPanel {

public PolynomialWelcome() {
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);

		
		setPreferredSize(new Dimension(1950, 1273));
		setVisible(true);

		setBackground(SystemColor.window);
		
		JLabel label = new JLabel("New label");
		label.setIcon(new ImageIcon(PolynomialWelcome.class.getResource("/resources/Welcome_Polynomial.png")));
		springLayout.putConstraint(SpringLayout.NORTH, label, 0, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, label, 0, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, label, 0, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, label, 0, SpringLayout.EAST, this);
		add(label);
		
		JButton btnStartPoly = new JButton("Start");
		springLayout.putConstraint(SpringLayout.NORTH, label, 0, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, label, 184, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, label, -56, SpringLayout.EAST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, label, 0, SpringLayout.SOUTH, this);
		add(btnStartPoly);}
}
