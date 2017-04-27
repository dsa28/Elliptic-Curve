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
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;

public class TestWindow {


	
	private JFrame frame;
	
	private JPanel ecc;
	private  PolynomialArithmetic magic;
	
	private CartesianPlane plane;
	private EllipticCurve c1;
	
	private LeftPanel left;
	private RightPanel right;
	private UpperPanel upper;
	private LowerPanel lower;
	
	private JMenuBar menuBar;
	private JMenu Menu;
	
	private Random rand;
	
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
		
		rand = new Random();
		
		
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
		
		left.btnR.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				int a,b,p;
				a= rand.nextInt(1000);
				b = rand.nextInt(1000);
				
				p = rand.nextInt(left.p.size());
				
				
				
				left.spinner.setValue(a);
				left.spinner_1.setValue(b);
				left.spinner_2.setValue(left.p.get(p));
				
				c1.setA(a);
				c1.setB(b);
				c1.setP(p);
				
				plane.setCurve(c1);
				
				
			}
			
		});
		
	
	
		ecc.add(left,BorderLayout.WEST);
		ecc.add(right,BorderLayout.EAST);
        ecc.add(upper,BorderLayout.NORTH);
		ecc.add(lower,BorderLayout.SOUTH);
		ecc.add(plane,BorderLayout.CENTER);

		
		menuBar = new JMenuBar();
		//menuBar.setBackground(new Color(204, 0, 255));
		frame.setJMenuBar(menuBar);
		menuBar.setVisible(true);
		
		Menu = new JMenu("Menu");
		menuBar.add(Menu);
		
		JMenuItem mntmEllipticCurve = new JMenuItem("Elliptic Curve");
		Menu.add(mntmEllipticCurve);

		JMenuItem mntmSurprise = new JMenuItem("Surprise!");
		Menu.add(mntmSurprise);
		JMenuItem mntmLearnMore = new JMenuItem("Learn more");
		Menu.add(mntmLearnMore);
		
		
		mntmLearnMore.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				c.show(frame.getContentPane(), "learn");
			}	
		});
		
		plane.setVisible(true);

		magic = new PolynomialArithmetic();
		
		LearnMore learn = new LearnMore();
		
		c.addLayoutComponent(ecc, "curve");
		c.addLayoutComponent(magic,"poly");
		c.addLayoutComponent(learn, "learn");
		
		
		frame.getContentPane().setLayout(c);
		frame.getContentPane().add(ecc);
		frame.getContentPane().add(magic);
		frame.getContentPane().add(learn);
		
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
