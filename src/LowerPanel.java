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

public class LowerPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public LowerPanel() {
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);

		
		setPreferredSize(new Dimension(185,60));
		setVisible(true);

		setBackground(SystemColor.window);


		
	}
}