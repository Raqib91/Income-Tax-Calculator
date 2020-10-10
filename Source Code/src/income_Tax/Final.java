package income_Tax;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import java.awt.Button;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.BevelBorder;

public class Final {

	private JFrame frmIncomeTax;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Final window = new Final();
//					window.frmIncomeTax.setUndecorated(true);
//					window.frmIncomeTax.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public Final(Authentication a, Input01 i1, Input02 i2, Input03 i3) {
		initialize(a, i1, i2, i3);
	}
	
	public Final f() {
		return this;
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(Authentication a, Input01 i1, Input02 i2, Input03 i3) {
		Calculation c = new Calculation(a, i1, i2, i3);
		
		frmIncomeTax = new JFrame();
		frmIncomeTax.setTitle("Income Tax");
		frmIncomeTax.getContentPane().setBackground(new Color(0, 0, 51));
		frmIncomeTax.setIconImage(Toolkit.getDefaultToolkit().getImage(Final.class.getResource("/images/icon.png")));
		frmIncomeTax.setBounds(80, 35, 1200, 700);
		frmIncomeTax.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmIncomeTax.getContentPane().setLayout(null);
		
		JLabel lblIncomeTaxCalculator = new JLabel("Income Tax Calculator");
		lblIncomeTaxCalculator.setHorizontalAlignment(SwingConstants.CENTER);
		lblIncomeTaxCalculator.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblIncomeTaxCalculator.setForeground(new Color(0, 255, 255));
		lblIncomeTaxCalculator.setBounds(338, 11, 568, 61);
		frmIncomeTax.getContentPane().add(lblIncomeTaxCalculator);
		
		JLabel lblTaxableIncome = new JLabel("Taxable Income:");
		lblTaxableIncome.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblTaxableIncome.setForeground(new Color(0, 255, 255));
		lblTaxableIncome.setBounds(57, 119, 193, 26);
		frmIncomeTax.getContentPane().add(lblTaxableIncome);
		
		JLabel lblTaxCredit = new JLabel("Tax Credit:");
		lblTaxCredit.setForeground(Color.CYAN);
		lblTaxCredit.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblTaxCredit.setBounds(57, 166, 193, 26);
		frmIncomeTax.getContentPane().add(lblTaxCredit);
		
		JLabel lblTaxToPay = new JLabel("Tax to Pay:");
		lblTaxToPay.setForeground(Color.CYAN);
		lblTaxToPay.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblTaxToPay.setBounds(57, 212, 193, 26);
		frmIncomeTax.getContentPane().add(lblTaxToPay);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBackground(new Color(0, 255, 255));
		textField.setForeground(new Color(0, 0, 51));
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(260, 119, 168, 29);
		frmIncomeTax.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBackground(new Color(0, 255, 255));
		textField_1.setForeground(new Color(0, 0, 51));
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setColumns(10);
		textField_1.setBounds(260, 163, 168, 29);
		frmIncomeTax.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBackground(new Color(0, 255, 255));
		textField_2.setForeground(new Color(0, 0, 51));
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setColumns(10);
		textField_2.setBounds(260, 212, 168, 29);
		frmIncomeTax.getContentPane().add(textField_2);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(0, 255, 255));
		separator.setBounds(57, 287, 399, 2);
		frmIncomeTax.getContentPane().add(separator);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 12));
		textArea.setEditable(false);
		textArea.setForeground(new Color(0, 0, 51));
		textArea.setBackground(new Color(0, 255, 255));
		textArea.setBounds(523, 103, 625, 525);
		frmIncomeTax.getContentPane().add(textArea);
		
		Button button = new Button("Calculate");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(String.format("%.2f /=", c.totalTaxableIncome));
				textField_1.setText(String.format("%.2f /=", c.taxcredit));
				textField_2.setText(String.format("%.2f /=", c.finalTax));
				
			}
		});
		button.setFont(new Font("Dialog", Font.PLAIN, 20));
		button.setBackground(new Color(0, 255, 255));
		button.setForeground(new Color(0, 0, 51));
		button.setBounds(57, 311, 168, 38);
		frmIncomeTax.getContentPane().add(button);
		
		Button button_1 = new Button("Report");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField_3.setText("Thank You!");
				//=======================================================
				
				int refs = 1325 + (int)(Math.random()*4238);
				
				//=======================================================
				
				Calendar timer = Calendar.getInstance();
				timer.getTime();
				SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
				tTime.format(timer.getTime());
				SimpleDateFormat tDate = new SimpleDateFormat("dd-MMM-yyyy");
				tDate.format(timer.getTime());
				
				//======================================================
				
				textArea.append("\n\t\t\t\tIncome Tax Calculator\n" + 
				"   Reference:\t\t\t\t\t\t\t\t\t" + refs + "\n" + 
				"   ===================================================================================" + "\n   Hello " + a.name +
				",\n\t\t\t\t\t\t\t\t\tTaxable\n\n" + 
				"   Basic Salary ....................................................... " + String.format("%.2f", c.taxableBasic) +
				"/= \n   House Rent ......................................................... " + String.format("%.2f", c.taxableHouse) +
				"/= \n   (50% of the basic salary or 25000BDT is tolerated)\n   Transportation ..................................................... " + String.format("%.2f", c.taxableTransport) +
				"/= \n   (2500 BDT is tolerated)\n   Medical Assistance ................................................. " + String.format("%.2f", c.taxableMedical) +
				"/= \n   (10% of basic salary or 10000BDT is tolerated)\n   Gross Other ........................................................ " + String.format("%.2f", c.taxableOther1) +
				"/= \n   Festival Bonus ..................................................... " + String.format("%.2f", i2.festival) +
				"/= \n   Provident Fund ..................................................... " + String.format("%.2f", i2.provident) +
				"/= \n   Performance Bonus .................................................. " + String.format("%.2f", i2.performance) +
				"/= \n   Leave Fare Assistance .............................................. " + String.format("%.2f", i2.leave) +
				"/= \n   Other Benefits ..................................................... " + String.format("%.2f", i2.other) +
				"/= \n   ===================================================================================\n" + 
				"   Total Taxable Income ............................................... " + String.format("%.2f", c.totalTaxableIncome) +
				"/= \n   Total Tax .......................................................... " + String.format("%.2f", c.tax) +
				"/= \n   Tax Credit ......................................................... " + String.format("%.2f", c.taxcredit) +
				"/= \n   ===================================================================================\n" +
				"   Tax to Pay ......................................................... " + String.format("%.2f", c.finalTax) +
				"/= \n\n   Date: " + tDate.format(timer.getTime()) + "\t\t\t\t\t\t\tTime: " + tTime.format(timer.getTime()));
				
			}
		});
		button_1.setForeground(new Color(0, 0, 51));
		button_1.setFont(new Font("Dialog", Font.PLAIN, 20));
		button_1.setBackground(Color.CYAN);
		button_1.setBounds(260, 311, 168, 38);
		frmIncomeTax.getContentPane().add(button_1);
		
		Button button_2 = new Button("Print");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					textArea.print();
				} catch (PrinterException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		button_2.setForeground(new Color(0, 0, 51));
		button_2.setFont(new Font("Dialog", Font.PLAIN, 20));
		button_2.setBackground(Color.CYAN);
		button_2.setBounds(57, 374, 168, 38);
		frmIncomeTax.getContentPane().add(button_2);
		
		Button button_3 = new Button("Exit");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmIncomeTax.setVisible(false);
				
			}
		});
		button_3.setForeground(new Color(0, 0, 51));
		button_3.setFont(new Font("Dialog", Font.PLAIN, 20));
		button_3.setBackground(Color.CYAN);
		button_3.setBounds(260, 374, 168, 38);
		frmIncomeTax.getContentPane().add(button_3);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setForeground(new Color(0, 255, 255));
		separator_1.setBounds(489, 103, 2, 525);
		frmIncomeTax.getContentPane().add(separator_1);
		
//		JTextArea textArea = new JTextArea();
//		textArea.setEditable(false);
//		textArea.setForeground(new Color(0, 0, 51));
//		textArea.setBackground(new Color(0, 255, 255));
//		textArea.setBounds(523, 103, 625, 525);
//		frmIncomeTax.getContentPane().add(textArea);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 255, 255));
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(57, 451, 371, 177);
		frmIncomeTax.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 51));
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(10, 11, 351, 155);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 255, 255));
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBounds(10, 11, 331, 133);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 0, 51));
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3.setBounds(10, 11, 311, 111);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setBackground(new Color(0, 255, 255));
		textField_3.setForeground(new Color(0, 0, 51));
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 30));
		textField_3.setBounds(10, 11, 291, 89);
		panel_3.add(textField_3);
		textField_3.setColumns(10);
		
		frmIncomeTax.setVisible(true);
	}
}
