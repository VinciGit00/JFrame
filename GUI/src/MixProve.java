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

import javafx.scene.image.Image;

public class MixProve extends JFrame {
	
	JPanel pan; //Inserimento
	
	JScrollPane scrPane; //Scorrimento del progetto nel pannello 1
	
	JTextField casellaTesto1;
	JTextField casellaTesto2;
	JTextField casellaTesto3;
	JTextField casellaTesto4;
	JTextField casellaTesto5;
	JTextField casellaTesto6;
	JTextField casellaTesto7;
	JTextField casellaTesto8;
	JTextField casellaTesto9;
	JTextField casellaTesto10;
	JTextField casellaTesto11;
	JTextField casellaTesto12;
	JTextField casellaTesto13;
	JTextField casellaTesto14;
	JTextField casellaTesto15;
	JTextField casellaTesto16;
	JTextField casellaTesto17;
	JTextField casellaTesto18;
	JTextField casellaTesto19;
	JTextField casellaTesto20;
	
	JLabel scritta;
	JLabel result1;
	JLabel result2;
	JLabel result3;
	JLabel result4;
	JLabel result5;
	JLabel result6;
	JLabel result7;
	JLabel result8;
	JLabel result9;
	JLabel result10;
	JLabel result11;
	JLabel result12;
	JLabel result13;
	JLabel result14;
	JLabel result15;
	JLabel result16;
	JLabel result17;
	JLabel result18;
	JLabel result19;
	JLabel result20;
	
	public MixProve() {
		super("Swiss medical clinique®");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pan= new JPanel();
		scrPane= new JScrollPane(pan);
		scrPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		add(scrPane);
			
		/*
		 * Istanziamento delle caselle di testo
		 */
		casellaTesto1= new JTextField(); 
		casellaTesto2= new JTextField();
		casellaTesto3= new JTextField();
		casellaTesto4= new JTextField();
		casellaTesto5= new JTextField();
		casellaTesto6= new JTextField();
		casellaTesto7= new JTextField();
		casellaTesto8= new JTextField();
		casellaTesto9= new JTextField();
		casellaTesto10= new JTextField();
		casellaTesto11= new JTextField();
		casellaTesto12= new JTextField();
		casellaTesto13= new JTextField();
		casellaTesto14= new JTextField();
		casellaTesto15= new JTextField();
		casellaTesto16= new JTextField();
		casellaTesto17= new JTextField();
		casellaTesto18= new JTextField();
		casellaTesto19= new JTextField();
		casellaTesto20= new JTextField();
		
		/*
		 * Istanziamento dei label 
		 */
		scritta= new JLabel();
		result1= new JLabel();
		result2= new JLabel();
		result3= new JLabel();
		result4= new JLabel();
		result5= new JLabel();
		result6= new JLabel();
		result7= new JLabel();
		result8= new JLabel();
		result9= new JLabel();
		result10= new JLabel();
		result11= new JLabel();
		result12= new JLabel();
		result13= new JLabel();
		result14= new JLabel();
		result15= new JLabel();
		result16= new JLabel();
		result17= new JLabel();
		result18= new JLabel();
		result19= new JLabel();
		result20= new JLabel();
		
		/*
		 * Settaggi del pannello 1
		 */
		ImageIcon icona= new ImageIcon("img/im.png");
		setIconImage(icona.getImage());
		
		JButton bottone= new JButton("Esegui"); //Bottone del pannello 1
		bottone.addActionListener(new Inserimento(this));	//aggiungiamo l'ActionListener al bottone
		pan.setLayout(new GridLayout(103,1)); //righe e colonne
        pan.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
		
		/*
		 * Lista dei dati da analizzare
		 */
		pan.add(new JLabel("1-Elastasi pancreatica"));
		pan.add(casellaTesto1);
		
		pan.add(new JLabel("2-Calprotectina"));
		pan.add(casellaTesto2);
		
		pan.add(new JLabel("3-Zonolina"));
		pan.add(casellaTesto3);
		
		pan.add(new JLabel("4-pH"));
		pan.add(casellaTesto4);
		
		pan.add(new JLabel("5-Numero di specie"));
		pan.add(casellaTesto5);
		
		pan.add(new JLabel("6-Biodiversità "));
		pan.add(casellaTesto6);
		
		pan.add(new JLabel("7-Enterotipo"));
		pan.add(casellaTesto7);
		
		pan.add(new JLabel("8-Philum bacteroidetes"));
		pan.add(casellaTesto8);
		
		pan.add(new JLabel("9-Philum firmicutes"));
		pan.add(casellaTesto9);
		
		pan.add(new JLabel("10-Enterococcus"));
		pan.add(casellaTesto10);
		
		pan.add(new JLabel("11-Lactobacillus"));
		pan.add(casellaTesto11);
		
		pan.add(new JLabel("12-Lactococcus"));
		pan.add(casellaTesto12);
		
		pan.add(new JLabel("13-Leuconostoc"));
		pan.add(casellaTesto13);
		
		pan.add(new JLabel("14-Pediococcus"));
		pan.add(casellaTesto14);
		
		pan.add(new JLabel("15-Streptococcus"));
		pan.add(casellaTesto15);
		
		pan.add(new JLabel("16-Campylobacter"));
		pan.add(casellaTesto16);
		
		pan.add(new JLabel("17-Citrobacter"));
		pan.add(casellaTesto17);
		
		pan.add(new JLabel("18-Enterobacter"));
		pan.add(casellaTesto18);
		
		pan.add(new JLabel("19-Escherichia"));
		pan.add(casellaTesto19);
		
		pan.add(new JLabel("20-Klebsiella"));
		pan.add(casellaTesto20);
		
		pan.add(bottone);
		
		pan.add(scritta);
		pan.add(result1);
		pan.add(result2);
		pan.add(result3);
		pan.add(result4);
		pan.add(result5);
		pan.add(result6);
		pan.add(result7);
		pan.add(result8);
		pan.add(result9);
		pan.add(result10);
		pan.add(result11);
		pan.add(result12);
		pan.add(result13);
		pan.add(result14);
		pan.add(result15);
		pan.add(result16);
		pan.add(result17);
		pan.add(result18);
		pan.add(result19);
		pan.add(result20);
		
		pack();
		setVisible(true);
		
	}
	
