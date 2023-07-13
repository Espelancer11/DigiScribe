package codes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.Color;
import java.awt.SystemColor;

public class Services extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Services frame = new Services();
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
	public Services() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 820, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(235, 233, 235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblServices = new JLabel("Services");
		lblServices.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblServices.setBounds(35, 25, 726, 30);
		contentPane.add(lblServices);
		
		JLabel lblinterested = new JLabel("Which of our service are you interested in?*");
		lblinterested.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblinterested.setBounds(35, 55, 653, 30);
		contentPane.add(lblinterested);
		
		JCheckBox chckTransciption = new JCheckBox("Medical Transcription");
		chckTransciption.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckTransciption.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				System.out.println("Medical Transcription");
			}
		});
		chckTransciption.setBounds(37, 95, 730, 30);
		contentPane.add(chckTransciption);
		
		JCheckBox chckbxMedicalcoding = new JCheckBox("Medical Coding");
		chckbxMedicalcoding.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxMedicalcoding.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				System.out.println("Medical Coding");
			}
		});
		chckbxMedicalcoding.setBounds(37, 130, 730, 30);
		contentPane.add(chckbxMedicalcoding);
		
		JCheckBox chckbxGeneraltranscription = new JCheckBox("General Transcription");
		chckbxGeneraltranscription.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxGeneraltranscription.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				System.out.println("General Transcription");
			}
		});
		chckbxGeneraltranscription.setBounds(37, 165, 730, 30);
		contentPane.add(chckbxGeneraltranscription);
		
		JCheckBox chckbxLegal = new JCheckBox("Legal Transcription");
		chckbxLegal.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxLegal.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				System.out.println("Legal Transcription");
			}
		});
		chckbxLegal.setBounds(37, 200, 730, 30);
		contentPane.add(chckbxLegal);
		
		JCheckBox chckbxData = new JCheckBox("Data Entry Service");
		chckbxData.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxData.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				System.out.println("Data Entry Service");
			}
		});
		chckbxData.setBounds(37, 235, 730, 30);
		contentPane.add(chckbxData);
		
		JCheckBox chckbxCadd = new JCheckBox("CADD Services");
		chckbxCadd.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxCadd.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				System.out.println("CADD Services");
			}
		});
		chckbxCadd.setBounds(37, 270, 730, 30);
		contentPane.add(chckbxCadd);
		
		JCheckBox chckbxConversion = new JCheckBox("Data Conversion");
		chckbxConversion.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxConversion.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				System.out.println("Data Conversion");
			}
		});
		chckbxConversion.setBounds(37, 305, 730, 30);
		contentPane.add(chckbxConversion);
		
		JCheckBox chckbxEMRprocess = new JCheckBox("EMR Data Processing");
		chckbxEMRprocess.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxEMRprocess.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				System.out.println("EMR Data Processing");
			}
		});
		chckbxEMRprocess.setBounds(35, 340, 726, 30);
		contentPane.add(chckbxEMRprocess);
		
		JButton btnNext = new JButton("Next");
		btnNext.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Message page = new Message();
				page.setVisible(true);
				
			}
		});
		btnNext.setBounds(320, 392, 150, 45);
		contentPane.add(btnNext);
	}

}
