import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Prova_password implements ActionListener {

		private static JLabel label;
		private static JTextField userText;
		private static JLabel passwordLabbel;
		private static JPasswordField passwordText;
		private static JButton button;
		private static  JLabel success;
		
	public static void main(String[] args) {
		
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		frame.setSize(350, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.setLayout(null);
		
		/*
		 * Label-> scritta
		 */
		label= new JLabel("User");
		label.setBounds(10, 20, 80, 25);
		panel.add(label); 
		
		/**
		 * TextField-> box dove inserire il valore
		 */
		userText= new JTextField(20);
		userText.setBounds(100, 20, 165, 25);
		panel.add(userText);
		
		/*
		 * Label della password
		 */
		passwordLabbel= new JLabel("Password");
		passwordLabbel.setBounds(10, 50, 80, 25); //Incremento di 30 il valore
		panel.add(passwordLabbel);
		
		passwordText= new JPasswordField();
		passwordText.setBounds(100, 50, 165, 25);
		panel.add(passwordText);
		
		/**
		 * Bottone del programma
		 */
		button= new JButton("Login");
		button.setBounds(10, 80, 80, 25);
		button.addActionListener(new Prova_password()); //Permette di fare l'elaborazione dei dati
		panel.add(button);
		
		/**
		 * Label dove vengono scritti i risultati
		 */
		success= new JLabel("");
		success.setBounds(10, 110, 300, 25);
		panel.add(success);
		
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String user = userText.getText();
		String password= passwordText.getText();
		System.out.println(user+" "+password);
		
		if(user.equals("marco") && password.equals("vinci")) {
			success.setText("Login succesful!");
		}
	}
	
}
