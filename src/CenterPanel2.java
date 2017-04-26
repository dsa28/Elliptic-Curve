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

public class CenterPanel2 extends JPanel {

	public CenterPanel2() {
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);

		
		setPreferredSize(new Dimension(500, 500));
		setVisible(true);

		setBackground(SystemColor.window);
		
		JButton btnNewButton = new JButton("New button");
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton, 38, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton, -223, SpringLayout.SOUTH, this);
		add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("New button");
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton_2, 0, SpringLayout.WEST, btnNewButton);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		add(btnNewButton_2);
		
		JEditorPane editorPane = new JEditorPane();
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_2, 41, SpringLayout.SOUTH, editorPane);
		springLayout.putConstraint(SpringLayout.NORTH, editorPane, 51, SpringLayout.SOUTH, btnNewButton);
		springLayout.putConstraint(SpringLayout.WEST, editorPane, 51, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, editorPane, 302, SpringLayout.WEST, this);
		add(editorPane);
		}		
}
