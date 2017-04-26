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

		
		setPreferredSize(new Dimension(200, 200));
		setVisible(true);

		setBackground(SystemColor.window);
	}
}
