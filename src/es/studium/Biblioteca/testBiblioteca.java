package es.studium.Biblioteca;



public class testBiblioteca
{

	public static void main(String[] args)
	{
		
		// creando autores y dentro sus atributos
		Autor a1 = new Autor ("Julian", "Perez", "Español");
		Autor a2 = new Autor ("Loreto", "Jesusa", "Francesa");
		Autor a3 = new Autor ("Julian", "Perez", "Español");
		
		Libro l1 = new Libro ("Tarzan", a1, 2010, "EditorialSub", 75);
		Libro l2 = new Libro ("Cenicienta", a2, 2000, "Lagarto", 100);
		Libro l3 = new Libro ("Blanca nieves", a3, 1992, "Disney", 160);
		
		System.out.println(l1.getTitulo() + " Tiene " + l1.getNumeropag() + ".");
		System.out.println(l2.getTitulo() + " Tiene " + l2.getNumeropag() + ".");
		System.out.println(l3.getTitulo() + " Tiene " + l3.getNumeropag() + ".");
		
		System.out.println("\n" + l1.getTitulo() + " Tiene " + l1.getNumeropag() + " y el nombre y el apellido");
		
	}

}
