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

public class LeftPanel extends JPanel {

	public JSpinner spinner;
	public JSpinner spinner_1;
	public JSpinner spinner_2;
	public JSpinner spinner_3;
	
	public JButton btnAdd;
	public JButton btnMultiplyBy;
	public JButton tglbtnSelect;
	
	public ArrayList<String> p = new ArrayList<String>();
	
	private void findPrimes(int n)
	{
		boolean[] nums = new boolean[n];
		for (int i=0;i<n;i++)
		{
			nums[i] = true;
		}
		
		p.add("1");
		
		for (int i=2; i<n; i++)
		{
		
		if (nums[i])
		{
			p.add(i + "");
			
			for (int j=0; j*i<n; j++)
			{
				nums[j*i] = false; //not prime
			}
		}
			
		}
	}

	/**
	 * Create the panel.
	 */
	public LeftPanel() {
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);

		
		setPreferredSize(new Dimension(400, 533));
		setVisible(true);

		setBackground(SystemColor.window);
		
		JSeparator separator = new JSeparator();
		springLayout.putConstraint(SpringLayout.NORTH, separator, 254, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, separator, 259, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, separator, -263, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, separator, -276, SpringLayout.EAST, this);
		add(separator);
		
		JLabel lblNewLabel = new JLabel("Specify A");
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 30, SpringLayout.WEST, this);
		add(lblNewLabel);
		
		JLabel lblSpecifyB = new JLabel("Specify B");
		springLayout.putConstraint(SpringLayout.NORTH, lblSpecifyB, 109, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel, -20, SpringLayout.NORTH, lblSpecifyB);
		springLayout.putConstraint(SpringLayout.WEST, lblSpecifyB, 30, SpringLayout.WEST, this);
		add(lblSpecifyB);
		
		JLabel lblSpecifyP = new JLabel("Specify P");
		springLayout.putConstraint(SpringLayout.NORTH, lblSpecifyP, 23, SpringLayout.SOUTH, lblSpecifyB);
		springLayout.putConstraint(SpringLayout.WEST, lblSpecifyP, 30, SpringLayout.WEST, this);
		add(lblSpecifyP);
		
		JLabel lblInputParameters = new JLabel("INPUT PARAMETERS");
		lblInputParameters.setForeground(Color.BLACK);
		springLayout.putConstraint(SpringLayout.NORTH, lblInputParameters, 10, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, lblInputParameters, 0, SpringLayout.WEST, lblNewLabel);
		lblInputParameters.setFont(new Font("Lucida Grande", Font.BOLD, 17));
		add(lblInputParameters);
		
		JLabel lblOperations = new JLabel("OPERATIONS");
		springLayout.putConstraint(SpringLayout.WEST, lblOperations, 0, SpringLayout.WEST, lblNewLabel);
		lblOperations.setFont(new Font("Lucida Grande", Font.BOLD, 17));
		add(lblOperations);
		
		JLabel lblNewLabel_1 = new JLabel("A and B are two integers, P is a prime number");
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_1, 30, SpringLayout.WEST, this);
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		add(lblNewLabel_1);
		
		spinner = new JSpinner();
		springLayout.putConstraint(SpringLayout.WEST, spinner, 69, SpringLayout.EAST, lblNewLabel);
		springLayout.putConstraint(SpringLayout.EAST, spinner, -163, SpringLayout.EAST, this);
		add(spinner);
		
		
		
		spinner_1 = new JSpinner();
		springLayout.putConstraint(SpringLayout.WEST, spinner_1, 71, SpringLayout.EAST, lblSpecifyB);
		springLayout.putConstraint(SpringLayout.EAST, spinner_1, -163, SpringLayout.EAST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, spinner, -10, SpringLayout.NORTH, spinner_1);
		springLayout.putConstraint(SpringLayout.NORTH, spinner_1, 104, SpringLayout.NORTH, this);
		add(spinner_1);
		
		
		 p = new ArrayList<String>();
		findPrimes(600);
		
		SpinnerModel primes = new SpinnerListModel(p);
		spinner_2 = new JSpinner(primes);
		springLayout.putConstraint(SpringLayout.WEST, spinner_2, 71, SpringLayout.EAST, lblSpecifyP);
		springLayout.putConstraint(SpringLayout.EAST, spinner_2, -163, SpringLayout.EAST, this);
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 32, SpringLayout.SOUTH, spinner_2);
		springLayout.putConstraint(SpringLayout.NORTH, spinner_2, 13, SpringLayout.SOUTH, spinner_1);
		add(spinner_2);
		
		btnAdd = new JButton("Add");
		springLayout.putConstraint(SpringLayout.EAST, lblOperations, 0, SpringLayout.EAST, btnAdd);
		springLayout.putConstraint(SpringLayout.WEST, btnAdd, 0, SpringLayout.WEST, lblNewLabel);
		springLayout.putConstraint(SpringLayout.EAST, btnAdd, -256, SpringLayout.EAST, this);
		add(btnAdd);
		
		JLabel lblSelectAPoints = new JLabel("Select a point/s then choose whether to add them or multiply one by a scalar ");
		springLayout.putConstraint(SpringLayout.SOUTH, lblOperations, -39, SpringLayout.NORTH, lblSelectAPoints);
		springLayout.putConstraint(SpringLayout.NORTH, lblSelectAPoints, 331, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, lblSelectAPoints, -10, SpringLayout.EAST, this);
		lblSelectAPoints.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		add(lblSelectAPoints);
		
		btnMultiplyBy = new JButton("Multiply by");
		springLayout.putConstraint(SpringLayout.WEST, btnMultiplyBy, 30, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, btnAdd, -6, SpringLayout.NORTH, btnMultiplyBy);
		springLayout.putConstraint(SpringLayout.NORTH, btnMultiplyBy, 452, SpringLayout.NORTH, this);
		add(btnMultiplyBy);
		
		 tglbtnSelect = new JButton("Select");
		
		springLayout.putConstraint(SpringLayout.NORTH, tglbtnSelect, 358, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.SOUTH, lblSelectAPoints, -6, SpringLayout.NORTH, tglbtnSelect);
		springLayout.putConstraint(SpringLayout.WEST, tglbtnSelect, 0, SpringLayout.WEST, lblNewLabel);
		springLayout.putConstraint(SpringLayout.EAST, tglbtnSelect, 0, SpringLayout.EAST, lblOperations);
		add(tglbtnSelect);
		
		
		SpinnerModel nums = new SpinnerNumberModel(1,1,1000,1);
		 spinner_3 = new JSpinner(nums);
		springLayout.putConstraint(SpringLayout.EAST, btnMultiplyBy, -13, SpringLayout.WEST, spinner_3);
		springLayout.putConstraint(SpringLayout.NORTH, spinner_3, 100, SpringLayout.SOUTH, lblSelectAPoints);
		springLayout.putConstraint(SpringLayout.WEST, spinner_3, 157, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, spinner_3, 126, SpringLayout.SOUTH, lblSelectAPoints);
		springLayout.putConstraint(SpringLayout.EAST, spinner_3, -163, SpringLayout.EAST, this);
		add(spinner_3);


		
	}
}
