package seance1;

public class Doctorant extends Etudiant{

	public Doctorant()
	{
		//super();  // appel au constructeur parent par d�faut
		super("Amine"); //appel au constructeur avec param�tre de la classe m�re
		System.out.println("Doctorant");
	}
}
