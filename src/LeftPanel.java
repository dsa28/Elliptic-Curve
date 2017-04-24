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

public class LeftPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public LeftPanel() {
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);

		
		setPreferredSize(new Dimension(185,306));
		setVisible(true);
<<<<<<< HEAD
		setBackground(Color.WHITE);


=======
		setBackground(SystemColor.window);

		JLabel Operations = new JLabel("OPERATIONS");
		springLayout.putConstraint(SpringLayout.WEST, Operations, 66, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, Operations, -39, SpringLayout.EAST, this);
		add(Operations);
		
		JButton btnMultiplyPointBy = new JButton("Multiply Point by");
		add(btnMultiplyPointBy);
		
		JSpinner spinner = new JSpinner();
		springLayout.putConstraint(SpringLayout.EAST, spinner, -13, SpringLayout.EAST, this);
		add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		springLayout.putConstraint(SpringLayout.NORTH, spinner, 6, SpringLayout.SOUTH, spinner_1);
		springLayout.putConstraint(SpringLayout.WEST, spinner_1, 0, SpringLayout.WEST, Operations);
		springLayout.putConstraint(SpringLayout.EAST, spinner_1, -12, SpringLayout.EAST, this);
		add(spinner_1);
		
		JSpinner spinner_2 = new JSpinner();
		springLayout.putConstraint(SpringLayout.EAST, spinner_2, -13, SpringLayout.EAST, this);
		springLayout.putConstraint(SpringLayout.NORTH, spinner_1, 6, SpringLayout.SOUTH, spinner_2);
		add(spinner_2);
		
		JButton btnAddPoints = new JButton("Add Points");
		springLayout.putConstraint(SpringLayout.EAST, btnAddPoints, 0, SpringLayout.EAST, Operations);
		add(btnAddPoints);
		
		JToggleButton btnSelectPoints = new JToggleButton("Select Points");
		springLayout.putConstraint(SpringLayout.WEST, btnSelectPoints, 22, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.NORTH, btnMultiplyPointBy, 6, SpringLayout.SOUTH, btnSelectPoints);
		springLayout.putConstraint(SpringLayout.WEST, btnMultiplyPointBy, 0, SpringLayout.WEST, btnSelectPoints);
		springLayout.putConstraint(SpringLayout.NORTH, Operations, 45, SpringLayout.SOUTH, btnSelectPoints);
		springLayout.putConstraint(SpringLayout.SOUTH, Operations, -74, SpringLayout.NORTH, btnSelectPoints);
		springLayout.putConstraint(SpringLayout.NORTH, btnSelectPoints, 39, SpringLayout.SOUTH, spinner);
		add(btnSelectPoints);
		
		JLabel lblSelectA = new JLabel("Select A");
		springLayout.putConstraint(SpringLayout.EAST, lblSelectA, -123, SpringLayout.EAST, this);
		springLayout.putConstraint(SpringLayout.WEST, spinner_2, 3, SpringLayout.EAST, lblSelectA);
		springLayout.putConstraint(SpringLayout.NORTH, spinner_2, -5, SpringLayout.NORTH, lblSelectA);
		springLayout.putConstraint(SpringLayout.NORTH, lblSelectA, 10, SpringLayout.NORTH, this);
		add(lblSelectA);
		
		JLabel lblSelectB = new JLabel("Select B");
		springLayout.putConstraint(SpringLayout.NORTH, lblSelectB, 5, SpringLayout.NORTH, spinner_1);
		springLayout.putConstraint(SpringLayout.EAST, lblSelectB, -6, SpringLayout.WEST, spinner_1);
		add(lblSelectB);
		
		JLabel lblSelectP = new JLabel("Select P");
		springLayout.putConstraint(SpringLayout.EAST, lblSelectP, -126, SpringLayout.EAST, this);
		springLayout.putConstraint(SpringLayout.WEST, spinner, 6, SpringLayout.EAST, lblSelectP);
		springLayout.putConstraint(SpringLayout.NORTH, lblSelectP, 5, SpringLayout.NORTH, spinner);
		add(lblSelectP);
		
		JSpinner spinner_3 = new JSpinner();
		springLayout.putConstraint(SpringLayout.NORTH, btnAddPoints, 6, SpringLayout.SOUTH, spinner_3);
		springLayout.putConstraint(SpringLayout.NORTH, spinner_3, 6, SpringLayout.SOUTH, btnMultiplyPointBy);
		springLayout.putConstraint(SpringLayout.WEST, spinner_3, 32, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, spinner_3, 111, SpringLayout.WEST, btnMultiplyPointBy);
		add(spinner_3);
>>>>>>> origin/master
		
	}
}
