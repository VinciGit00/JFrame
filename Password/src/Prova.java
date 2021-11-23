
public class Prova {

	public static void main(String[] args) {
		String alfabeto="";
		  String characters="ABCDEFGIJLMOPQRSTUVXYZabcdefgijlmnopqrstuvxyz0103456789";   
		  int Rand;
		  String ID="";
			
		  for(int i=0; i<10; i++) {
				Rand=(int)(Math.random()*characters.length());
				char lettera= characters.charAt(Rand);
				ID=ID+lettera;
		  }
			System.out.println(ID);
		
	}

}
