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


public class Beta extends JFrame {
	
	JPanel pan; //Inserimento
	
	JScrollPane scrPane; //Scorrimento del progetto nel pannello 1
	
	JTextField casellaTesto1;
	JTextField casellaTesto2;
	JTextField casellaTesto3;
	
	JLabel result1;
	JLabel result2;
	
	public Beta() {
		super("Rango di una matrice 3X3");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pan= new JPanel();
		scrPane= new JScrollPane(pan);
		scrPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		add(scrPane);
			
		casellaTesto1= new JTextField(); 
		casellaTesto2= new JTextField();
		casellaTesto3= new JTextField();
		
		result1= new JLabel();
		result2= new JLabel();
		
		ImageIcon icona= new ImageIcon("img/im.png");
		setIconImage(icona.getImage());
		
		JButton bottone= new JButton("Esegui"); 
		bottone.addActionListener(new Inserimento(this));	
		pan.setLayout(new GridLayout(15,2)); 
        pan.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
		
		/*
		 * Lista dei dati da analizzare
		 */
        pan.add(new JLabel("Inserire i due vettori con cordinate separate da un ;"));
       
		pan.add(new JLabel("Vettore 1: "));
		pan.add(casellaTesto1);
		
		pan.add(new JLabel("Vettore 2: "));
		pan.add(casellaTesto2);		
		
		pan.add(new JLabel("Vettore 3: "));
		pan.add(casellaTesto3);

		pan.add(new JLabel(" "));
		
		pan.add(bottone);
		
		
		pan.add(result1);
		pan.add(result2);
		
		pack();
		setVisible(true);
		
	}
	
	private class Inserimento implements ActionListener {
		
		Beta f; //Reference all'oggetto condiviso
		
		public Inserimento(Beta f) {
			this.f = f;
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {

			try {
				String var1= casellaTesto1.getText();
				String var2= casellaTesto2.getText();
				String var3= casellaTesto3.getText();
				
				calcolaValori(var1, var2, var3);
			} catch (NumberFormatException e1) { 
				result1.setText("Errore nell'inserimento dei valori");
				
			}
		}
		
		/*
		 * Metodo che calcola i risultati
		 */
		public void calcolaValori(String var1, String var2, String var3) {
			float vetta[] = new float [3]; 
			float vettb[] = new float [3]; 
			float vettc[] = new float [3]; 
			
			String Aa[]=var1.split(";");
			for(int i=0; i<Aa.length; i++) {
				vetta [i]= Float.parseFloat(Aa[i]);
			}
			
			String Ab[]=var2.split(";");
			for(int i=0; i<Ab.length; i++) {
				vettb [i]= Float.parseFloat(Ab[i]);
			}
			
			String Ac[]=var3.split(";");
			for(int i=0; i<Ac.length; i++) {
				vettc [i]= Float.parseFloat(Ac[i]);
			}

			float det= vetta[0]*(vettb[1]*vettc[2]-vettb[2]*vettc[1]) -vetta[1]*(vettb[0]*vettc[2]-vettb[2]*vettc[0]) +vetta[2]*(vettb[0]*vettc[1]-vettb[1]*vettc[0]);

			result1.setText("Il determinante della matrice 3x3 è: "+det);
			
			if(det!=0)
				result2.setText("La caratteristica del sottospazio vettoriale è 3, i tre vettori formano una base");
			else {
				float det0, det1, det2, det3;
				det0= vetta[0]*vettb[1] - vetta[1]*vettb[0];
				det1= vetta[0]*vettb[2] - vetta[2]*vettb[0];
				det2= vetta[0]*vettc[1] - vetta[1]*vettc[0];
				det3= vetta[0]*vettc[2] - vetta[2]*vettc[0];
				
				if(det0==0 && det1==0 && det2==0 && det3==0) {
					result2.setText("Rango della matrice: 1");
				} else
					result2.setText("Rango della matrice: 2");
			}
			
		}
		
	}
	
	/*
	 * Main del programma
	 */
	public static void main(String[] args) {
		new Beta();
	}
}