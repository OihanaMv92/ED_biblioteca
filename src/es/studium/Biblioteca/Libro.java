package es.studium.Biblioteca;

public class Libro
{

//Objeto Autor
	private String titulo;
	private Autor autor;
	private int anio;
	private String editorial;
	private int numeropag;

	// Se representa New Autor. ( Asi crea el autor.)
	public Libro() {
		titulo = " ";
		autor= new Autor();
		anio =0;
		editorial=" ";
		numeropag=0;

	}
	

	
	public Libro (String t, Autor a, int an, String e, int n) {
		titulo = t;
		this.autor = a;
		this.anio =an;
		this.editorial=e;
		this.numeropag=n;

	}



	/**
	 * @return the titulo
	 */
	public String getTitulo()
	{
		return titulo;
	}



	/**
	 * @return the autor
	 */
	public Autor getAutor()
	{
		return autor;
	}



	/**
	 * @return the anio
	 */
	public int getAnio()
	{
		return anio;
	}



	/**
	 * @return the editorial
	 */
	public String getEditorial()
	{
		return editorial;
	}



	/**
	 * @return the numeropag
	 */
	public int getNumeropag()
	{
		return numeropag;
	}



	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo)
	{
		this.titulo = titulo;
	}



	/**
	 * @param autor the autor to set
	 */
	public void setAutor(Autor autor)
	{
		this.autor = autor;
	}



	/**
	 * @param anio the anio to set
	 */
	public void setAnio(int anio)
	{
		this.anio = anio;
	}



	/**
	 * @param editorial the editorial to set
	 */
	public void setEditorial(String editorial)
	{
		this.editorial = editorial;
	}



	/**
	 * @param numeropag the numeropag to set
	 */
	public void setNumeropag(int numeropag)
	{
		this.numeropag = numeropag;
	}


	
	
}