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
import javax.swing.JTextField;

public class PolynomialArithmetic extends JPanel {

	/**
	 * Create the panel.
	 */
	public PolynomialArithmetic() {
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);

		
		setVisible(true);

		setBackground(SystemColor.window);

		
		CenterPanel2 center = new CenterPanel2();
		LeftPanel2 left = new LeftPanel2();
		RightPanel2 right = new RightPanel2();
		LowerPanel2 lower = new LowerPanel2();
		UpperPanel2 upper = new UpperPanel2();
		
		this.setBounds(0, 0, 1950, 1273);
		this.setLayout(new BorderLayout(0, 0));
	
		
		center.btnAdd.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				Polynomial p1= new Polynomial(upper.editorPane.getText());
				Polynomial p2= new Polynomial(upper.editorPane_1.getText());
				
				lower.editorPane.setText(p1.add(p2).toString());
		
			}
			
		});
		
		center.btnSubtract.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				Polynomial p1= new Polynomial(upper.editorPane.getText());
				Polynomial p2= new Polynomial(upper.editorPane_1.getText());
				
				lower.editorPane.setText(p1.subtract(p2).toString());
				
			}
			
		});
		
		center.btnSubtractt.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				Polynomial p1= new Polynomial(upper.editorPane.getText());
				Polynomial p2= new Polynomial(upper.editorPane_1.getText());
				
				lower.editorPane.setText(p2.subtract(p1).toString());
				
			}
			
		});
		
		center.btnMultiply.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				Polynomial p1= new Polynomial(upper.editorPane.getText());
				Polynomial p2= new Polynomial(upper.editorPane_1.getText());
				
				lower.editorPane.setText(p1.multiply(p2).toString());
				
			}
			
		});
		
		center.btnDivide.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				Polynomial p1= new Polynomial(upper.editorPane.getText());
				Polynomial p2= new Polynomial(upper.editorPane_1.getText());
				
				lower.editorPane.setText(p1.divide(p2).toString());
				
			}
			
		});
		
		center.btnDividee.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				Polynomial p1= new Polynomial(upper.editorPane.getText());
				Polynomial p2= new Polynomial(upper.editorPane_1.getText());
				
				lower.editorPane.setText(p2.divide(p1).toString());
				
			}
			
		});
		
		center.btnReduceP1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				Polynomial p1= new Polynomial(upper.editorPane.getText());
				
				lower.editorPane.setText(p1.toString());
				
			}
			
		});
		center.btnInverseOfP1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				Polynomial p1= new Polynomial(upper.editorPane.getText());
				
				lower.editorPane.setText(p1.inverse().toString());
				
			}
			
		});
		
		center.btnReduceP2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				Polynomial p2= new Polynomial(upper.editorPane_1.getText());
				
				lower.editorPane.setText(p2.toString());
				
			}
			
		});
		
		center.btnInverseOfP2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				Polynomial p1= new Polynomial(upper.editorPane_1.getText());
				
				lower.editorPane.setText(p1.inverse().toString());
				
			}
			
		});
		
		
		this.add(upper,BorderLayout.NORTH);
		this.add(left, BorderLayout.WEST);
		this.add(right, BorderLayout.EAST);
		this.add(lower,BorderLayout.SOUTH);
		this.add(center,BorderLayout.CENTER);

		
	}
}