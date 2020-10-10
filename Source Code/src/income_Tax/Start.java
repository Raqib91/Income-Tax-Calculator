package income_Tax;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Start {

	private JFrame frmStart;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start window = new Start();
					window.frmStart.setUndecorated(true);
					window.frmStart.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Start() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStart = new JFrame();
		frmStart.setTitle("Start");
		frmStart.setBackground(Color.WHITE);
		frmStart.getContentPane().setBackground(new Color(0, 0, 51));
		frmStart.getContentPane().setForeground(Color.WHITE);
		frmStart.setIconImage(Toolkit.getDefaultToolkit().getImage(Start.class.getResource("/images/icon.png")));
		frmStart.setBounds(465, 200, 450, 250);
		frmStart.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStart.getContentPane().setLayout(null);
		
		JLabel lblWelcomeToIncome = new JLabel("Welcome to");
		lblWelcomeToIncome.setBackground(new Color(0, 0, 51));
		lblWelcomeToIncome.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcomeToIncome.setForeground(new Color(0, 255, 255));
		lblWelcomeToIncome.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblWelcomeToIncome.setBounds(119, 26, 217, 49);
		frmStart.getContentPane().add(lblWelcomeToIncome);
		
		JLabel lblincomeTaxCalculator = new JLabel("\"Income Tax Calculator\"");
		lblincomeTaxCalculator.setHorizontalAlignment(SwingConstants.CENTER);
		lblincomeTaxCalculator.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblincomeTaxCalculator.setForeground(new Color(0, 255, 255));
		lblincomeTaxCalculator.setBounds(74, 86, 303, 39);
		frmStart.getContentPane().add(lblincomeTaxCalculator);
		
		Button button = new Button("Start");
		button.setForeground(new Color(0, 0, 51));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				frmStart.setVisible(false);
				new Authentication();
				
			}
		});
		button.setBackground(new Color(0, 255, 255));
		button.setFont(new Font("Dialog", Font.PLAIN, 20));
		button.setBounds(154, 162, 142, 39);
		frmStart.getContentPane().add(button);
	}
}
