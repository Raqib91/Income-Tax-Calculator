package income_Tax;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Input03 {

	private JFrame frmAllowableInvestments;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	
	double insurance;
	double savings;
	double share;
	double other;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Input03 window = new Input03();
//					window.frmAllowableInvestments.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public Input03(Authentication a, Input01 i1, Input02 i2) {
		initialize(a, i1, i2);
	}
	
	public Input03 f() {
		return this;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(Authentication a, Input01 i1, Input02 i2) {
		frmAllowableInvestments = new JFrame();
		frmAllowableInvestments.getContentPane().setBackground(new Color(0, 0, 51));
		frmAllowableInvestments.setTitle("Allowable Investments");
		frmAllowableInvestments.setIconImage(Toolkit.getDefaultToolkit().getImage(Input03.class.getResource("/images/icon.png")));
		frmAllowableInvestments.setBounds(465, 200, 450, 340);
		frmAllowableInvestments.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAllowableInvestments.getContentPane().setLayout(null);
		
		JLabel lblPleaseEnter = new JLabel("*** Please enter BDT amount ***");
		lblPleaseEnter.setHorizontalAlignment(SwingConstants.CENTER);
		lblPleaseEnter.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPleaseEnter.setForeground(new Color(0, 255, 255));
		lblPleaseEnter.setBounds(105, 11, 227, 30);
		frmAllowableInvestments.getContentPane().add(lblPleaseEnter);
		
		JLabel lblLifeInsurance = new JLabel("Life Insurance:");
		lblLifeInsurance.setForeground(new Color(0, 255, 255));
		lblLifeInsurance.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLifeInsurance.setBounds(77, 86, 97, 19);
		frmAllowableInvestments.getContentPane().add(lblLifeInsurance);
		
		JLabel lblSavings = new JLabel("Savings:");
		lblSavings.setForeground(Color.CYAN);
		lblSavings.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSavings.setBounds(77, 127, 97, 19);
		frmAllowableInvestments.getContentPane().add(lblSavings);
		
		JLabel lblShareMarket = new JLabel("Share Market:");
		lblShareMarket.setForeground(Color.CYAN);
		lblShareMarket.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblShareMarket.setBounds(77, 168, 97, 19);
		frmAllowableInvestments.getContentPane().add(lblShareMarket);
		
		JLabel lblOthers = new JLabel("Others:");
		lblOthers.setForeground(Color.CYAN);
		lblOthers.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblOthers.setBounds(77, 209, 97, 19);
		frmAllowableInvestments.getContentPane().add(lblOthers);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setForeground(new Color(0, 0, 51));
		textField.setBackground(new Color(0, 255, 255));
		textField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField.setBounds(223, 82, 142, 30);
		textField.setText("0");
		frmAllowableInvestments.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setForeground(new Color(0, 0, 51));
		textField_1.setBackground(new Color(0, 255, 255));
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_1.setColumns(10);
		textField_1.setBounds(223, 123, 142, 30);
		textField_1.setText("0");
		frmAllowableInvestments.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setForeground(new Color(0, 0, 51));
		textField_2.setBackground(new Color(0, 255, 255));
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_2.setColumns(10);
		textField_2.setBounds(223, 164, 142, 30);
		textField_2.setText("0");
		frmAllowableInvestments.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setForeground(new Color(0, 0, 51));
		textField_3.setBackground(new Color(0, 255, 255));
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_3.setColumns(10);
		textField_3.setBounds(223, 205, 142, 30);
		textField_3.setText("0");
		frmAllowableInvestments.getContentPane().add(textField_3);
		
		Button button = new Button("Next >>");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				insurance = Double.parseDouble(textField.getText());
				savings = Double.parseDouble(textField_1.getText());
				share = Double.parseDouble(textField_2.getText());
				other = Double.parseDouble(textField_3.getText());
				
				frmAllowableInvestments.setVisible(false);
				Input03 i3 = f();
				new Final(a, i1, i2, i3);
				new Calculation(a, i1, i2, i3);
				
			}
		});
		button.setBackground(new Color(0, 255, 255));
		button.setForeground(new Color(0, 0, 51));
		button.setFont(new Font("Dialog", Font.PLAIN, 12));
		button.setBounds(295, 269, 70, 22);
		frmAllowableInvestments.getContentPane().add(button);
		
		frmAllowableInvestments.setVisible(true);
	}

}
