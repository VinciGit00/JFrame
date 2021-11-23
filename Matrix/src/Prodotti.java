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

public class Prodotti extends JFrame {
	
	JPanel pan; //Inserimento
	
	JScrollPane scrPane; //Scorrimento del progetto nel pannello 1
	
	JTextField casellaTesto1;
	JTextField casellaTesto2;
	
	JLabel result1;
	JLabel result2;
	JLabel result3;
	
	public Prodotti() {
		super("Prodotto scalare e vettoriale");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pan= new JPanel();
		scrPane= new JScrollPane(pan);
		scrPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		add(scrPane);
			
		casellaTesto1= new JTextField(); 
		casellaTesto2= new JTextField();
		
		result1= new JLabel();
		result2= new JLabel();
		result3= new JLabel();
		
		ImageIcon icona= new ImageIcon("img/im.png");
		setIconImage(icona.getImage());
		
		JButton bottone= new JButton("Esegui"); 
		bottone.addActionListener(new Inserimento(this));	
		pan.setLayout(new GridLayout(11,2)); 
        pan.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
		
		/*
		 * Lista dei dati da analizzare
		 */
        pan.add(new JLabel("Inserire i due vettori con cordinate separate da un ;"));
       
		pan.add(new JLabel("Vettore 1: "));
		pan.add(casellaTesto1);
		
		pan.add(new JLabel("Vettore 2: "));
		pan.add(casellaTesto2);		
		
		pan.add(new JLabel(" "));
		
		pan.add(bottone);
		
		pan.add(result1);
		pan.add(result2);
		pan.add(result3);
		
		pack();
		setVisible(true);
		
	}
	
	private class Inserimento implements ActionListener {
		
		Prodotti f; //Reference all'oggetto condiviso
		
		public Inserimento(Prodotti prodotti) {
			this.f = prodotti;
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {

			try {
				String var1= casellaTesto1.getText();
				String var2= casellaTesto2.getText();
				
				calcolaValori(var1, var2);
			} catch (NumberFormatException e1) { 
				result1.setText("Errore nell'inserimento dei valori");
				
			}
		}
		
		/*
		 * Metodo che calcola i risultati
		 */
		public void calcolaValori(String var1, String var2) {
			float prodvett[]= new float[3];
			
			float vetta[] = new float [3]; 
			float vettb[] = new float [3]; 
			
			String Aa[]=var1.split(";");
			for(int i=0; i<Aa.length; i++) {
				vetta [i]= Float.parseFloat(Aa[i]);
			}
			
			String Ab[]=var2.split(";");
			for(int i=0; i<Ab.length; i++) {
				vettb [i]= Float.parseFloat(Ab[i]);
			}
			
			float prodscal = vetta[0]*vettb[0]+ vetta[1]*vettb[1]+ vetta[2]*vettb[2];
			result1.setText("Prodotto scalare: "+prodscal);
			
			prodvett[0]= vetta[1]*vettb[2]-vetta[2]*vettb[1];
			prodvett[1]= -(vetta[0]*vettb[2]-vetta[2]*vettb[0]);
			prodvett[2]= vetta[0]*vettb[1]-vetta[1]*vettb[0];
			result2.setText("Prodotto vettoriale: "+prodvett[0]+"i + "+prodvett[1]+"j + "+prodvett[2]+"k ");
			
			float norma= (float) Math.sqrt(prodvett[0]*prodvett[0]+ prodvett[1]*prodvett[1]+ prodvett[2]*prodvett[2]);
			result3.setText("Area del parallelogrammo: "+norma);
		}
		
	}
	
	/*
	 * Main del programma
	 */
	public static void main(String[] args) {
		new Prodotti();
	}
}