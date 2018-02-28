package concordion.example;

public class SSystem {
	public String getGreeting(String userName){
	      return "Hello " + userName + "!";
	   }
	public int somme (int firstNumber, int secondNumber){
		return firstNumber + secondNumber;
	}
	
	public int soustraction (int firstNumber, int secondNumber){
		return firstNumber - secondNumber;
	}
	
	public Resultat split(String userName){
		Resultat resultat = new Resultat();
		String[] noms = userName.split(" ");
		resultat.setFirstName(noms[0]);
		resultat.setLastName(noms[1]);
		return resultat;
	}
}
