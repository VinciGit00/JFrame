import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
/*
 * Metodo alternativo per creare i file
 */
public class Test {
	
	private JLabel label;
	private JTextField inserimento;
	private JButton button; 
	private JLabel result;
	private JScrollPane scrPane;
	
	public Test() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		
		frame.setSize(410, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		
		scrPane= new JScrollPane(panel);
		scrPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		frame.add(scrPane);
		
		panel.setLayout(null);
	
		/*
		 * Label-> Scritta
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
		button.addActionListener(new Inserimento());
		panel.add(button);
		
		/*
		 * Label dei risultati
		 */
		result= new JLabel();
		result.setBounds(10, 80, 300, 25);
		panel.add(result);
		
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new Test();

	}

	private class Inserimento implements ActionListener {
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
	
}
