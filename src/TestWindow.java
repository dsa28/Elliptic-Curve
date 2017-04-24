import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;

public class TestWindow {

	private JFrame frame;
	private CartesianPlane graph;
	private EllipticCurve c1;
	private JPanel right_panel;
	private JPanel upper_panel;
	private JPanel lower_panel;
	private JMenuBar menuBar;
	private JMenu Menu;
	private JLayeredPane layeredPane;
	private JLabel Operations;

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
		frame.setBounds(100, 100, 1000, 612);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		graph = new CartesianPlane(frame.getWidth(), frame.getHeight());
		
		c1 = new EllipticCurve(5);
		c1.setA(4);
		c1.setB(4);
		
		
		graph.setCurve(c1);
		
		upper_panel = new JPanel();
		frame.getContentPane().add(upper_panel, BorderLayout.NORTH);
		upper_panel.setPreferredSize(new Dimension(50, 50));
		upper_panel.setVisible(true);
		upper_panel.setBackground(SystemColor.window);
		
		lower_panel = new JPanel();
		frame.getContentPane().add(lower_panel, BorderLayout.SOUTH);
		lower_panel.setPreferredSize(new Dimension(50,50));
		lower_panel.setVisible(true);
		lower_panel.setBackground(SystemColor.window);
		
		LeftPanel left_panel = new LeftPanel();
		left_panel.setPreferredSize(new Dimension(185,306));
		
		//SpringLayout springLayout = (SpringLayout) left_panel.getLayout();
		//frame.getContentPane().add(left_panel,BorderLayout.WEST);
		
		
		
		right_panel = new JPanel();
		frame.getContentPane().add(right_panel, BorderLayout.EAST);
		right_panel.setPreferredSize(new Dimension(185,306));
		right_panel.setVisible(true);
		right_panel.setBackground(SystemColor.window);
		
		frame.getContentPane().add(graph, BorderLayout.CENTER);
		graph.setPreferredSize(new Dimension(500,500));
		
		menuBar = new JMenuBar();
		menuBar.setBackground(new Color(204, 0, 255));
		frame.setJMenuBar(menuBar);
		menuBar.setVisible(true);
		
		Menu = new JMenu("New menu");
		menuBar.add(Menu);
		
		JMenuItem mntmEllipticCurve = new JMenuItem("Elliptic Curve");
		Menu.add(mntmEllipticCurve);
		
		JMenuItem mntmSurprise = new JMenuItem("Surprise!");
		Menu.add(mntmSurprise);
		graph.setVisible(true);
		frame.getContentPane().setVisible(true);
	
	}
}
