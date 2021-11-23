import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class rettaPer2Punti implements ActionListener{
		/*
		 * Primo punto
		 */
		private static JLabel l1x; 
		private static JLabel l1y; 
		private static JTextField insl1x;
		private static JTextField insl1y;
		
		/*
		 * Secondo punto
		 */
		private static JLabel l2x; 
		private static JLabel l2y; 
		private static JTextField insl2x;
		private static JTextField insl2y;
		
		/*
		 * Stuff
		 */
		private static JLabel scritta; 
		private static JButton button;
		private static JLabel result;
	
		public static void main(String[] args) {
			JPanel panel = new JPanel();
			JFrame frame = new JFrame();
			frame.setSize(350, 300);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.add(panel);
			panel.setLayout(null);
		
			ImageIcon icona= new ImageIcon("img/bender.png");
			frame.setIconImage(icona.getImage());
		
			scritta= new JLabel("Retta passante per due punti");
			scritta.setBounds(10, 20, 200, 25);
			panel.add(scritta);
			
			/*
			 * Inserimenti
			 */
			//Punto 1
			l1x= new JLabel("x del punto 1: ");
			l1x.setBounds(10, 50, 100, 25);
			panel.add(l1x);
			
			insl1x= new JTextField(20);
			insl1x.setBounds(110, 50, 165, 25);
			panel.add(insl1x);
			
			l1y= new JLabel("y del punto 1: ");
			l1y.setBounds(10, 80, 100, 25);
			panel.add(l1y);
			
			insl1y= new JTextField(20);
			insl1y.setBounds(110, 80, 165, 25);
			panel.add(insl1y);
			
			//Punto 2
			l2x= new JLabel("x del punto 2: ");
			l2x.setBounds(10, 130, 100, 25);
			panel.add(l2x);
			
			insl2x= new JTextField(20);
			insl2x.setBounds(110, 130, 165, 25);
			panel.add(insl2x);
			
			l2y= new JLabel("y del punto 2: ");
			l2y.setBounds(10, 160, 100, 25);
			panel.add(l2y);
			
			insl2y= new JTextField(20);
			insl2y.setBounds(110, 160, 165, 25);
			panel.add(insl2y);
			
			/*
			 * Bottone del programma
			 */
			button= new JButton("Calcola");
			button.setBounds(125, 190, 80, 25);
			button.addActionListener(new rettaPer2Punti());
			panel.add(button);
			
			result= new JLabel();
			result.setBounds(10, 220, 300, 25);
			panel.add(result);
			
			frame.setVisible(true);
	}

		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				float x1=Float.parseFloat(insl1x.getText());
				float y1=Float.parseFloat(insl1y.getText());
				
				float x2=Float.parseFloat(insl2x.getText());
				float y2=Float.parseFloat(insl2y.getText());
				
				float m=(y2-y1)/(x2-x1);
				float tnoto=y1-m*x1;
				
				result.setText("y= "+m+"x + "+tnoto);
			} catch (NumberFormatException e2) {
				result.setText("Inserimento non corretto");
			}
			
		}
}
