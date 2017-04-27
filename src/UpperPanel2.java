import java.awt.Color;
import java.awt.Dimension;
import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import java.awt.Font;

public class UpperPanel2 extends JPanel{
	
	public JEditorPane editorPane;
	public JEditorPane editorPane_1;
	
	public UpperPanel2() {
	SpringLayout springLayout = new SpringLayout();
	setLayout(springLayout);
	
	setPreferredSize(new Dimension(1435, 283));
	setVisible(true);	
	
	setBackground(SystemColor.window);
	
	 editorPane = new JEditorPane();
	 springLayout.putConstraint(SpringLayout.WEST, editorPane, 569, SpringLayout.WEST, this);
	 springLayout.putConstraint(SpringLayout.EAST, editorPane, -585, SpringLayout.EAST, this);
	add(editorPane);
	
	 editorPane_1 = new JEditorPane();
	 springLayout.putConstraint(SpringLayout.NORTH, editorPane_1, 171, SpringLayout.NORTH, this);
	 springLayout.putConstraint(SpringLayout.WEST, editorPane_1, 569, SpringLayout.WEST, this);
	 springLayout.putConstraint(SpringLayout.SOUTH, editorPane_1, -78, SpringLayout.SOUTH, this);
	 springLayout.putConstraint(SpringLayout.EAST, editorPane_1, -585, SpringLayout.EAST, this);
	 springLayout.putConstraint(SpringLayout.SOUTH, editorPane, -36, SpringLayout.NORTH, editorPane_1);
	add(editorPane_1);
	
	JLabel lblNewLabel = new JLabel("P1");
	springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 0, SpringLayout.NORTH, editorPane);
	springLayout.putConstraint(SpringLayout.EAST, lblNewLabel, -30, SpringLayout.WEST, editorPane);
	add(lblNewLabel);
	
	JLabel lblP = new JLabel("P2");
	springLayout.putConstraint(SpringLayout.NORTH, lblP, 0, SpringLayout.NORTH, editorPane_1);
	springLayout.putConstraint(SpringLayout.WEST, lblP, 0, SpringLayout.WEST, lblNewLabel);
	add(lblP);
	
	JLabel lblPolynomialsChoice = new JLabel("POLYNOMIALS CHOICE");
	springLayout.putConstraint(SpringLayout.NORTH, editorPane, 39, SpringLayout.SOUTH, lblPolynomialsChoice);
	springLayout.putConstraint(SpringLayout.SOUTH, lblPolynomialsChoice, -221, SpringLayout.SOUTH, this);
	springLayout.putConstraint(SpringLayout.WEST, lblPolynomialsChoice, 606, SpringLayout.WEST, this);
	lblPolynomialsChoice.setFont(new Font("Lucida Grande", Font.BOLD, 17));
	add(lblPolynomialsChoice);
	
	JLabel lblThePolynomialsP = new JLabel("The polynomials P1 and P2 can be written in polynomial form, hexadecimal notation or binary notation");
	springLayout.putConstraint(SpringLayout.WEST, lblThePolynomialsP, 434, SpringLayout.WEST, this);
	springLayout.putConstraint(SpringLayout.SOUTH, lblThePolynomialsP, -39, SpringLayout.SOUTH, this);
	lblThePolynomialsP.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
	add(lblThePolynomialsP);
	
	JLabel lblHexadecimalNotationShould = new JLabel("Hexadecimal notation should be preceded by 0x");
	springLayout.putConstraint(SpringLayout.NORTH, lblHexadecimalNotationShould, 6, SpringLayout.SOUTH, lblThePolynomialsP);
	springLayout.putConstraint(SpringLayout.WEST, lblHexadecimalNotationShould, 594, SpringLayout.WEST, this);
	lblHexadecimalNotationShould.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
	add(lblHexadecimalNotationShould);
	}
}