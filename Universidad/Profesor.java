/**
 * @ (#) Profesor.java
 * 
 * En esta clase Profesor recogemos los atributos requeridos y establecemos los metodos
 * get para devolver y set para modificar, cada uno de dichos atributos.
 *
 * @author Yassine Marroun
 * @version 1.00 2017/03/04
 */

public class Profesor {
	
	private String nombre;
	private String apellidos;
	private int dni;

	public Profesor (String nombre, String apellidos, int dni) {
	
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
	}
	
	public String getNombre() {
        return nombre;
	}

	public void setNombre(String nombre) {
        this.nombre = nombre;
	}
	
	public String getApellidos() {
        return apellidos;
	}
	
	public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
	}

	public int getDni() {
        return dni;
	}
	
	public void setDni(int dni) {
        this.dni = dni;
	}
	
	// Metodo para mostrar en pantalla la informacion de un profesor concreto.
	
	public void mostrarInfoProfesor() {
		
		System.out.println("******************** Profesor ***********************");
		System.out.println ("Nombre: " + nombre);
        System.out.println ("Apellidos: " + apellidos);
        System.out.println ("dni: " + dni);
        System.out.println("*****************************************************\n");
	}
	
	// Metodo para visualizar los datos de la clase Profesor cuando se realice la llamada en Lanzador
	// para mostrar la informacion de un Grado.
	
	@Override
	public String toString() {
		
		String datosProfesor = nombre + " " + apellidos + " - " + dni;
		return datosProfesor;
	}
}