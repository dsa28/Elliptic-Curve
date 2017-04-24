import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;

public class TestWindow {

	private JFrame frame;
	private CartesianPlane plane;
	private EllipticCurve c1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestWindow window = new TestWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TestWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 570, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		plane = new CartesianPlane(frame.getWidth(), frame.getHeight());
		
		c1 = new EllipticCurve(5);
		c1.setA(4);
		c1.setB(4);
		
		
		plane.setCurve(c1);
		
		LeftPanel p = new LeftPanel();
		p.setPreferredSize(new Dimension(150,450));
	
		p.setVisible(true);
		
		//this.getContentPane().add(buttonPane,BorderLayout.SOUTH);
		frame.getContentPane().add(p,BorderLayout.WEST); //Set content pannel
		frame.getContentPane().add(plane, BorderLayout.CENTER);
		frame.getContentPane().setVisible(true);
	
	}

}
