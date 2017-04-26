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
	
	public UpperPanel2() {
	SpringLayout springLayout = new SpringLayout();
	setLayout(springLayout);
	
	setPreferredSize(new Dimension(1435, 283));
	setVisible(true);	
	
	setBackground(SystemColor.window);
	
	JEditorPane editorPane = new JEditorPane();
	springLayout.putConstraint(SpringLayout.NORTH, editorPane, 101, SpringLayout.NORTH, this);
	springLayout.putConstraint(SpringLayout.WEST, editorPane, 569, SpringLayout.WEST, this);
	add(editorPane);
	
	JEditorPane editorPane_1 = new JEditorPane();
	springLayout.putConstraint(SpringLayout.NORTH, editorPane_1, 171, SpringLayout.NORTH, this);
	springLayout.putConstraint(SpringLayout.SOUTH, editorPane, -27, SpringLayout.NORTH, editorPane_1);
	springLayout.putConstraint(SpringLayout.SOUTH, editorPane_1, -69, SpringLayout.SOUTH, this);
	springLayout.putConstraint(SpringLayout.EAST, editorPane, 0, SpringLayout.EAST, editorPane_1);
	springLayout.putConstraint(SpringLayout.EAST, editorPane_1, -585, SpringLayout.EAST, this);
	add(editorPane_1);
	
	JLabel lblNewLabel = new JLabel("P1");
	add(lblNewLabel);
	
	JLabel lblP = new JLabel("P2");
	springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 0, SpringLayout.WEST, lblP);
	springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel, -53, SpringLayout.NORTH, lblP);
	springLayout.putConstraint(SpringLayout.EAST, lblP, -902, SpringLayout.EAST, this);
	springLayout.putConstraint(SpringLayout.WEST, editorPane_1, 36, SpringLayout.EAST, lblP);
	springLayout.putConstraint(SpringLayout.SOUTH, lblP, -81, SpringLayout.SOUTH, this);
	add(lblP);
	
	JLabel lblPolynomialsChoice = new JLabel("POLYNOMIALS CHOICE");
	springLayout.putConstraint(SpringLayout.WEST, lblPolynomialsChoice, 606, SpringLayout.WEST, this);
	springLayout.putConstraint(SpringLayout.SOUTH, lblPolynomialsChoice, -39, SpringLayout.NORTH, editorPane);
	lblPolynomialsChoice.setFont(new Font("Lucida Grande", Font.BOLD, 17));
	add(lblPolynomialsChoice);
	}
}