import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JSpinner;
import java.awt.FlowLayout;
import javax.swing.SpringLayout;

public class LeftPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public LeftPanel() {
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		
		JButton btnNewButton = new JButton("New button");
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton, 32, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton, -38, SpringLayout.SOUTH, this);
		btnNewButton.setBounds(28, 266, 89, 23);
		add(btnNewButton);
		
		JSpinner spinner = new JSpinner();
		springLayout.putConstraint(SpringLayout.WEST, spinner, 49, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, spinner, -21, SpringLayout.EAST, this);
		spinner.setBounds(55, 11, 62, 20);
		add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		springLayout.putConstraint(SpringLayout.NORTH, spinner_1, 25, SpringLayout.SOUTH, spinner);
		springLayout.putConstraint(SpringLayout.WEST, spinner_1, 0, SpringLayout.WEST, spinner);
		springLayout.putConstraint(SpringLayout.EAST, spinner_1, -21, SpringLayout.EAST, this);
		spinner_1.setBounds(55, 54, 62, 20);
		add(spinner_1);
		
		JSpinner spinner_2 = new JSpinner();
		springLayout.putConstraint(SpringLayout.WEST, spinner_2, 49, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, spinner_2, -226, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, spinner_2, -21, SpringLayout.EAST, this);
		springLayout.putConstraint(SpringLayout.NORTH, spinner, 17, SpringLayout.SOUTH, spinner_2);
		spinner_2.setBounds(55, 98, 62, 20);
		add(spinner_2);

	}
}
