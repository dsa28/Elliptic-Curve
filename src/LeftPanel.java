import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JToggleButton;

import java.awt.BorderLayout;
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
		setBackground(SystemColor.window);
		
		JSpinner spinner = new JSpinner();
		springLayout.putConstraint(SpringLayout.WEST, spinner, 111, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, spinner, -131, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, spinner, -217, SpringLayout.EAST, this);
		spinner.setBounds(55, 11, 62, 20);
		add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		springLayout.putConstraint(SpringLayout.NORTH, spinner_1, 6, SpringLayout.SOUTH, spinner);
		springLayout.putConstraint(SpringLayout.WEST, spinner_1, 100, SpringLayout.WEST, this);
		spinner_1.setBounds(55, 54, 62, 20);
		add(spinner_1);
		
		JSpinner spinner_2 = new JSpinner();
		springLayout.putConstraint(SpringLayout.NORTH, spinner_2, 17, SpringLayout.SOUTH, spinner_1);
		springLayout.putConstraint(SpringLayout.WEST, spinner_2, 89, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, spinner_2, -200, SpringLayout.EAST, this);
		spinner_2.setBounds(55, 98, 62, 20);
		add(spinner_2);

		JLabel Operations = new JLabel("OPERATIONS");
		springLayout.putConstraint(SpringLayout.NORTH, Operations, 17, SpringLayout.SOUTH, spinner);
		springLayout.putConstraint(SpringLayout.WEST, Operations, 66, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, Operations, -11, SpringLayout.NORTH, spinner_1);
		springLayout.putConstraint(SpringLayout.EAST, Operations, -39, SpringLayout.EAST, this);
		add(Operations);
		
		JButton add_btn = new JButton("Add Points");
		springLayout.putConstraint(SpringLayout.EAST, spinner_1, -37, SpringLayout.EAST, add_btn);
		springLayout.putConstraint(SpringLayout.SOUTH, add_btn, -258, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.WEST, add_btn, 26, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, add_btn, -178, SpringLayout.EAST, this);
		add_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		add(add_btn);
		
		JButton btnMultiplyPointBy = new JButton("Multiply Point by");
		springLayout.putConstraint(SpringLayout.SOUTH, btnMultiplyPointBy, -58, SpringLayout.NORTH, Operations);
		springLayout.putConstraint(SpringLayout.EAST, btnMultiplyPointBy, -10, SpringLayout.EAST, this);
		add(btnMultiplyPointBy);
		
		JToggleButton select_btn = new JToggleButton("Select Points");
		springLayout.putConstraint(SpringLayout.WEST, select_btn, 0, SpringLayout.WEST, Operations);
		springLayout.putConstraint(SpringLayout.SOUTH, select_btn, -58, SpringLayout.NORTH, spinner);
		springLayout.putConstraint(SpringLayout.EAST, select_btn, -184, SpringLayout.EAST, this);
		add(select_btn);
		
	}
}