	private class Inserimento implements ActionListener {
		
		/*
		 * Parole chiave da inserire nei risultati
		 */
		private static final String sopra=" sopra il valore di riferimento ";
		private static final String sotto=" sotto il valore di riferimento ";
		private static final String uguale=" uguale al valore di riferimento ";
		private static final String target=" target ";
		private static final String dentroIlRange=" dentro il range ";
		private static final String soprailRange=" sopra il range ";
		private static final String sottoilRange=" sotto il range ";
		
		MixProve f; //Reference all'oggetto condiviso
		
		public Inserimento(MixProve f) {
			this.f = f;
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {

			try {
				float var1= Float.parseFloat(casellaTesto1.getText());
				float var2= Float.parseFloat(casellaTesto2.getText());
				float var3= Float.parseFloat(casellaTesto3.getText());
				float var4= Float.parseFloat(casellaTesto4.getText());		
				float var5= Float.parseFloat(casellaTesto5.getText());
				float var6= Float.parseFloat(casellaTesto6.getText());
				float var7= Float.parseFloat(casellaTesto7.getText());
				float var8= Float.parseFloat(casellaTesto8.getText());
				float var9= Float.parseFloat(casellaTesto9.getText());
				float var10= Float.parseFloat(casellaTesto10.getText());
				float var11= Float.parseFloat(casellaTesto11.getText());
				float var12= Float.parseFloat(casellaTesto12.getText());
				float var13= Float.parseFloat(casellaTesto13.getText());
				float var14= Float.parseFloat(casellaTesto14.getText());
				float var15= Float.parseFloat(casellaTesto15.getText());
				float var16= Float.parseFloat(casellaTesto16.getText());
				float var17= Float.parseFloat(casellaTesto17.getText());
				float var18= Float.parseFloat(casellaTesto18.getText());
				float var19= Float.parseFloat(casellaTesto19.getText());
				float var20= Float.parseFloat(casellaTesto20.getText());
				
				calcolaValori(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20);
			} catch (NumberFormatException e1) { //Caso in cui ci sia un errore nell'inserimento dei dati
				/*
				 * Dove lo scrivo?-> lancio il pannello pan3
				 */
				scritta.setText("Hai sbagliato a inserire dei valori");
				
			}
		}
		
		/*
		 * Metodo che calcola i risultati
		 */
		public void calcolaValori(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11,
				float var12, float var13, float var14, float var15, float var16, float var17, float var18, float var19, float var20) {
			
		}
		
	}
	
	/*
	 * Main del programma
	 */
	public static void main(String[] args) {
		new MixProve();
	}
}