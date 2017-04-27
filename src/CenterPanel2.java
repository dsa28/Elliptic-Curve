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
		springLayout.putConstraint(SpringLayout.WEST, btnReduceP1, 244, SpringLayout.WEST, this);
		add(btnReduceP1);
		
		JButton btnReduceP2 = new JButton("Reduce P2");
		springLayout.putConstraint(SpringLayout.NORTH, btnReduceP2, 6, SpringLayout.SOUTH, btnReduceP1);
		springLayout.putConstraint(SpringLayout.WEST, btnReduceP2, 244, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, btnReduceP2, 0, SpringLayout.EAST, btnReduceP1);
		add(btnReduceP2);
		
		JButton btnInverseOfP1 = new JButton("Inverse of P1");
		springLayout.putConstraint(SpringLayout.NORTH, btnInverseOfP1, 6, SpringLayout.SOUTH, btnReduceP2);
		springLayout.putConstraint(SpringLayout.WEST, btnInverseOfP1, 244, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, btnInverseOfP1, 0, SpringLayout.EAST, btnReduceP1);
		add(btnInverseOfP1);
		
		JButton btnInverseOfP2 = new JButton("Inverse of P2");
		springLayout.putConstraint(SpringLayout.NORTH, btnInverseOfP2, 6, SpringLayout.SOUTH, btnInverseOfP1);
		springLayout.putConstraint(SpringLayout.WEST, btnInverseOfP2, 244, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, btnInverseOfP2, 0, SpringLayout.EAST, btnReduceP1);
		add(btnInverseOfP2);
		
		JButton btnAdd = new JButton("P1 + P2");
		springLayout.putConstraint(SpringLayout.EAST, btnReduceP1, -33, SpringLayout.WEST, btnAdd);
		springLayout.putConstraint(SpringLayout.WEST, btnAdd, 414, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, btnAdd, 551, SpringLayout.WEST, this);
		add(btnAdd);
		
		JButton btnSubtract = new JButton("P1 - P2");
		springLayout.putConstraint(SpringLayout.NORTH, btnSubtract, 6, SpringLayout.SOUTH, btnAdd);
		springLayout.putConstraint(SpringLayout.WEST, btnSubtract, 33, SpringLayout.EAST, btnReduceP2);
		springLayout.putConstraint(SpringLayout.EAST, btnSubtract, 170, SpringLayout.EAST, btnReduceP2);
		add(btnSubtract);
		
		JButton btnSubtractt = new JButton("P2 - P1");
		springLayout.putConstraint(SpringLayout.NORTH, btnSubtractt, 106, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, btnSubtractt, 574, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, btnSubtractt, 711, SpringLayout.WEST, this);
		add(btnSubtractt);
		
		JButton btnMultiply = new JButton("P1 x P2");
		springLayout.putConstraint(SpringLayout.NORTH, btnMultiply, 9, SpringLayout.SOUTH, btnSubtract);
		springLayout.putConstraint(SpringLayout.WEST, btnMultiply, 33, SpringLayout.EAST, btnInverseOfP1);
		springLayout.putConstraint(SpringLayout.EAST, btnMultiply, 170, SpringLayout.EAST, btnInverseOfP1);
		add(btnMultiply);
		
		JButton btnDivide = new JButton("P1 / P2");
		springLayout.putConstraint(SpringLayout.SOUTH, btnMultiply, -3, SpringLayout.NORTH, btnDivide);
		springLayout.putConstraint(SpringLayout.WEST, btnDivide, 33, SpringLayout.EAST, btnInverseOfP2);
		springLayout.putConstraint(SpringLayout.EAST, btnDivide, 170, SpringLayout.EAST, btnInverseOfP2);
		springLayout.putConstraint(SpringLayout.NORTH, btnDivide, 0, SpringLayout.NORTH, btnInverseOfP2);
		add(btnDivide);
		
		JButton btnDividee = new JButton("P2 / P1");
		springLayout.putConstraint(SpringLayout.NORTH, btnDividee, 0, SpringLayout.NORTH, btnInverseOfP2);
		springLayout.putConstraint(SpringLayout.WEST, btnDividee, 23, SpringLayout.EAST, btnDivide);
		springLayout.putConstraint(SpringLayout.SOUTH, btnDividee, 0, SpringLayout.SOUTH, btnInverseOfP2);
		springLayout.putConstraint(SpringLayout.EAST, btnDividee, 160, SpringLayout.EAST, btnDivide);
		add(btnDividee);
		
		JLabel btnSubtract1 = new JLabel("OPERATIONS");
		springLayout.putConstraint(SpringLayout.NORTH, btnAdd, 40, SpringLayout.SOUTH, btnSubtract1);
		springLayout.putConstraint(SpringLayout.NORTH, btnSubtract1, 10, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, btnSubtract1, 437, SpringLayout.WEST, this);
		btnSubtract1.setFont(new Font("Lucida Grande", Font.BOLD, 17));
		add(btnSubtract1);
		}		
}
