import java.awt.Dimension;
import java.awt.SystemColor;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JEditorPane;
import javax.swing.JTextPane;
import javax.swing.JLabel;

public class CenterPanel2 extends JPanel {

	public CenterPanel2() {
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);

		
		setPreferredSize(new Dimension(600, 600));
		setVisible(true);

		setBackground(SystemColor.window);
		
		JButton btnSubtract1 = new JButton("P1 - P2");
		add(btnSubtract1);
		
		JEditorPane editorPane = new JEditorPane();
		springLayout.putConstraint(SpringLayout.NORTH, editorPane, 356, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.SOUTH, btnSubtract1, -17, SpringLayout.NORTH, editorPane);
		springLayout.putConstraint(SpringLayout.WEST, btnSubtract1, 0, SpringLayout.WEST, editorPane);
		springLayout.putConstraint(SpringLayout.WEST, editorPane, 36, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, editorPane, -154, SpringLayout.EAST, this);
		add(editorPane);
		
		JButton btnAdd = new JButton("P1 + P2");
		springLayout.putConstraint(SpringLayout.EAST, btnAdd, 96, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.WEST, btnAdd, 25, SpringLayout.WEST, this);
		add(btnAdd);
		
		JButton btnDivide1 = new JButton("P1 ÷ P2");
		springLayout.putConstraint(SpringLayout.NORTH, btnDivide1, 0, SpringLayout.NORTH, btnSubtract1);
		springLayout.putConstraint(SpringLayout.SOUTH, btnDivide1, 0, SpringLayout.SOUTH, btnSubtract1);
		add(btnDivide1);
		
		JButton btnSubtract2 = new JButton("P2 - P1");
		springLayout.putConstraint(SpringLayout.WEST, btnDivide1, 6, SpringLayout.EAST, btnSubtract2);
		springLayout.putConstraint(SpringLayout.EAST, btnSubtract1, -114, SpringLayout.WEST, btnSubtract2);
		springLayout.putConstraint(SpringLayout.SOUTH, btnSubtract2, -17, SpringLayout.NORTH, editorPane);
		springLayout.putConstraint(SpringLayout.WEST, btnSubtract2, 221, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, btnSubtract2, -408, SpringLayout.EAST, this);
		add(btnSubtract2);
		
		JLabel lblResult = new JLabel("Result");
		springLayout.putConstraint(SpringLayout.SOUTH, editorPane, -70, SpringLayout.NORTH, lblResult);
		springLayout.putConstraint(SpringLayout.NORTH, lblResult, 474, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.SOUTH, lblResult, -110, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, lblResult, -493, SpringLayout.EAST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, btnAdd, -187, SpringLayout.NORTH, lblResult);
		add(lblResult);
		
		JButton btnReduceP1 = new JButton("Reduce P1");
		springLayout.putConstraint(SpringLayout.NORTH, btnSubtract1, 128, SpringLayout.SOUTH, btnReduceP1);
		springLayout.putConstraint(SpringLayout.NORTH, btnAdd, 228, SpringLayout.SOUTH, btnReduceP1);
		springLayout.putConstraint(SpringLayout.NORTH, btnReduceP1, 111, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, btnReduceP1, 50, SpringLayout.WEST, this);
		add(btnReduceP1);
		
		JButton btnReduceP2 = new JButton("Reduce P2");
		springLayout.putConstraint(SpringLayout.NORTH, btnSubtract2, 86, SpringLayout.SOUTH, btnReduceP2);
		springLayout.putConstraint(SpringLayout.WEST, btnReduceP2, 191, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, btnReduceP2, -184, SpringLayout.EAST, this);
		add(btnReduceP2);
		
		JButton btnInverseOfP1 = new JButton("Inverse of P1");
		springLayout.putConstraint(SpringLayout.NORTH, btnInverseOfP1, 111, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, btnInverseOfP1, 308, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, btnInverseOfP1, -367, SpringLayout.EAST, this);
		add(btnInverseOfP1);
		
		JButton btnInverseOfP2 = new JButton("Inverse of P2");
		springLayout.putConstraint(SpringLayout.EAST, btnDivide1, -93, SpringLayout.EAST, btnInverseOfP2);
		springLayout.putConstraint(SpringLayout.EAST, btnReduceP1, -37, SpringLayout.WEST, btnInverseOfP2);
		springLayout.putConstraint(SpringLayout.SOUTH, btnReduceP2, -29, SpringLayout.NORTH, btnInverseOfP2);
		springLayout.putConstraint(SpringLayout.NORTH, btnInverseOfP2, 111, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, btnInverseOfP2, 4, SpringLayout.EAST, btnInverseOfP1);
		springLayout.putConstraint(SpringLayout.EAST, btnInverseOfP2, -238, SpringLayout.EAST, this);
		add(btnInverseOfP2);
		
		JButton button = new JButton("P1 ÷ P2");
		springLayout.putConstraint(SpringLayout.NORTH, button, 0, SpringLayout.NORTH, btnSubtract1);
		springLayout.putConstraint(SpringLayout.WEST, button, 8, SpringLayout.EAST, btnDivide1);
		springLayout.putConstraint(SpringLayout.EAST, button, -252, SpringLayout.EAST, this);
		add(button);
		
		JButton button_1 = new JButton("P2 - P1");
		springLayout.putConstraint(SpringLayout.NORTH, button_1, 128, SpringLayout.SOUTH, btnInverseOfP2);
		springLayout.putConstraint(SpringLayout.WEST, button_1, 6, SpringLayout.EAST, btnSubtract1);
		springLayout.putConstraint(SpringLayout.SOUTH, button_1, 0, SpringLayout.SOUTH, btnSubtract1);
		springLayout.putConstraint(SpringLayout.EAST, button_1, -37, SpringLayout.WEST, btnSubtract2);
		add(button_1);
		}		
}
