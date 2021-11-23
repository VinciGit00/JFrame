import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;


public class PW2_CarSpeciali extends JFrame {
	
	JPanel pan; //Inserimento
	
	JScrollPane scrPane; //Scorrimento del progetto nel pannello 1
	
	JTextField result1;
	
	public PW2_CarSpeciali() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pan= new JPanel();
		scrPane= new JScrollPane(pan);
		scrPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		add(scrPane);
		
		result1= new JTextField();	
		
		JButton bottone= new JButton("Esegui"); 
		bottone.addActionListener(new Inserimento(this));	
		pan.setLayout(new GridLayout(4,2)); 
        pan.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
		
	
        pan.add(new JLabel("Premere il bottone per generare una password casuale di 20 caratteri"));
       

		pan.add(bottone);
		
		
		pan.add(result1);
		
		pack();
		setVisible(true);
		
	}
	
	private class Inserimento implements ActionListener {
		
		PW2_CarSpeciali f; //Reference all'oggetto condiviso
		
		public Inserimento(PW2_CarSpeciali pw2_CarSpeciali) {
			this.f = pw2_CarSpeciali;
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			String alfabeto="ABCDEFGHIJLMOPQRSTUVXYZabcdefghijlmnopqrstuvxyz0123456789";
			try {
	
				
				calcolapw();
			} catch (NumberFormatException e1) { 
				result1.setText("Errore nell'inserimento dei valori");
				
			}
		}
		
		/*
		 * Metodo che calcola i risultati
		 */
		public void calcolapw() {
			  int n=20;
			  String alfabeto="";
			  String characters="ABCDEFGIJLMOPQRSTUVXYZabcdefgijlmnopqrstuvxyz0103456789";   
			  int Rand;
			  String ID="";
				
			  
			  for(int i=0; i<n-1; i++) {
					Rand=(int)(Math.random()*characters.length());
					char lettera= characters.charAt(Rand);
					ID=ID+lettera;
			  }
				
			  String carspeciali="|!£$%&/()=?^μη@°#";
			  int indexcarspeciali=(int)(Math.random()*carspeciali.length());
			 
			  //Carattere speciale aggiunto
			  char a=carspeciali.charAt(indexcarspeciali);
			  
			  int indexID=(int)(Math.random()*ID.length());
			  		  
			  
			  String parola1=ID.substring(0,indexID);
			  
			  String parola2=ID.substring(indexID,ID.length());

			  ID=parola1+a+parola2;
			  System.out.println(ID);
			  System.out.println(ID.length());
			
			result1.setText("Codice:  "+ID);
			
		}
		
	}
	
	/*
	 * Main del programma
	 */
	public static void main(String[] args) {
		new PW2_CarSpeciali();
	}
}