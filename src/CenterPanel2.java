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
import javax.swing.JSeparator;
import java.awt.Font;

public class CenterPanel2 extends JPanel {

	public CenterPanel2() {
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);

		
		setPreferredSize(new Dimension(1100, 400));
		setVisible(true);

		setBackground(SystemColor.window);
		
		JButton btnReduceP1 = new JButton("Reduce P1");
		springLayout.putConstraint(SpringLayout.NORTH, btnReduceP1, 71, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, btnReduceP1, 187, SpringLayout.WEST, this);
		add(btnReduceP1);
		
		JButton btnReduceP2 = new JButton("Reduce P2");
		springLayout.putConstraint(SpringLayout.EAST, btnReduceP1, -24, SpringLayout.WEST, btnReduceP2);
		springLayout.putConstraint(SpringLayout.EAST, btnReduceP2, 485, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.WEST, btnReduceP2, 348, SpringLayout.WEST, this);
		add(btnReduceP2);
		
		JButton btnInverseOfP1 = new JButton("Inverse of P1");
		springLayout.putConstraint(SpringLayout.WEST, btnInverseOfP1, 24, SpringLayout.EAST, btnReduceP2);
		springLayout.putConstraint(SpringLayout.EAST, btnInverseOfP1, -377, SpringLayout.EAST, this);
		add(btnInverseOfP1);
		
		JButton btnInverseOfP2 = new JButton("Inverse of P2");
		springLayout.putConstraint(SpringLayout.NORTH, btnInverseOfP2, 0, SpringLayout.NORTH, btnReduceP1);
		springLayout.putConstraint(SpringLayout.WEST, btnInverseOfP2, 6, SpringLayout.EAST, btnInverseOfP1);
		springLayout.putConstraint(SpringLayout.EAST, btnInverseOfP2, -217, SpringLayout.EAST, this);
		add(btnInverseOfP2);
		
		JButton btnAdd = new JButton("P1 + P2");
		springLayout.putConstraint(SpringLayout.WEST, btnAdd, 18, SpringLayout.WEST, btnReduceP1);
		springLayout.putConstraint(SpringLayout.SOUTH, btnAdd, 94, SpringLayout.SOUTH, btnReduceP1);
		add(btnAdd);
		
		JButton btnSubtract = new JButton("P1 - P2");
		springLayout.putConstraint(SpringLayout.NORTH, btnAdd, 0, SpringLayout.NORTH, btnSubtract);
		springLayout.putConstraint(SpringLayout.EAST, btnAdd, -39, SpringLayout.WEST, btnSubtract);
		springLayout.putConstraint(SpringLayout.NORTH, btnSubtract, 23, SpringLayout.SOUTH, btnReduceP1);
		springLayout.putConstraint(SpringLayout.WEST, btnSubtract, 315, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, btnSubtract, 94, SpringLayout.SOUTH, btnReduceP1);
		add(btnSubtract);
		
		JButton btnSubtractt = new JButton("P2 - P1");
		springLayout.putConstraint(SpringLayout.EAST, btnSubtract, -28, SpringLayout.WEST, btnSubtractt);
		springLayout.putConstraint(SpringLayout.NORTH, btnSubtractt, 23, SpringLayout.SOUTH, btnReduceP2);
		springLayout.putConstraint(SpringLayout.WEST, btnSubtractt, 414, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, btnSubtractt, 94, SpringLayout.SOUTH, btnReduceP2);
		springLayout.putConstraint(SpringLayout.EAST, btnSubtractt, 485, SpringLayout.WEST, this);
		add(btnSubtractt);
		
		JButton btnMultiply = new JButton("P1 x P2");
		springLayout.putConstraint(SpringLayout.NORTH, btnMultiply, 23, SpringLayout.SOUTH, btnInverseOfP1);
		springLayout.putConstraint(SpringLayout.WEST, btnMultiply, 28, SpringLayout.EAST, btnSubtractt);
		springLayout.putConstraint(SpringLayout.SOUTH, btnMultiply, 94, SpringLayout.SOUTH, btnInverseOfP1);
		springLayout.putConstraint(SpringLayout.EAST, btnMultiply, 99, SpringLayout.EAST, btnSubtractt);
		add(btnMultiply);
		
		JButton btnDivide = new JButton("P1 ÷ P2");
		springLayout.putConstraint(SpringLayout.NORTH, btnDivide, 23, SpringLayout.SOUTH, btnInverseOfP2);
		springLayout.putConstraint(SpringLayout.WEST, btnDivide, 40, SpringLayout.EAST, btnMultiply);
		springLayout.putConstraint(SpringLayout.SOUTH, btnDivide, 94, SpringLayout.SOUTH, btnInverseOfP2);
		springLayout.putConstraint(SpringLayout.EAST, btnDivide, 111, SpringLayout.EAST, btnMultiply);
		add(btnDivide);
		
		JButton btnDividee = new JButton("P2 ÷ P1");
		springLayout.putConstraint(SpringLayout.NORTH, btnDividee, 23, SpringLayout.SOUTH, btnInverseOfP2);
		springLayout.putConstraint(SpringLayout.WEST, btnDividee, 36, SpringLayout.EAST, btnDivide);
		springLayout.putConstraint(SpringLayout.SOUTH, btnDividee, 94, SpringLayout.SOUTH, btnInverseOfP2);
		springLayout.putConstraint(SpringLayout.EAST, btnDividee, 107, SpringLayout.EAST, btnDivide);
		add(btnDividee);
		
		JLabel btnSubtract1 = new JLabel("OPERATIONS");
		springLayout.putConstraint(SpringLayout.NORTH, btnInverseOfP1, 40, SpringLayout.SOUTH, btnSubtract1);
		springLayout.putConstraint(SpringLayout.NORTH, btnReduceP2, 40, SpringLayout.SOUTH, btnSubtract1);
		springLayout.putConstraint(SpringLayout.NORTH, btnSubtract1, 10, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, btnSubtract1, 437, SpringLayout.WEST, this);
		btnSubtract1.setFont(new Font("Lucida Grande", Font.BOLD, 17));
		add(btnSubtract1);
		}		
}
