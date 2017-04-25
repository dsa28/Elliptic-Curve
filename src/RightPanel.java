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
import java.awt.Font;
import javax.swing.ImageIcon;

public class RightPanel extends JPanel {

	public JButton btnZoomIn;
	public JButton btnZoomOut;
	
	public JButton btnRight;
	public JButton btnLeft;
	public JButton btnUp;
	public JButton btnDown;
	
	/**
	 * Create the panel.
	 */
	public RightPanel() {
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);

		
		setPreferredSize(new Dimension(300, 533));
		setVisible(true);

		setBackground(SystemColor.window);
		
		JLabel lblControls = new JLabel("CONTROLS");
		springLayout.putConstraint(SpringLayout.WEST, lblControls, 102, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, lblControls, -407, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, lblControls, -101, SpringLayout.EAST, this);
		lblControls.setForeground(Color.BLACK);
		lblControls.setFont(new Font("Lucida Grande", Font.BOLD, 17));
		add(lblControls);
		
		 btnZoomIn = new JButton("");
		btnZoomIn.setIcon(new ImageIcon(RightPanel.class.getResource("/resources/zoom_in.png")));
		add(btnZoomIn);
		
		 btnZoomOut = new JButton("");
		springLayout.putConstraint(SpringLayout.WEST, btnZoomOut, 184, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, btnZoomIn, -56, SpringLayout.WEST, btnZoomOut);
		springLayout.putConstraint(SpringLayout.SOUTH, btnZoomIn, 0, SpringLayout.SOUTH, btnZoomOut);
		btnZoomOut.setIcon(new ImageIcon(RightPanel.class.getResource("/resources/zoom_out.png")));
		add(btnZoomOut);
		
		btnUp = new JButton("");
		springLayout.putConstraint(SpringLayout.NORTH, btnUp, 55, SpringLayout.SOUTH, lblControls);
		springLayout.putConstraint(SpringLayout.WEST, btnUp, 30, SpringLayout.WEST, lblControls);
		springLayout.putConstraint(SpringLayout.SOUTH, btnUp, 92, SpringLayout.SOUTH, lblControls);
		springLayout.putConstraint(SpringLayout.EAST, btnUp, -127, SpringLayout.EAST, this);
		btnUp.setIcon(new ImageIcon(RightPanel.class.getResource("/resources/arrow_up.png")));
		add(btnUp);
		
		btnDown = new JButton("");
		springLayout.putConstraint(SpringLayout.NORTH, btnDown, 49, SpringLayout.SOUTH, btnUp);
		springLayout.putConstraint(SpringLayout.WEST, btnDown, 132, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, btnDown, -229, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, btnDown, -127, SpringLayout.EAST, this);
		btnDown.setIcon(new ImageIcon(RightPanel.class.getResource("/resources/arrow_down.png")));
		add(btnDown);
		
		btnRight = new JButton("");
		springLayout.putConstraint(SpringLayout.NORTH, btnRight, 98, SpringLayout.SOUTH, lblControls);
		springLayout.putConstraint(SpringLayout.EAST, btnRight, -80, SpringLayout.EAST, this);
		springLayout.putConstraint(SpringLayout.NORTH, btnZoomOut, 102, SpringLayout.SOUTH, btnRight);
		btnRight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRight.setIcon(new ImageIcon(RightPanel.class.getResource("/resources/arrow_right.png")));
		add(btnRight);
		
		 btnLeft = new JButton("");
		springLayout.putConstraint(SpringLayout.WEST, btnRight, 51, SpringLayout.EAST, btnLeft);
		springLayout.putConstraint(SpringLayout.NORTH, btnLeft, 0, SpringLayout.NORTH, btnRight);
		springLayout.putConstraint(SpringLayout.WEST, btnLeft, 87, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, btnLeft, 37, SpringLayout.NORTH, btnRight);
		springLayout.putConstraint(SpringLayout.EAST, btnLeft, 0, SpringLayout.EAST, btnZoomIn);
		btnLeft.setIcon(new ImageIcon(RightPanel.class.getResource("/resources/arrow_left.png")));
		add(btnLeft);
		
		JButton btnMiddle = new JButton("");
		springLayout.putConstraint(SpringLayout.NORTH, btnMiddle, 43, SpringLayout.NORTH, btnUp);
		springLayout.putConstraint(SpringLayout.WEST, btnMiddle, 0, SpringLayout.WEST, btnUp);
		springLayout.putConstraint(SpringLayout.SOUTH, btnMiddle, -6, SpringLayout.NORTH, btnDown);
		springLayout.putConstraint(SpringLayout.EAST, btnMiddle, 0, SpringLayout.EAST, btnUp);
		add(btnMiddle);


		
	}
}