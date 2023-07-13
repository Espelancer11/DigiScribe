package codes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Info extends JFrame {

	private JPanel contentPane;
	private JTextField textName;
	private JTextField textEmail;
	private JTextField textContact;
	private JTextField textCompany;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Info frame = new Info();
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
	public Info() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 820, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Request a Qoute");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(276, 11, 411, 45);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Provide your contact info so we can reach out about your qoute.");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(35, 50, 653, 30);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblName = new JLabel("Full Name*");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblName.setBounds(50, 90, 303, 20);
		contentPane.add(lblName);
		
		textName = new JTextField();
		textName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textName.setBounds(37, 110, 730, 30);
		contentPane.add(textName);
		textName.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email*");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEmail.setBounds(50, 150, 303, 20);
		contentPane.add(lblEmail);
		
		textEmail = new JTextField();
		textEmail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textEmail.setBounds(37, 170, 730, 30);
		contentPane.add(textEmail);
		textEmail.setColumns(10);
		
		JLabel lblContact = new JLabel("Contact Number*");
		lblContact.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblContact.setBounds(50, 210, 303, 20);
		contentPane.add(lblContact);
		
		textContact = new JTextField();
		textContact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textContact.setBounds(37, 230, 730, 30);
		contentPane.add(textContact);
		textContact.setColumns(10);
		
		JLabel lblCompany = new JLabel("Company Name*");
		lblCompany.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCompany.setBounds(50, 270, 303, 20);
		contentPane.add(lblCompany);
		
		textCompany = new JTextField();
		textCompany.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textCompany.setBounds(37, 290, 730, 30);
		contentPane.add(textCompany);
		textCompany.setColumns(10);
		
		JButton btnNext = new JButton("Next");
		btnNext.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Services page = new Services();
				page.setVisible(true);
			}
		});
		btnNext.setBounds(320, 392, 150, 45);
		contentPane.add(btnNext);
		
		
		btnNext.setEnabled(false);
		JCheckBox chckcheck = new JCheckBox("I have read and agree to the privacy policy*");
		chckcheck.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckcheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String Name = textName.getText();
				String Email = textEmail.getText();
				String Company = textCompany.getText();
				String Contact = textContact.getText();
				
				System.out.println("" + Name);
				System.out.println("" + Email);
				System.out.println("" + Company);
				System.out.println("" + Contact);
				
				if (Name.isEmpty() || Email.isEmpty() || Company.isEmpty() || Contact.isEmpty()) {
					btnNext.setEnabled(false);
				}else {
					if(chckcheck.isSelected()) {
						btnNext.setEnabled(true);
					}else {
						btnNext.setEnabled(false);
					}
				}

			}
		});
		chckcheck.setBounds(257, 355, 406, 30);
		contentPane.add(chckcheck);
		

	}
}
