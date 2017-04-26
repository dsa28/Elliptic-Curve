import java.awt.Dimension;
import java.awt.SystemColor;

import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JRadioButton;

public class LeftPanel2 extends JPanel {

	public LeftPanel2() {
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);

		
		setPreferredSize(new Dimension(500, 500));
		setVisible(true);

		setBackground(SystemColor.window);
		
		JButton btnReduceP1 = new JButton("Reduce P1");
		add(btnReduceP1);
		
		JButton btnInverseOfP1 = new JButton("Inverse of P1");
		springLayout.putConstraint(SpringLayout.WEST, btnReduceP1, 0, SpringLayout.WEST, btnInverseOfP1);
		springLayout.putConstraint(SpringLayout.EAST, btnReduceP1, 0, SpringLayout.EAST, btnInverseOfP1);
		springLayout.putConstraint(SpringLayout.SOUTH, btnInverseOfP1, -107, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.WEST, btnInverseOfP1, 41, SpringLayout.WEST, this);
		add(btnInverseOfP1);
		
		JEditorPane editorPane = new JEditorPane();
		springLayout.putConstraint(SpringLayout.SOUTH, btnReduceP1, 0, SpringLayout.SOUTH, editorPane);
		springLayout.putConstraint(SpringLayout.NORTH, editorPane, 236, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, editorPane, 217, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, editorPane, -235, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, editorPane, -69, SpringLayout.EAST, this);
		add(editorPane);
		
		JButton btnReduceP2 = new JButton("Reduce P2");
		springLayout.putConstraint(SpringLayout.WEST, btnReduceP2, 41, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.NORTH, btnReduceP2, 287, SpringLayout.NORTH, this);
		add(btnReduceP2);
		
		JButton btnInverseOfP2 = new JButton("Inverse of P2");
		springLayout.putConstraint(SpringLayout.NORTH, btnInverseOfP2, 19, SpringLayout.SOUTH, btnInverseOfP1);
		springLayout.putConstraint(SpringLayout.WEST, btnInverseOfP2, 41, SpringLayout.WEST, this);
		add(btnInverseOfP2);
		
		JEditorPane editorPane_1 = new JEditorPane();
		springLayout.putConstraint(SpringLayout.WEST, editorPane_1, 217, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, btnReduceP2, -51, SpringLayout.WEST, editorPane_1);
		editorPane_1.setText(" ");
		springLayout.putConstraint(SpringLayout.NORTH, editorPane_1, 22, SpringLayout.SOUTH, editorPane);
		springLayout.putConstraint(SpringLayout.SOUTH, editorPane_1, 0, SpringLayout.SOUTH, btnReduceP2);
		springLayout.putConstraint(SpringLayout.EAST, editorPane_1, 0, SpringLayout.EAST, editorPane);
		add(editorPane_1);
		
		JEditorPane editorPane_2 = new JEditorPane();
		springLayout.putConstraint(SpringLayout.NORTH, editorPane_2, 0, SpringLayout.NORTH, btnInverseOfP1);
		springLayout.putConstraint(SpringLayout.WEST, editorPane_2, 51, SpringLayout.EAST, btnInverseOfP1);
		springLayout.putConstraint(SpringLayout.SOUTH, editorPane_2, 0, SpringLayout.SOUTH, btnInverseOfP1);
		springLayout.putConstraint(SpringLayout.EAST, editorPane_2, 0, SpringLayout.EAST, editorPane);
		editorPane_2.setText(" ");
		add(editorPane_2);
		
		JEditorPane editorPane_3 = new JEditorPane();
		springLayout.putConstraint(SpringLayout.NORTH, editorPane_3, 0, SpringLayout.NORTH, btnInverseOfP2);
		springLayout.putConstraint(SpringLayout.WEST, editorPane_3, 0, SpringLayout.WEST, editorPane);
		springLayout.putConstraint(SpringLayout.SOUTH, editorPane_3, 0, SpringLayout.SOUTH, btnInverseOfP2);
		springLayout.putConstraint(SpringLayout.EAST, editorPane_3, 0, SpringLayout.EAST, editorPane);
		editorPane_3.setText(" ");
		add(editorPane_3);
	}
}
