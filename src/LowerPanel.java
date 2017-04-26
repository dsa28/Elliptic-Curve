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

public class LowerPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public LowerPanel() {
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);

		
		setPreferredSize(new Dimension(1950,100));
		setVisible(true);

		setBackground(SystemColor.window);
		
		JLabel lblNewLabel_1 = new JLabel("");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 10, SpringLayout.NORTH, this);
		lblNewLabel_1.setIcon(new ImageIcon(LowerPanel.class.getResource("/resources/c2.png")));
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_3, 288, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel_1, -66, SpringLayout.WEST, lblNewLabel_3);
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel_3, -10, SpringLayout.SOUTH, this);
		lblNewLabel_3.setIcon(new ImageIcon(LowerPanel.class.getResource("/resources/c5.png")));
		add(lblNewLabel_3);
		
		JLabel label_1 = new JLabel("");
		springLayout.putConstraint(SpringLayout.NORTH, label_1, 10, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, label_1, 209, SpringLayout.EAST, lblNewLabel_1);
		label_1.setIcon(new ImageIcon(LowerPanel.class.getResource("/resources/c4.png")));
		add(label_1);
		
		JLabel lblNewLabel_6 = new JLabel("");
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_6, 282, SpringLayout.EAST, lblNewLabel_1);
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel_6, -30, SpringLayout.SOUTH, this);
		lblNewLabel_6.setIcon(new ImageIcon(LowerPanel.class.getResource("/resources/c5.png")));
		add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("");
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel_7, 0, SpringLayout.SOUTH, lblNewLabel_3);
		lblNewLabel_7.setIcon(new ImageIcon(LowerPanel.class.getResource("/resources/c5.png")));
		add(lblNewLabel_7);
		
		JLabel label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon(LowerPanel.class.getResource("/resources/c3.png")));
		springLayout.putConstraint(SpringLayout.SOUTH, label_5, 0, SpringLayout.SOUTH, lblNewLabel_1);
		add(label_5);
		
		JLabel label_7 = new JLabel("");
		springLayout.putConstraint(SpringLayout.WEST, label_5, 272, SpringLayout.EAST, label_7);
		springLayout.putConstraint(SpringLayout.NORTH, label_7, 20, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, label_7, -688, SpringLayout.EAST, this);
		label_7.setIcon(new ImageIcon(LowerPanel.class.getResource("/resources/c5.png")));
		add(label_7);
		
		JLabel label_8 = new JLabel("");
		springLayout.putConstraint(SpringLayout.WEST, label_8, 1162, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel_7, -409, SpringLayout.WEST, label_8);
		label_8.setIcon(new ImageIcon(LowerPanel.class.getResource("/resources/c5.png")));
		springLayout.putConstraint(SpringLayout.NORTH, label_8, 0, SpringLayout.NORTH, lblNewLabel_3);
		add(label_8);


		
	}
}