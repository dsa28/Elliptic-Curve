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

		
		setPreferredSize(new Dimension(400, 588));
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
		springLayout.putConstraint(SpringLayout.NORTH, lblInputParameters, 14, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, lblInputParameters, 0, SpringLayout.WEST, lblNewLabel);
		lblInputParameters.setForeground(Color.BLACK);
		lblInputParameters.setFont(new Font("Lucida Grande", Font.BOLD, 17));
		add(lblInputParameters);
		
		JLabel lblOperations = new JLabel("OPERATIONS");
		springLayout.putConstraint(SpringLayout.WEST, lblOperations, 30, SpringLayout.WEST, this);
		lblOperations.setFont(new Font("Lucida Grande", Font.BOLD, 17));
		add(lblOperations);
		
		JLabel lblNewLabel_1 = new JLabel("A and B are two integers, P is a prime number");
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_1, 0, SpringLayout.WEST, lblNewLabel);
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
		springLayout.putConstraint(SpringLayout.NORTH, spinner_2, 13, SpringLayout.SOUTH, spinner_1);
		add(spinner_2);
		
		btnAdd = new JButton("Add");
		springLayout.putConstraint(SpringLayout.WEST, btnAdd, 0, SpringLayout.WEST, lblNewLabel);
		springLayout.putConstraint(SpringLayout.EAST, btnAdd, 0, SpringLayout.EAST, lblOperations);
		add(btnAdd);
		
		JLabel lblSelectAPoints = new JLabel("\"C\" clears the selected points");
		springLayout.putConstraint(SpringLayout.WEST, lblSelectAPoints, 0, SpringLayout.WEST, lblNewLabel);
		lblSelectAPoints.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		add(lblSelectAPoints);
		
		btnMultiplyBy = new JButton("Multiply by");
		springLayout.putConstraint(SpringLayout.NORTH, btnMultiplyBy, 372, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.SOUTH, btnAdd, -6, SpringLayout.NORTH, btnMultiplyBy);
		springLayout.putConstraint(SpringLayout.WEST, btnMultiplyBy, 30, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, btnMultiplyBy, 0, SpringLayout.EAST, lblOperations);
		add(btnMultiplyBy);
		
		 tglbtnSelect = new JButton("C");
		 springLayout.putConstraint(SpringLayout.EAST, lblOperations, -13, SpringLayout.WEST, tglbtnSelect);
		 springLayout.putConstraint(SpringLayout.EAST, tglbtnSelect, -46, SpringLayout.EAST, lblNewLabel_1);
		 springLayout.putConstraint(SpringLayout.WEST, tglbtnSelect, 0, SpringLayout.WEST, spinner);
		 tglbtnSelect.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 	}
		 });
		add(tglbtnSelect);
		
		
		SpinnerModel nums = new SpinnerNumberModel(1,1,1000,1);
		 spinner_3 = new JSpinner(nums);
		 springLayout.putConstraint(SpringLayout.NORTH, spinner_3, 0, SpringLayout.NORTH, btnMultiplyBy);
		 springLayout.putConstraint(SpringLayout.WEST, spinner_3, 0, SpringLayout.WEST, spinner);
		 springLayout.putConstraint(SpringLayout.EAST, spinner_3, 0, SpringLayout.EAST, lblNewLabel_1);
		add(spinner_3);
		
		JLabel lblrandomGeneratesA = new JLabel("\"R\" generates A, B and P randomly");
		springLayout.putConstraint(SpringLayout.SOUTH, tglbtnSelect, 69, SpringLayout.SOUTH, lblrandomGeneratesA);
		springLayout.putConstraint(SpringLayout.NORTH, lblOperations, 39, SpringLayout.SOUTH, lblrandomGeneratesA);
		springLayout.putConstraint(SpringLayout.NORTH, tglbtnSelect, 35, SpringLayout.SOUTH, lblrandomGeneratesA);
		springLayout.putConstraint(SpringLayout.NORTH, lblrandomGeneratesA, 221, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel_1, -6, SpringLayout.NORTH, lblrandomGeneratesA);
		springLayout.putConstraint(SpringLayout.WEST, lblrandomGeneratesA, 0, SpringLayout.WEST, lblNewLabel);
		lblrandomGeneratesA.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		add(lblrandomGeneratesA);
		
		JButton btnR = new JButton("R");
		springLayout.putConstraint(SpringLayout.NORTH, btnR, 10, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, btnR, 7, SpringLayout.EAST, lblInputParameters);
		springLayout.putConstraint(SpringLayout.SOUTH, btnR, 44, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, btnR, -152, SpringLayout.EAST, this);
		add(btnR);
		
		JLabel lbladdLetsYou = new JLabel("\"Add\" lets you select two points to be added");
		springLayout.putConstraint(SpringLayout.NORTH, lbladdLetsYou, 47, SpringLayout.SOUTH, btnMultiplyBy);
		springLayout.putConstraint(SpringLayout.WEST, lbladdLetsYou, 0, SpringLayout.WEST, lblNewLabel);
		springLayout.putConstraint(SpringLayout.SOUTH, lbladdLetsYou, 58, SpringLayout.SOUTH, btnMultiplyBy);
		lbladdLetsYou.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		add(lbladdLetsYou);
		
		JLabel lblmultiplyLetsYou = new JLabel("\"Multiply by\" lets you select one point to be multiplied by the scalar");
		springLayout.putConstraint(SpringLayout.NORTH, lblSelectAPoints, 2, SpringLayout.SOUTH, lblmultiplyLetsYou);
		springLayout.putConstraint(SpringLayout.SOUTH, lblSelectAPoints, 18, SpringLayout.SOUTH, lblmultiplyLetsYou);
		springLayout.putConstraint(SpringLayout.NORTH, lblmultiplyLetsYou, 4, SpringLayout.SOUTH, lbladdLetsYou);
		springLayout.putConstraint(SpringLayout.SOUTH, lblmultiplyLetsYou, 15, SpringLayout.SOUTH, lbladdLetsYou);
		springLayout.putConstraint(SpringLayout.WEST, lblmultiplyLetsYou, 0, SpringLayout.WEST, lblNewLabel);
		lblmultiplyLetsYou.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		add(lblmultiplyLetsYou);
		
		JLabel label = new JLabel("");
		springLayout.putConstraint(SpringLayout.NORTH, label, 13, SpringLayout.SOUTH, lblSelectAPoints);
		springLayout.putConstraint(SpringLayout.WEST, label, 45, SpringLayout.WEST, this);
		label.setIcon(new ImageIcon(LeftPanel.class.getResource("/resources/c3.png")));
		add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(LeftPanel.class.getResource("/resources/c4.png")));
		springLayout.putConstraint(SpringLayout.NORTH, label_1, 0, SpringLayout.NORTH, separator);
		springLayout.putConstraint(SpringLayout.WEST, label_1, 0, SpringLayout.WEST, separator);
		add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(LeftPanel.class.getResource("/resources/c5.png")));
		springLayout.putConstraint(SpringLayout.SOUTH, label_2, -80, SpringLayout.NORTH, lblmultiplyLetsYou);
		springLayout.putConstraint(SpringLayout.EAST, label_2, -43, SpringLayout.EAST, this);
		add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(LeftPanel.class.getResource("/resources/c5.png")));
		springLayout.putConstraint(SpringLayout.SOUTH, label_3, 0, SpringLayout.SOUTH, label);
		springLayout.putConstraint(SpringLayout.EAST, label_3, 0, SpringLayout.EAST, tglbtnSelect);
		add(label_3);


		
	}
}
