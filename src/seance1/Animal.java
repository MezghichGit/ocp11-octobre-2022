package seance1;

import java.time.LocalDate; //java 8
//import java.lang.String;
public class Animal {

	// des attributs d'instance
	String espece;
	double poids;
	String nom;
	int age;
	LocalDate naissance;

	// des attributs de classes

	static int nbr;

	// Constructeurs
	Animal() // constructeur par d�faut
	{
		System.out.println("Cr�ation d'un Animal - Cons. par defaut");
	}

	public Animal(String espece) {
		this.espece = espece;
		System.out.println("Cr�ation d'un Animal - Cons. avec param�tre espece");
	}

	// m�thodes d'instance

	public void info() {
		System.out.println(nbr); // attribut static
		System.out.println("Animal : Espece = " + this.espece);
	}

	// m�thode de classe

	public static void getNbreAnimals() {
		System.out.println(nbr);
		//System.out.println(age);  // erreur de compilation
		/*Animal a = new Animal();
		a.age = 2;*/
	}

	// bloc d'initialisatiuon d'instance
	{
		System.out.println("Bloc d'instance 1");
	}

	// bloc d'initialisatiuon de classe
	static {
		//System.out.println(age);
		System.out.println("Bloc de classe 1");
	}
	
	// bloc d'initialisatiuon d'instance
	{
		System.out.println(nbr);
		System.out.println("Bloc d'instance 2");
	}

}
