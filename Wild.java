package wild;

public class Wild {
	
// Creation de la méthode main
	public static void main(String[] args) {

// Instanciation d'un objet Wilder breton avec en paramètre le nom, prenom et age		
Wilder breton = new Wilder("Galette", "Saucisse", 33);

//Application de la méthode sayHello à l'objet breton
breton.sayHello();


//Instanciation d'un objet Wilder amnésique, utilisant les paramètres par défaut		
Wilder amnesique = new Wilder();

//Application de la méthode sayHello à l'objet inconnu
amnesique.sayHello();
	}

}
