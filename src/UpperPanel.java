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
import javax.swing.ImageIcon;

public class UpperPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public UpperPanel() {
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);

		
		setPreferredSize(new Dimension(1950,60));
		setVisible(true);

		setBackground(SystemColor.window);
		
		JLabel lblNewLabel = new JLabel("");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 10, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 10, SpringLayout.WEST, this);
		add(lblNewLabel);
		
		JLabel label_1 = new JLabel("");
		springLayout.putConstraint(SpringLayout.NORTH, label_1, 0, SpringLayout.NORTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.WEST, label_1, 155, SpringLayout.WEST, this);
		label_1.setIcon(new ImageIcon(UpperPanel.class.getResource("/resources/c4.png")));
		add(label_1);
		
		JLabel label_2 = new JLabel("");
		springLayout.putConstraint(SpringLayout.WEST, label_2, 100, SpringLayout.EAST, label_1);
		springLayout.putConstraint(SpringLayout.SOUTH, label_2, -27, SpringLayout.SOUTH, this);
		label_2.setIcon(new ImageIcon(UpperPanel.class.getResource("/resources/c5.png")));
		add(label_2);
		
		JLabel label_4 = new JLabel("");
		springLayout.putConstraint(SpringLayout.NORTH, label_4, 0, SpringLayout.NORTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.WEST, label_4, 428, SpringLayout.WEST, this);
		label_4.setIcon(new ImageIcon(UpperPanel.class.getResource("/resources/c5.png")));
		add(label_4);
		
		JLabel label_7 = new JLabel("");
		springLayout.putConstraint(SpringLayout.WEST, label_7, 775, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, label_7, -27, SpringLayout.SOUTH, this);
		label_7.setIcon(new ImageIcon(UpperPanel.class.getResource("/resources/c5.png")));
		add(label_7);
		
		JLabel label_10 = new JLabel("");
		springLayout.putConstraint(SpringLayout.SOUTH, label_10, -10, SpringLayout.SOUTH, this);
		label_10.setIcon(new ImageIcon(UpperPanel.class.getResource("/resources/c4.png")));
		add(label_10);
		
		JLabel label_13 = new JLabel("");
		springLayout.putConstraint(SpringLayout.SOUTH, label_13, -10, SpringLayout.SOUTH, this);
		label_13.setIcon(new ImageIcon(UpperPanel.class.getResource("/resources/c4.png")));
		add(label_13);
		
		JLabel label_15 = new JLabel("");
		springLayout.putConstraint(SpringLayout.EAST, label_10, -293, SpringLayout.WEST, label_15);
		springLayout.putConstraint(SpringLayout.WEST, label_13, 69, SpringLayout.EAST, label_15);
		springLayout.putConstraint(SpringLayout.SOUTH, label_15, -27, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, label_15, -487, SpringLayout.EAST, this);
		label_15.setIcon(new ImageIcon(UpperPanel.class.getResource("/resources/c5.png")));
		add(label_15);


		
	}
}