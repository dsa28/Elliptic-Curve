import java.awt.Dimension;
import java.awt.SystemColor;

import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class LowerPanel2 extends JPanel{
	
	public LowerPanel2() {
	SpringLayout springLayout = new SpringLayout();
	setLayout(springLayout);
	
	setPreferredSize(new Dimension(700, 286));
	setVisible(true);	
	
	setBackground(SystemColor.window);}

}