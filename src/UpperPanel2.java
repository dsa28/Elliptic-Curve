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

public class UpperPanel2 extends JPanel{
	
	public UpperPanel2() {
	SpringLayout springLayout = new SpringLayout();
	setLayout(springLayout);
	
	setPreferredSize(new Dimension(700, 286));
	setVisible(true);	
	
	setBackground(SystemColor.window);
	
	JEditorPane editorPaneP1 = new JEditorPane();
	springLayout.putConstraint(SpringLayout.NORTH, editorPaneP1, 27, SpringLayout.NORTH, this);
	springLayout.putConstraint(SpringLayout.WEST, editorPaneP1, 75, SpringLayout.WEST, this);
	springLayout.putConstraint(SpringLayout.SOUTH, editorPaneP1, 68, SpringLayout.NORTH, this);
	springLayout.putConstraint(SpringLayout.EAST, editorPaneP1, 429, SpringLayout.WEST, this);
	add(editorPaneP1);
	
	JEditorPane editorPaneP2 = new JEditorPane();
	springLayout.putConstraint(SpringLayout.NORTH, editorPaneP2, 24, SpringLayout.SOUTH, editorPaneP1);
	springLayout.putConstraint(SpringLayout.WEST, editorPaneP2, 0, SpringLayout.WEST, editorPaneP1);
	springLayout.putConstraint(SpringLayout.SOUTH, editorPaneP2, 65, SpringLayout.SOUTH, editorPaneP1);
	springLayout.putConstraint(SpringLayout.EAST, editorPaneP2, 0, SpringLayout.EAST, editorPaneP1);
	add(editorPaneP2);
	
	JLabel lblP1 = new JLabel("P1");
	springLayout.putConstraint(SpringLayout.NORTH, lblP1, 40, SpringLayout.NORTH, this);
	springLayout.putConstraint(SpringLayout.EAST, lblP1, -6, SpringLayout.WEST, editorPaneP1);
	add(lblP1);
	
	JLabel lblP2 = new JLabel("P2");
	springLayout.putConstraint(SpringLayout.NORTH, lblP2, 49, SpringLayout.SOUTH, lblP1);
	springLayout.putConstraint(SpringLayout.EAST, lblP2, -6, SpringLayout.WEST, editorPaneP2);
	add(lblP2);
	}
}