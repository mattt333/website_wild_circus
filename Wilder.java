package wild;


//Création de la classe Wilder
public class Wilder {

//Création des variables d'instance la classe Wilder : prenom, nom,age
	String prenom;
	String nom;
	int age;
	public void sayHello() {
	System.out.println("Bonjour, je m'appelle "+prenom+" "+nom);
	}	

	
// Création du constructeur par défaut	
public Wilder () {
		prenom = "inconnu";
		nom = "inconnu";
		age = 0;
}

//Création du constructeur avec paramètre	
public Wilder(String pPrenom, String pNom, int pAge)	{
	prenom = pPrenom;
	nom = pNom;
	age = pAge;
	}


		
}
