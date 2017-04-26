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

		
		setPreferredSize(new Dimension(200, 200));
		setVisible(true);

		setBackground(SystemColor.window);
		
		}		

}
