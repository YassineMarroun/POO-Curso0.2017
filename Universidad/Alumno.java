/**
 * @ (#) Alumno.java
 * 
 * En esta clase Alumno recogemos los atributos requeridos y establecemos los metodos
 * get para devolver y set para modificar, cada uno de dichos atributos.
 *
 * @author Yassine Marroun
 * @version 1.00 2017/03/04
 */

public class Alumno {
	
	private String nombre;
	private String apellidos;
	private int telefonoContacto;
	private String direccion;

	public Alumno (String nombre, String apellidos, int telefonoContacto, String direccion) {
	
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefonoContacto = telefonoContacto;
		this.direccion = direccion;
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

	public int getTelefonoContacto() {
        return telefonoContacto;
	}
	
	public void setTelefonoContacto(int telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
	}
	
	public String getDireccion() {
        return direccion;
	}

	public void setDireccion(String direccion) {
        this.direccion = direccion;
	}
	
	// Metodo para mostrar en pantalla la informacion de un alumno concreto.
	
	public void mostrarInfoAlumno() {
		
		System.out.println("******************** Alumno *************************");
		System.out.println ("Nombre: " + nombre);
        System.out.println ("Apellidos: " + apellidos);
        System.out.println ("Telefono de Contacto: " + telefonoContacto);
        System.out.println ("Direccion: " + direccion);
        System.out.println("*****************************************************\n");
	}
	
	// Metodo para visualizar los datos de la clase Alumno que recogeremos en el ArrayList<Alumno>.
	// Sera usado por las estructuras para listar informacion: iterator, for y for-each,
	// y a su vez cuando se realice la llamada en Lanzador para mostrar la informacion de un Grado.
	
	@Override
	public String toString() {
		
		String datosAlumno = nombre + " " + apellidos + " - " + telefonoContacto + " - " + direccion;
		return datosAlumno;
	}
}