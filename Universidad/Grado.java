/**
 * @ (#) Grado.java
 * 
 * En esta clase Grado recogemos los atributos requeridos y establecemos los metodos
 * get para devolver y set para modificar, cada uno de dichos atributos.
 * En este caso, desarrollamos un unico metodo para listar informacion de un ArrayList.
 *
 * @author Yassine Marroun
 * @version 1.00 2017/03/04
 */

import java.util.ArrayList;
import java.util.Iterator;

public class Grado {
	
	private String nombre;
	private ArrayList<Asignatura> asignaturas;

	public Grado (String nombre) {
	
		this.nombre = nombre;
		this.asignaturas = new ArrayList<Asignatura>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Asignatura> getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(ArrayList<Asignatura> asignaturas) {
		this.asignaturas = asignaturas;
	}
	
	// Metodo para listar la informacion de las asignaturas mediante la estructura ITERATOR.
	
	public void listarAsignaturasIterator() {
		System.out.println("***** Listado con Iterator del grado de " + nombre + " *****");
		Iterator<Asignatura> iterador = asignaturas.iterator();
		while (iterador.hasNext()){
			Asignatura elemento = iterador.next();
			System.out.println(elemento);
		}
		System.out.println("**************************************************************\n");
	}
	
	// Metodo para apuntar cada asignatura en el grado correspondiente.
	
	public void apuntarAsignatura(Asignatura asignatura) {
				 
		this.asignaturas.add(asignatura);		
	}
			
}