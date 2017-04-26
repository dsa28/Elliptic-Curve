import java.awt.Dimension;
import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;

public class RightPanel2 extends JPanel {

	public RightPanel2() {
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);

		
		setPreferredSize(new Dimension(585, 500));
		setVisible(true);

		setBackground(SystemColor.window);
		
		JButton btnAdd = new JButton("P1 + P2");
		springLayout.putConstraint(SpringLayout.NORTH, btnAdd, 168, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, btnAdd, 24, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, btnAdd, -287, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, btnAdd, -469, SpringLayout.EAST, this);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		add(btnAdd);
		
		JButton btnMultiply = new JButton("P1 x P2");
		springLayout.putConstraint(SpringLayout.WEST, btnMultiply, 24, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, btnMultiply, -469, SpringLayout.EAST, this);
		add(btnMultiply);
		
		JEditorPane editorPane = new JEditorPane();
		springLayout.putConstraint(SpringLayout.NORTH, editorPane, 168, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, editorPane, 43, SpringLayout.EAST, btnAdd);
		springLayout.putConstraint(SpringLayout.SOUTH, editorPane, 0, SpringLayout.SOUTH, btnAdd);
		springLayout.putConstraint(SpringLayout.EAST, editorPane, -183, SpringLayout.EAST, this);
		add(editorPane);
		
		JEditorPane editorPane_1 = new JEditorPane();
		springLayout.putConstraint(SpringLayout.NORTH, editorPane_1, 19, SpringLayout.SOUTH, editorPane);
		springLayout.putConstraint(SpringLayout.WEST, editorPane_1, 0, SpringLayout.WEST, editorPane);
		springLayout.putConstraint(SpringLayout.EAST, editorPane_1, 0, SpringLayout.EAST, editorPane);
		editorPane_1.setText(" ");
		add(editorPane_1);
		
		JEditorPane editorPane_2 = new JEditorPane();
		springLayout.putConstraint(SpringLayout.SOUTH, editorPane_1, -85, SpringLayout.NORTH, editorPane_2);
		springLayout.putConstraint(SpringLayout.WEST, editorPane_2, 159, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.NORTH, editorPane_2, 362, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, editorPane_2, -183, SpringLayout.EAST, this);
		editorPane_2.setText(" ");
		add(editorPane_2);
		
		JEditorPane editorPane_3 = new JEditorPane();
		springLayout.putConstraint(SpringLayout.NORTH, editorPane_3, 423, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.SOUTH, editorPane_3, -32, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.SOUTH, editorPane_2, -16, SpringLayout.NORTH, editorPane_3);
		editorPane_3.setText(" ");
		add(editorPane_3);
		
		JToggleButton tglbtnDivide1 = new JToggleButton("P1 ÷ P2");
		springLayout.putConstraint(SpringLayout.SOUTH, btnMultiply, -16, SpringLayout.NORTH, tglbtnDivide1);
		springLayout.putConstraint(SpringLayout.EAST, tglbtnDivide1, -469, SpringLayout.EAST, this);
		springLayout.putConstraint(SpringLayout.WEST, editorPane_3, 43, SpringLayout.EAST, tglbtnDivide1);
		springLayout.putConstraint(SpringLayout.NORTH, tglbtnDivide1, 423, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, tglbtnDivide1, 24, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, tglbtnDivide1, -32, SpringLayout.SOUTH, this);
		add(tglbtnDivide1);
		
		JToggleButton tglbtnDivide2 = new JToggleButton("P2 ÷ P1");
		springLayout.putConstraint(SpringLayout.NORTH, tglbtnDivide2, 423, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, tglbtnDivide2, 433, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, tglbtnDivide2, -32, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, tglbtnDivide2, -60, SpringLayout.EAST, this);
		springLayout.putConstraint(SpringLayout.EAST, editorPane_3, -31, SpringLayout.WEST, tglbtnDivide2);
		add(tglbtnDivide2);
		
		JToggleButton tglbtnSubtract1 = new JToggleButton("P1 - P2");
		springLayout.putConstraint(SpringLayout.NORTH, btnMultiply, 85, SpringLayout.SOUTH, tglbtnSubtract1);
		springLayout.putConstraint(SpringLayout.NORTH, tglbtnSubtract1, 19, SpringLayout.SOUTH, btnAdd);
		springLayout.putConstraint(SpringLayout.WEST, tglbtnSubtract1, 24, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, tglbtnSubtract1, 0, SpringLayout.SOUTH, editorPane_1);
		springLayout.putConstraint(SpringLayout.EAST, tglbtnSubtract1, 0, SpringLayout.EAST, btnAdd);
		add(tglbtnSubtract1);
		
		JToggleButton tglbtnSubtract2 = new JToggleButton("P2 - P1");
		springLayout.putConstraint(SpringLayout.NORTH, tglbtnSubtract2, 0, SpringLayout.NORTH, editorPane_1);
		springLayout.putConstraint(SpringLayout.WEST, tglbtnSubtract2, 0, SpringLayout.WEST, tglbtnDivide2);
		springLayout.putConstraint(SpringLayout.SOUTH, tglbtnSubtract2, -146, SpringLayout.NORTH, tglbtnDivide2);
		springLayout.putConstraint(SpringLayout.EAST, tglbtnSubtract2, -60, SpringLayout.EAST, this);
		add(tglbtnSubtract2);
		
		}		

}
