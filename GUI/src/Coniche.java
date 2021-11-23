import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Coniche implements ActionListener {
	
	private static JLabel l1;
	private static JLabel l2;
	private static JLabel l3;

	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	
	private static JLabel result;
	private static JButton button;
	
	public static void main(String[] args) {
		JPanel panel= new JPanel();
		JFrame frame= new JFrame();
		frame.setSize(400, 350);
		frame.add(panel);
		frame.setLayout(null);
		
		l1= new JLabel("Inserisci il valore della X");
		l1.setBounds(10, 20, 200, 25);
		frame.add(l1);
		
		t1= new JTextField(20);
		t1.setBounds(210, 20, 165, 25);
		frame.add(t1);
		
		l2= new JLabel("Inserisci il valore della Y");
		l2.setBounds(10, 50, 200, 25);
		frame.add(l2);

		t2= new JTextField(20);
		t2.setBounds(210, 50, 165, 25);
		frame.add(t2);
		
		l3= new JLabel("Inserisci il termine noto");
		l3.setBounds(10, 80, 200, 25);
		frame.add(l3);

		t3= new JTextField(20);
		t3.setBounds(210, 80, 165, 25);
		frame.add(t3);
		
		button= new JButton("Calcola");
		button.setBounds(140, 120, 80, 25);
		button.addActionListener(new Coniche());
		frame.add(button);
		
		result= new JLabel();
		result.setBounds(10, 150, 300, 25);
		frame.add(result);
		
		frame.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			float val1= Float.parseFloat(t1.getText());
			float val2= Float.parseFloat(t2.getText());
			float tnoto= Float.parseFloat(t3.getText());
			
			if(tnoto!=0) {
				val1=val1/tnoto;
				val2=val2/tnoto;
			}

			if(val1>0 && val2>0) {
				result.setText("Ellisse");
			} else if(val1>0 && val2<0) {
				result.setText("Iperbole");
			} else if(val1<0 && val2<0)  {
				result.setText("Ellisse immaginaria");
			} else if(val1>0 && val2>0 && tnoto==0) {
				result.setText("Due rette immaginarie");
			} else if (val1>0 && val2<0 && tnoto==0) {
				result.setText("Due rette incidenti");
			}
		} catch (NumberFormatException e1) {
			result.setText("Errore di inserimento");
		}
		
	}
}
