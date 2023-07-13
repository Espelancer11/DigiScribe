package codes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.mail.*;
import javax.mail.internet.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.util.Properties;

public class Message extends JFrame {
    private JTextField senderNameField;
    private JTextField subjectField;
    private JTextArea messageArea;
    private JButton attachButton;
    private JButton sendButton;
    private String senderEmail = "";
    private String senderPassword = "";
    private JTextField Email;

    public Message() {
        setTitle("Email Sender");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(820, 500);
        getContentPane().setLayout(new BorderLayout());

        JPanel formPanel = new JPanel();
        JLabel senderNameLabel = new JLabel("Sender Name:");
        senderNameLabel.setBounds(30, 171, 83, 29);
        senderNameField = new JTextField();
        senderNameField.setBounds(114, 170, 650, 30);
        JLabel subjectLabel = new JLabel("Subject:");
        subjectLabel.setBounds(64, 227, 83, 29);
        subjectField = new JTextField();
        subjectField.setBounds(114, 226, 650, 30);
        JLabel messageLabel = new JLabel("Message:");
        messageLabel.setBounds(56, 278, 83, 30);
        formPanel.setLayout(null);
        formPanel.add(senderNameLabel);
        formPanel.add(senderNameField);
        formPanel.add(subjectLabel);
        formPanel.add(subjectField);
        formPanel.add(messageLabel);
        messageArea = new JTextArea();
        messageArea.setBounds(114, 274, 650, 107);
        formPanel.add(messageArea);
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(292, 15, 2, 2);
        formPanel.add(scrollPane);

        JPanel buttonPanel = new JPanel(new FlowLayout());
        attachButton = new JButton("Attach File");
        attachButton.addActionListener(new AttachButtonListener());
        sendButton = new JButton("Send");
        sendButton.addActionListener(new SendButtonListener());
        buttonPanel.add(attachButton);
        buttonPanel.add(sendButton);

        getContentPane().add(formPanel, BorderLayout.CENTER);
        
        JLabel Sender = new JLabel("Email:");
        Sender.setBounds(77, 114, 68, 29);
        formPanel.add(Sender);
        
        Email = new JTextField();
        Email.setBounds(114, 113, 650, 30);
        formPanel.add(Email);
        Email.setColumns(10);
        
        JLabel lblNewLabel = new JLabel("Tell us about your workflow needs");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 28));
        lblNewLabel.setBounds(158, 44, 646, 45);
        formPanel.add(lblNewLabel);
        getContentPane().add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    private class AttachButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JFileChooser fileChooser = new JFileChooser();
            int result = fileChooser.showOpenDialog(Message.this);
            if (result == JFileChooser.APPROVE_OPTION) {
                // Get the selected file and perform necessary operations
                File file = fileChooser.getSelectedFile();
                // TODO: Attach the file to the email
                // You can use the JavaMail API's MimeBodyPart class to add attachments
            }
        }
    }

    private class SendButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        	String senderEmail = Email.getText(); 
            String senderName = senderNameField.getText();
            String subject = subjectField.getText();
            String message = messageArea.getText();
            
			dispose();
			Dialog page = new Dialog();
			page.setVisible(true);

            if (senderName.isEmpty() || subject.isEmpty() || message.isEmpty() || senderEmail.isEmpty() ) {
                JOptionPane.showMessageDialog(Message.this, "Please fill in all fields.", "Error",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }
            else {
            	System.out.println("" + senderEmail);
            	System.out.println("" + senderName);
            	System.out.println("" + subject);
            	System.out.println("" + message);
            }

                   }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Message();
        });
    }
}