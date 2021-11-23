import java.util.Scanner;

public class Det {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		String parola;
		float vetta[] = new float [3]; 
		float vettb[] = new float [3]; 
		float vettc[] = new float [3]; 
		
		do {
			
			System.out.println("N.B: Inserire i vettori separati da un ;");
			System.out.println(" ");

			System.out.println("Inserisci il primo vettore: ");
			String a=sc.nextLine();
			String Aa[]= a.split(";");
			for(int i=0; i<Aa.length; i++) {
				vetta [i]= Float.parseFloat(Aa[i]);
			}
				
			System.out.println("Inserisci il secondo vettore: ");
			String b= sc.nextLine();
			String Ab[]= b.split(";");
			for(int i=0; i<Ab.length; i++) {
				vettb[i]= Float.parseFloat(Ab[i]);
			}

			System.out.println("Inserisci il terzo vettore: ");
			String c= sc.nextLine();	
			String Ac[]= c.split(";");
			for(int i=0; i<Ac.length; i++) {
				vettc[i]= Float.parseFloat(Ac[i]);
			}
			
			float det= vetta[0]*(vettb[1]*vettc[2]-vettb[2]*vettc[1]) -vetta[1]*(vettb[0]*vettc[2]-vettb[2]*vettc[0]) +vetta[2]*(vettb[0]*vettc[1]-vettb[1]*vettc[0]);
			
			System.out.println("Il determinante è: "+det);
			
			if(det==0)
				System.out.println("Il rango è 2");
			else
				System.out.println("Il rango è 3");

			do {
				System.out.println("Vuoi continuare? S/N");
				parola=sc.nextLine();
			}while(!parola.equalsIgnoreCase("N") && !parola.equalsIgnoreCase("S"));
			
		}while(parola.equalsIgnoreCase("S"));
		System.out.println("----------------------------------------------------");
	}

}
