import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Sample implements ActionListener{
		
		private static JLabel label;
		private static JTextField inserimento;
		private static JButton button; 
		private static JLabel result;
			
	public static void main(String[] args) {
		
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		frame.setSize(500, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.setLayout(null);
		
		ImageIcon icona= new ImageIcon("img/im.jpg");
		frame.setIconImage(icona.getImage());

		/*
		 * Label-> scritta
		 */
		label= new JLabel("Inserisci un valore maggiore di 1: ");
		label.setBounds(10, 20, 200, 25);
		panel.add(label); 
	
		/**
		 * Label dell'inserimento
		 */
		inserimento= new JTextField(20);
		inserimento.setBounds(210, 20, 165, 25);
		panel.add(inserimento);
		
		/*
		 * Bottone del programma
		 */
		button= new JButton("Esegui");
		button.setBounds(10, 50, 80, 25);
		button.addActionListener(new Sample());
		panel.add(button);
		
		/*
		 * Label dei risultati
		 */
		result= new JLabel();
		result.setBounds(10, 80, 300, 25);
		panel.add(result);
		
		frame.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		int val=1;
		try {
			int number= Integer.parseInt(inserimento.getText());
			System.out.println(number);
			
			if(number>val) {
				result.setText("Numero inserito maggiore di 1");
			} else {
				result.setText("Numero inserito minore di 1");

			}
		} catch (NumberFormatException e) {
			result.setText("Non hai inserito un numero");
		}
	}

}
