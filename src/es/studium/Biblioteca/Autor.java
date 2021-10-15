package es.studium.Biblioteca;

public class Autor
{
	/* atributos  */
	private String nombre;
	private String apellidos;
	private String nacionalidad;
	/* constructores */

	//constructores por defecto

	public Autor() {
		nombre = " ";
		apellidos = " ";
		nacionalidad=" ";


	}

	//constructor con parametros

	public Autor (String t, String a, String n) {
		nombre = t;
		apellidos = a;
		nacionalidad =n;

		}

	/**
	 * @return the nombre
	 */
	public String getNombre()
	{
		return nombre;
	}

	/**
	 * @return the apellidos
	 */
	public String getApellidos()
	{
		return apellidos;
	}

	/**
	 * @return the nacionalidad
	 */
	public String getNacionalidad()
	{
		return nacionalidad;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos)
	{
		this.apellidos = apellidos;
	}

	/**
	 * @param nacionalidad the nacionalidad to set
	 */
	public void setNacionalidad(String nacionalidad)
	{
		this.nacionalidad = nacionalidad;
	}
	
	}

