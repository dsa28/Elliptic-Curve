package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Font;
import javax.swing.JLayeredPane;
import javax.swing.JToggleButton;

public class FirstWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final Component JPanel = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstWindow frame = new FirstWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	public FirstWindow() {
		
		
		initComponents();
		CreateEvents();
	}

	///////////////////////////////////////////////////////////
	//This method contains all of the code for creating and initializing components
	//////////////////////////////////////////////////////////
	
	private void initComponents() {
		// TODO Auto-generated method stub

		javax.swing.JPanel contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		((Component) JPanel).setPreferredSize(new Dimension(500,500));
	    getContentPane().add((Component) JPanel);
	    pack();
	    
		setIconImage(Toolkit.getDefaultToolkit().getImage(FirstWindow.class.getResource("/resources/zoom-in copy.png")));
		setTitle("My Awesome GUI");
		setBackground(Color.WHITE);
		
		JFrame frame = new JFrame("Content Pane Size Example");
		frame.getContentPane().setPreferredSize(new Dimension(400, 300));
		frame.pack();
		frame.setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setFont(new Font("Helvetica Neue", Font.PLAIN, 14));
		menuBar.setBackground(Color.DARK_GRAY);
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("All Computations");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmEllipticCurve = new JMenuItem("Elliptic Curve");
		mnNewMenu.add(mntmEllipticCurve);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Surprise!");
		mnNewMenu.add(mntmNewMenuItem);
		
		
		JButton btnSelect = new JButton("Select");
		
		JSpinner spinner = new JSpinner();
		
		JLayeredPane layeredPane = new JLayeredPane();
		
		JButton button = new JButton("←");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton button_1 = new JButton("→");
		
		JButton button_2 = new JButton("↑");
		
		JButton button_5 = new JButton("");
		button_5.setIcon(new ImageIcon(FirstWindow.class.getResource("/resources/zoom-in copy.png")));
		
		JButton button_4 = new JButton("");
		button_4.setIcon(new ImageIcon(FirstWindow.class.getResource("/resources/zoom-out copy.png")));
		
		JToggleButton tglbtnAdd = new JToggleButton("Add points");
		
		JLabel lblInputParameteres = new JLabel("Input Parameteres");
		lblInputParameteres.setFont(new Font("Helvetica Neue", Font.BOLD, 14));
		
		JLabel lblCurve = new JLabel("Curve");
		lblCurve.setFont(new Font("Helvetica Neue", Font.BOLD, 14));
		
		JLabel lblOperations = new JLabel("Operations");
		lblOperations.setFont(new Font("Helvetica Neue", Font.BOLD, 14));
		
		JSpinner spinner_3 = new JSpinner();
		
		JButton button_3 = new JButton("↓");
		
		JLabel lblNewLabel = new JLabel("Specify A");
		
		JLabel lblSpecifyB = new JLabel("Specify B");
		
		JLabel lblSpecifyP = new JLabel("Specify P");
		
		JSpinner spinner_1 = new JSpinner();
		
		JSpinner spinner_2 = new JSpinner();

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED, 1081, Short.MAX_VALUE)
							.addComponent(layeredPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED, 649, Short.MAX_VALUE)
									.addComponent(lblCurve, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(13)
											.addComponent(lblSpecifyB, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
											.addGap(12)
											.addComponent(spinner_2, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(81)
											.addComponent(spinner_1, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(14)
											.addComponent(lblSpecifyP, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
											.addGap(12)
											.addComponent(spinner_3, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(24)
											.addComponent(lblOperations, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)))
									.addPreferredGap(ComponentPlacement.RELATED, 598, Short.MAX_VALUE)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addComponent(spinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(button, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_5, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
							.addGap(193)))
					.addGap(28))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(19)
					.addComponent(lblInputParameteres, GroupLayout.DEFAULT_SIZE, 1091, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(19)
					.addComponent(lblNewLabel)
					.addContainerGap(1039, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(29)
					.addComponent(tglbtnAdd)
					.addGap(152)
					.addComponent(btnSelect)
					.addContainerGap(741, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblCurve, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
							.addGap(29)
							.addComponent(lblInputParameteres)
							.addPreferredGap(ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNewLabel)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(4)
											.addComponent(button, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(7)
											.addComponent(lblSpecifyB))))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(spinner_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(spinner_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(5))))
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
							.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
							.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)))
					.addGap(22)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(16)
							.addComponent(lblOperations, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
							.addGap(52)
							.addComponent(tglbtnAdd, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(spinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(136)
							.addComponent(layeredPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(button_5, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(13, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(189)
					.addComponent(lblSpecifyP)
					.addContainerGap(200, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(189)
					.addComponent(spinner_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
					.addComponent(btnSelect)
					.addGap(32))
		);
		contentPane.setLayout(gl_contentPane);
	}
	
	///////////////////////////////////////////////////////////
	//This method contains all of the code for creating events
	//////////////////////////////////////////////////////////
	
	private void CreateEvents() {
	}
}
