package income_Tax;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Authentication {

	private JFrame frmAuthentication;
	private JTextField textField;
	private JTextField textField_1;
	
	String name;
	int age;
	int sex;
	int quota;
	int residence;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Authentication window = new Authentication();
//					window.frmAuthentication.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public Authentication() {
		initialize();
	}
	
	public Authentication f() {
		return this;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAuthentication = new JFrame();
		frmAuthentication.setTitle("Authentication");
		frmAuthentication.setIconImage(Toolkit.getDefaultToolkit().getImage(Authentication.class.getResource("/images/icon.png")));
		frmAuthentication.getContentPane().setBackground(new Color(0, 0, 51));
		frmAuthentication.getContentPane().setForeground(new Color(0, 255, 255));
		frmAuthentication.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 15));
		frmAuthentication.setBounds(465, 200, 450, 380);
		frmAuthentication.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAuthentication.getContentPane().setLayout(null);
		frmAuthentication.setVisible(true);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setForeground(new Color(0, 255, 255));
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblName.setBounds(74, 81, 46, 19);
		frmAuthentication.getContentPane().add(lblName);
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setForeground(new Color(0, 255, 255));
		lblAge.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAge.setBounds(74, 121, 46, 19);
		frmAuthentication.getContentPane().add(lblAge);
		
		JLabel lblSex = new JLabel("Sex:");
		lblSex.setForeground(new Color(0, 255, 255));
		lblSex.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSex.setBounds(74, 161, 46, 19);
		frmAuthentication.getContentPane().add(lblSex);
		
		JLabel lblQuota = new JLabel("Quota:");
		lblQuota.setForeground(new Color(0, 255, 255));
		lblQuota.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblQuota.setBounds(74, 201, 46, 19);
		frmAuthentication.getContentPane().add(lblQuota);
		
		JLabel lblNewLabel = new JLabel("Residence:");
		lblNewLabel.setForeground(new Color(0, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(74, 241, 70, 19);
		frmAuthentication.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		//textField.setText("0");
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				name = textField.getText();
			}
		});
		textField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField.setForeground(new Color(0, 0, 51));
		textField.setBackground(new Color(0, 255, 255));
		textField.setBounds(171, 78, 187, 29);
		frmAuthentication.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				age = Integer.parseInt(textField_1.getText());
			}
		});
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_1.setForeground(new Color(0, 0, 51));
		textField_1.setBackground(new Color(0, 255, 255));
		textField_1.setColumns(10);
		textField_1.setBounds(171, 118, 187, 29);
		frmAuthentication.getContentPane().add(textField_1);
		
		JComboBox comboBox = new JComboBox();
		//comboBox.setSelectedIndex(0);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sex = comboBox.getSelectedIndex();
			}
		});
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 12));
		comboBox.setForeground(new Color(0, 0, 51));
		comboBox.setBackground(new Color(0, 255, 255));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female"}));
		comboBox.setBounds(171, 158, 187, 29);
		frmAuthentication.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		//comboBox_1.setSelectedIndex(0);
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				quota = comboBox_1.getSelectedIndex();
			}
		});
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		comboBox_1.setForeground(new Color(0, 0, 51));
		comboBox_1.setBackground(new Color(0, 255, 255));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"N/A", "Freedom Fighter (Injured)", "Autistic"}));
		comboBox_1.setBounds(171, 198, 187, 29);
		frmAuthentication.getContentPane().add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		//comboBox_2.setSelectedIndex(0);
		comboBox_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				residence = comboBox_2.getSelectedIndex();
			}
		});
		comboBox_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Dhaka North City Corporation", "Dhaka South City Corporation", "Chittagong City Corporation", "Narayanganj City Corporation", "Gazipur City Corporation", "Comilla City Corporation", "Barishal City Corporation", "Khulna City Corporation", "Rajshahi City Corporation", "Rangpur City Corporation", "Sylhet City Corporation", "Mymensingh City Corporation", "N/A"}));
		comboBox_2.setForeground(new Color(0, 0, 51));
		comboBox_2.setBackground(new Color(0, 255, 255));
		comboBox_2.setBounds(171, 238, 187, 29);
		frmAuthentication.getContentPane().add(comboBox_2);
		
		JLabel lblPleaseFill = new JLabel("*** Please fill up all the fields ***");
		lblPleaseFill.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPleaseFill.setHorizontalAlignment(SwingConstants.CENTER);
		lblPleaseFill.setForeground(new Color(0, 255, 255));
		lblPleaseFill.setBounds(94, 11, 253, 29);
		frmAuthentication.getContentPane().add(lblPleaseFill);
		
		Button button = new Button("Next >>");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				name = textField.getText();
				age = Integer.parseInt(textField_1.getText());
				sex = comboBox.getSelectedIndex();
				quota = comboBox_1.getSelectedIndex();
				residence = comboBox_2.getSelectedIndex();
				
				if(age < 18)
				{
					JOptionPane.showMessageDialog(null, "You don't need to pay tax", "Display Message", JOptionPane.INFORMATION_MESSAGE);
					frmAuthentication.setVisible(true);
					textField.setText(null);
					textField_1.setText(null);
				}
				
				else
				{
					frmAuthentication.setVisible(false);
					Authentication a = f();
					new Input01(a);
				}
				
			}
		});
		button.setBackground(new Color(0, 255, 255));
		button.setForeground(new Color(0, 0, 51));
		button.setFont(new Font("Dialog", Font.PLAIN, 14));
		button.setBounds(288, 291, 70, 22);
		frmAuthentication.getContentPane().add(button);
		frmAuthentication.setVisible(true);
	}
}
