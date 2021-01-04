package java1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.Color;

public class GUI implements ActionListener {
	private static JLabel userLabel;
	private static JTextField userText;
	private static JLabel userError;
	private static JLabel passwordLabel;
	private static JPasswordField passwordText;
	private static JLabel passError;
	private static JButton button;
	private static JLabel success;
	
	public static void main(String[] arg) {
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.setSize(300,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		
		panel.setLayout(null);
		
		userLabel = new JLabel("Username");
		userLabel.setBounds(10, 20, 80, 25);
		panel.add(userLabel);
		
		userText = new JTextField(20);
		userText.setBounds(100, 20, 165, 25);
		panel.add(userText);
		
		userError = new JLabel("");
		userError.setBounds(100, 45, 165, 25);
		userError.setForeground(Color.RED);
		panel.add(userError);
		
		passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(10, 70, 80, 25);
		panel.add(passwordLabel);
		
		passwordText = new JPasswordField();
		passwordText.setBounds(100, 70, 165, 25);
		panel.add(passwordText);
		
		passError = new JLabel("");
		passError.setBounds(100, 95, 165, 25);
		passError.setForeground(Color.RED);
		panel.add(passError);
		
		
		button = new JButton("LogIn");
		button.setBounds(100, 120, 80, 25);
		button.addActionListener(new GUI());
		panel.add(button);
		
		success = new JLabel("");
		success.setBounds(100, 160, 300, 25);
		success.setForeground(Color.RED);
		panel.add(success);
		
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		String user = userText.getText();
		String password = passwordText.getText();
		System.out.println(user + ", " + password);
		
		if(user.equals("Andy") && password.equals("password123")) {
			success.setText("Login successful!");
		}
		else {
			success.setText("Invalid Username or Password");
		}
		
		if(user.isBlank()) {
			userError.setText("Please fill in the Username");
		}
		else {
			userError.setText("");
		}
		
		if(password.isBlank()) {
			passError.setText("Please fill in the Password");
		}
		else {
			passError.setText("");
		}
		
		if(user.isBlank() || password.isBlank()) {
			success.setText("");
		}
	}		
}
