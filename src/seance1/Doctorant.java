package seance1;

public class Doctorant extends Etudiant{

	public Doctorant()
	{
		//super();  // appel au constructeur parent par défaut
		super("Amine"); //appel au constructeur avec paramètre de la classe mère
		System.out.println("Doctorant");
	}
}
