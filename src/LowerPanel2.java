import java.awt.Dimension;
import java.awt.SystemColor;

import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;

public class LowerPanel2 extends JPanel{
	
	public LowerPanel2() {
	SpringLayout springLayout = new SpringLayout();
	setLayout(springLayout);
	
	setPreferredSize(new Dimension(1435, 200));
	setVisible(true);	
	
	setBackground(SystemColor.window);
	
	JLabel lblResult = new JLabel("RESULT");
	springLayout.putConstraint(SpringLayout.NORTH, lblResult, 75, SpringLayout.NORTH, this);
	springLayout.putConstraint(SpringLayout.WEST, lblResult, 653, SpringLayout.WEST, this);
	lblResult.setFont(new Font("Lucida Grande", Font.BOLD, 17));
	add(lblResult);
	
	JEditorPane editorPane = new JEditorPane();
	springLayout.putConstraint(SpringLayout.NORTH, editorPane, 17, SpringLayout.SOUTH, lblResult);
	springLayout.putConstraint(SpringLayout.WEST, editorPane, 511, SpringLayout.WEST, this);
	springLayout.putConstraint(SpringLayout.SOUTH, editorPane, -41, SpringLayout.SOUTH, this);
	springLayout.putConstraint(SpringLayout.EAST, editorPane, 874, SpringLayout.WEST, this);
	add(editorPane);}
}