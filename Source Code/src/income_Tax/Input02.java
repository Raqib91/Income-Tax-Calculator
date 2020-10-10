package income_Tax;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Input02 {

	private JFrame frmOtherBenefits;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	
	double festival;
	double provident;
	double performance;
	double leave;
	double other;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Input02 window = new Input02();
//					window.frmOtherBenefits.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public Input02(Authentication a, Input01 i1) {
		initialize(a, i1);
	}
	
	public Input02 f() {
		return this;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(Authentication a, Input01 i1) {
		frmOtherBenefits = new JFrame();
		frmOtherBenefits.setIconImage(Toolkit.getDefaultToolkit().getImage(Input02.class.getResource("/images/icon.png")));
		frmOtherBenefits.setTitle("Other Benefits");
		frmOtherBenefits.getContentPane().setBackground(new Color(0, 0, 51));
		frmOtherBenefits.setBounds(465, 200, 450, 350);
		frmOtherBenefits.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmOtherBenefits.getContentPane().setLayout(null);
		
		JLabel lblFestivalBonus = new JLabel("Festival Bonus:");
		lblFestivalBonus.setForeground(new Color(0, 255, 255));
		lblFestivalBonus.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFestivalBonus.setBounds(47, 60, 98, 25);
		frmOtherBenefits.getContentPane().add(lblFestivalBonus);
		
		JLabel lblProvidentFund = new JLabel("Provident Fund:");
		lblProvidentFund.setForeground(Color.CYAN);
		lblProvidentFund.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblProvidentFund.setBounds(47, 96, 111, 25);
		frmOtherBenefits.getContentPane().add(lblProvidentFund);
		
		JLabel lblPerformanceBonus = new JLabel("Performance Bonus:");
		lblPerformanceBonus.setForeground(Color.CYAN);
		lblPerformanceBonus.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPerformanceBonus.setBounds(47, 132, 138, 25);
		frmOtherBenefits.getContentPane().add(lblPerformanceBonus);
		
		JLabel lblLeaveFareAssistance = new JLabel("Leave Fare Assistance:");
		lblLeaveFareAssistance.setForeground(Color.CYAN);
		lblLeaveFareAssistance.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLeaveFareAssistance.setBounds(47, 168, 159, 25);
		frmOtherBenefits.getContentPane().add(lblLeaveFareAssistance);
		
		JLabel lblOthers = new JLabel("Others:");
		lblOthers.setForeground(Color.CYAN);
		lblOthers.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblOthers.setBounds(47, 204, 57, 25);
		frmOtherBenefits.getContentPane().add(lblOthers);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBackground(new Color(0, 255, 255));
		textField.setForeground(new Color(0, 0, 51));
		textField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField.setBounds(222, 61, 152, 25);
		textField.setText("0");
		frmOtherBenefits.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setBackground(new Color(0, 255, 255));
		textField_1.setForeground(new Color(0, 0, 51));
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_1.setColumns(10);
		textField_1.setBounds(222, 97, 152, 25);
		textField_1.setText("0");
		frmOtherBenefits.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setBackground(new Color(0, 255, 255));
		textField_2.setForeground(new Color(0, 0, 51));
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_2.setColumns(10);
		textField_2.setBounds(222, 133, 152, 25);
		textField_2.setText("0");
		frmOtherBenefits.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setBackground(new Color(0, 255, 255));
		textField_3.setForeground(new Color(0, 0, 51));
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_3.setColumns(10);
		textField_3.setBounds(222, 169, 152, 25);
		textField_3.setText("0");
		frmOtherBenefits.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setBackground(new Color(0, 255, 255));
		textField_4.setForeground(new Color(0, 0, 51));
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_4.setColumns(10);
		textField_4.setBounds(222, 205, 152, 25);
		textField_4.setText("0");
		frmOtherBenefits.getContentPane().add(textField_4);
		
		Button button = new Button("Next >>");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				festival = Double.parseDouble(textField.getText());
				provident = Double.parseDouble(textField_1.getText());
				performance = Double.parseDouble(textField_2.getText());
				leave = Double.parseDouble(textField_3.getText());
				other = Double.parseDouble(textField_4.getText());
				
				frmOtherBenefits.setVisible(false);
				Input02 i2 = f();
				new Input03(a, i1, i2);
				
			}
		});
		button.setBackground(new Color(0, 255, 255));
		button.setForeground(new Color(0, 0, 51));
		button.setFont(new Font("Dialog", Font.PLAIN, 12));
		button.setBounds(304, 279, 70, 22);
		frmOtherBenefits.getContentPane().add(button);
		
		JLabel lblNewLabel = new JLabel("*** Please enter BDT amount ***");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setForeground(new Color(0, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(81, 11, 276, 25);
		frmOtherBenefits.getContentPane().add(lblNewLabel);
		
		frmOtherBenefits.setVisible(true);
	}

}
