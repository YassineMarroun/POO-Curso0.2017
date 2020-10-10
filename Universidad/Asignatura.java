/**
 * @ (#) Asignatura.java
 * 
 * En esta clase Asignatura recogemos los atributos requeridos y establecemos los metodos
 * get para devolver y set para modificar, cada uno de dichos atributos.
 * Tambien desarrollamos diferentes metodos para poder listar y eliminar informacion de un ArrayList.
 *
 * @author Yassine Marroun
 * @version 1.00 2017/03/04
 */

import java.util.ArrayList;
import java.util.Iterator;

public class Asignatura {
	
	private String nombre;
	private int creditos;
	private Profesor profesor;
	private ArrayList<Alumno> alumnos;

	public Asignatura (String nombre, int creditos, Profesor profesor) {
	
		this.nombre = nombre;
		this.creditos = creditos;
		this.profesor = profesor;
		this.alumnos = new ArrayList<Alumno>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCreditos() {
		return creditos;
	}

	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public ArrayList<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(ArrayList<Alumno> alumnos) {
		this.alumnos = alumnos;
	}
	
	// Metodo para listar la informacion de los alumnos mediante la estructura ITERATOR.
	
	public void listarAlumnosIterator() {
	
	Alumno elemento;
	
		System.out.println("******************* Listado con Iterator *******************");
		Iterator<Alumno> iterador = alumnos.iterator();
		while (iterador.hasNext()){
			elemento = iterador.next();
			System.out.println(elemento.toString());
		}
		System.out.println("************************************************************\n");
	}	
	
	// Metodo para listar la informacion de los alumnos mediante la estructura FOR.
	
	public void listarAlumnosFor() {
	
	Alumno elemento;
	
		System.out.println("******************* Listado con For ************************");
		for(int i = 0; i < alumnos.size(); i++) {
			elemento = alumnos.get(i);
			System.out.println(elemento.toString());        
		}
		System.out.println("************************************************************\n");
	}
	
	// Metodo para listar la informacion de los alumnos mediante la estructura FOR-EACH.
	
	public void listarAlumnosForEach() {
		
		System.out.println("******************* Listado con For Each *******************");
		for (Alumno elemento: alumnos) {
		System.out.println(elemento.toString());
		}
		System.out.println("************************************************************\n");
	}
	
	// Metodo para eliminar alumnos del ArrayList<Alumno> mediante la estructura FOR.
	
	public void eliminarAlumno(int telefonoContacto) {
	
		System.out.println("************ Listado tras eliminar un alumno ***************");
		for(int i = 0; i < alumnos.size(); i++) {
			if (alumnos.get(i).getTelefonoContacto() == telefonoContacto) {
				alumnos.remove(i);
			}
		}
	}
	
	// Metodo para apuntar a cada alumno en cada asignatura a la que este matriculado.
	
	public void apuntarAlumno(Alumno alumno) {
			 
		this.alumnos.add(alumno);		
	}
	
	// Metodo para visualizar los datos de la clase Asignatura que recogeremos en el ArrayList<Asignatura>
	// cuando se realice la llamada en Lanzador para mostrar la informacion de un Grado.
	
	@Override
	public String toString() {
		
		String datosAsignatura = nombre + " - " + creditos + " - " + profesor + " - " + alumnos;
		return datosAsignatura;
	}
}	