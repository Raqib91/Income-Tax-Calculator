package income_Tax;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Input01 {

	private JFrame frmGrossSalary;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	
	double basic;
	double house;
	double transport;
	double medical;
	double other;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Input01 window = new Input01();
//					window.frmGrossSalary.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public Input01(Authentication a) {
		initialize(a);
	}
	
	public Input01 f() {
		return this;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(Authentication a) {
		frmGrossSalary = new JFrame();
		frmGrossSalary.setTitle("Gross Salary");
		frmGrossSalary.setIconImage(Toolkit.getDefaultToolkit().getImage(Input01.class.getResource("/images/icon.png")));
		frmGrossSalary.getContentPane().setBackground(new Color(0, 0, 51));
		frmGrossSalary.setBounds(465, 200, 460, 350);
		frmGrossSalary.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGrossSalary.getContentPane().setLayout(null);
		
		JLabel lblBasicSalary = new JLabel("Basic Salary:");
		lblBasicSalary.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblBasicSalary.setForeground(new Color(0, 255, 255));
		lblBasicSalary.setBounds(81, 69, 93, 27);
		frmGrossSalary.getContentPane().add(lblBasicSalary);
		
		JLabel lblHouseRent = new JLabel("House Rent:");
		lblHouseRent.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblHouseRent.setForeground(Color.CYAN);
		lblHouseRent.setBounds(81, 107, 93, 27);
		frmGrossSalary.getContentPane().add(lblHouseRent);
		
		JLabel lblTransportation = new JLabel("Transportation:");
		lblTransportation.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTransportation.setForeground(Color.CYAN);
		lblTransportation.setBounds(81, 145, 106, 27);
		frmGrossSalary.getContentPane().add(lblTransportation);
		
		JLabel lblMedical = new JLabel("Medical:");
		lblMedical.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMedical.setForeground(Color.CYAN);
		lblMedical.setBounds(81, 183, 93, 27);
		frmGrossSalary.getContentPane().add(lblMedical);
		
		JLabel lblOthers = new JLabel("Others:");
		lblOthers.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblOthers.setForeground(Color.CYAN);
		lblOthers.setBounds(81, 221, 93, 27);
		frmGrossSalary.getContentPane().add(lblOthers);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField.setForeground(new Color(0, 0, 51));
		textField.setBackground(new Color(0, 255, 255));
		textField.setBounds(216, 67, 159, 28);
		frmGrossSalary.getContentPane().add(textField);
		textField.setColumns(10);
		textField.setText("0");
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_1.setForeground(new Color(0, 0, 51));
		textField_1.setBackground(new Color(0, 255, 255));
		textField_1.setColumns(10);
		textField_1.setBounds(216, 105, 159, 28);
		textField_1.setText("0");
		frmGrossSalary.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_2.setForeground(new Color(0, 0, 51));
		textField_2.setBackground(new Color(0, 255, 255));
		textField_2.setColumns(10);
		textField_2.setBounds(216, 144, 159, 28);
		textField_2.setText("0");
		frmGrossSalary.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_3.setForeground(new Color(0, 0, 51));
		textField_3.setBackground(new Color(0, 255, 255));
		textField_3.setColumns(10);
		textField_3.setBounds(216, 183, 159, 28);
		textField_3.setText("0");
		frmGrossSalary.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_4.setForeground(new Color(0, 0, 51));
		textField_4.setBackground(new Color(0, 255, 255));
		textField_4.setColumns(10);
		textField_4.setBounds(216, 222, 159, 28);
		textField_4.setText("0");
		frmGrossSalary.getContentPane().add(textField_4);
		
		JButton btnNext = new JButton("Next >>");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				basic = Double.parseDouble(textField.getText());
				house = Double.parseDouble(textField_1.getText());
				transport = Double.parseDouble(textField_2.getText());
				medical = Double.parseDouble(textField_3.getText());
				other = Double.parseDouble(textField_4.getText());
				
				frmGrossSalary.setVisible(false);
				Input01 i1 = f();
				new Input02(a, i1);

			}
		});
		btnNext.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNext.setForeground(new Color(0, 0, 51));
		btnNext.setBackground(new Color(0, 255, 255));
		btnNext.setBounds(286, 277, 89, 23);
		frmGrossSalary.getContentPane().add(btnNext);
		
		JLabel lblPleaseEnter = new JLabel("*** Please enter BDT amount ***");
		lblPleaseEnter.setHorizontalAlignment(SwingConstants.CENTER);
		lblPleaseEnter.setForeground(new Color(0, 255, 255));
		lblPleaseEnter.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPleaseEnter.setBounds(107, 11, 250, 27);
		frmGrossSalary.getContentPane().add(lblPleaseEnter);
		
		frmGrossSalary.setVisible(true);
	}

}
