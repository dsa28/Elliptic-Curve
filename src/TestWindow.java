import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.LayoutManager2;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.SpringLayout;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
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
	
	private JPanel cards;
	private JPanel ecc;
	private JPanel suprise;
	
	private CartesianPlane plane;
	private EllipticCurve c1;
	
	private LeftPanel left;
	private RightPanel right;
	private UpperPanel upper;
	private LowerPanel lower;
	
	private JMenuBar menuBar;
	private JMenu Menu;
	
	CardLayout c = new CardLayout();


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
		frame.setBounds(0, 0, 1950, 1273);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		plane = new CartesianPlane(500, 500);
		
		c1 = new EllipticCurve(1);
		c1.setA(0);
		c1.setB(0);
		
		ecc = new JPanel();
		ecc.setBounds(0, 0, 1950, 1273);
		
		
		plane.setCurve(c1);
		
		right = new RightPanel();
		left = new LeftPanel();
		upper = new UpperPanel();
		lower = new LowerPanel();
		
		//setting the buttons
		left.btnAdd.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
			plane.setAddition();
			}
			
		});
		
		left.btnMultiplyBy.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				plane.setMultiplication();
			}
		});
		
	
		
		left.tglbtnSelect.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				plane.setSelect();
			}
			
		});
		
		right.btnZoomIn.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				plane.zoomIn(2);
			}
			
		});
		
		right.btnZoomOut.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				plane.zoomOut(2);
			}
			
		});
		
		left.spinner_3.addChangeListener(new ChangeListener()
		{@Override
			public void stateChanged(ChangeEvent arg0) {
				// TODO Auto-generated method stub
			plane.setScalar(left.spinner_3.getValue().toString());
				
			}});
		
		right.btnRight.addActionListener(new ActionListener()
		{public void actionPerformed(ActionEvent arg0){plane.moveRight(50);};});
		right.btnLeft.addActionListener(new ActionListener()
		{public void actionPerformed(ActionEvent arg0){plane.moveLeft(50);};});
		right.btnUp.addActionListener(new ActionListener()
		{public void actionPerformed(ActionEvent arg0){plane.moveUp(50);};});
		right.btnDown.addActionListener(new ActionListener()
		{public void actionPerformed(ActionEvent arg0){plane.moveDown(50);};});
		right.btnMiddle.addActionListener(new ActionListener()
		{public void actionPerformed(ActionEvent arg0){plane.start();};});
		
		
		ecc.setLayout(new BorderLayout(0, 0));
		
		left.spinner.addChangeListener(new ChangeListener()
		{@Override
			public void stateChanged(ChangeEvent arg0) {
				// TODO Auto-generated method stub
			c1.setA(Integer.parseInt(left.spinner.getValue().toString()));
			plane.setCurve(c1);
				
			}});
		

		left.spinner_1.addChangeListener(new ChangeListener()
		{@Override
			public void stateChanged(ChangeEvent arg0) {
				// TODO Auto-generated method stub
			c1.setB(Integer.parseInt(left.spinner_1.getValue().toString()));
			plane.setCurve(c1);
				
			}});
		
		
		left.spinner_2.addChangeListener(new ChangeListener()
		{@Override
			public void stateChanged(ChangeEvent arg0) {
				// TODO Auto-generated method stub
			c1.setP(Integer.parseInt(left.spinner_2.getValue().toString()));
			plane.setCurve(c1);
				
			}});
		
	
	
		ecc.add(left,BorderLayout.WEST);
		ecc.add(right,BorderLayout.EAST);
        ecc.add(upper,BorderLayout.NORTH);
		ecc.add(lower,BorderLayout.SOUTH);
		ecc.add(plane,BorderLayout.CENTER);

		
		menuBar = new JMenuBar();
		//menuBar.setBackground(new Color(204, 0, 255));
		frame.setJMenuBar(menuBar);
		menuBar.setVisible(true);
		
		Menu = new JMenu("New menu");
		menuBar.add(Menu);
		
		JMenuItem mntmEllipticCurve = new JMenuItem("Elliptic Curve");
		Menu.add(mntmEllipticCurve);
		
		JMenuItem mntmSurprise = new JMenuItem("Surprise!");
		Menu.add(mntmSurprise);
		
		plane.setVisible(true);

	
		
		c.addLayoutComponent(ecc, "curve");
		JPanel f2 = new JPanel();
		c.addLayoutComponent(f2,"poly");
		
		
		frame.getContentPane().setLayout(c);
		frame.getContentPane().add(ecc,BorderLayout.CENTER);
		frame.getContentPane().add(f2);
		
		
		mntmEllipticCurve.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				c.show(frame.getContentPane(), "curve");
			}	
		});
		
		mntmSurprise.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				c.show(frame.getContentPane(), "poly");
			}	
		});
		
		frame.getContentPane().setVisible(true);
	}
	
	
}
