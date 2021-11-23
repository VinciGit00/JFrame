
public class Prova2 {

	public static int n=10;
	
	public static void main(String[] args) {
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

	}
}
