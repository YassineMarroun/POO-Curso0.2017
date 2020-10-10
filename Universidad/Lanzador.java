/**
 * @ (#) Lanzador.java
 * 
 * En esta clase principal Lanzador creamos varios objetos de las diferentes clases
 * y realizamos la llamada a los metodos necesarios para mostrar en pantalla la informacion.
 *
 * @author Yassine Marroun
 * @version 1.00 2017/03/04
 */

public class Lanzador {
 
    public static void main(String[] args) {
    	 
    	// Creamos una serie de objetos Alumno, Profesor, Asignatura y Grado con sus atributos correspodientes. En este caso,
    	// no van incluidos los dos ArrayList de Alumno y Asignatura porque he creado una funcion para poder distribuir
    	// a los alumnos en las asignaturas que se matriculen, y a su vez, las asignaturas en el grado al que pertenecen.
    	
    	Alumno alumno1 = new Alumno ("Jose Maria", "Sanz", 123456789, "Avenida de la Luz");
        Alumno alumno2 = new Alumno("Daniel", "Garrido", 625483275, "Calle Pio Baroja, 8. Salamanca.");
        Alumno alumno3 = new Alumno("Jorge", "Diaz", 610471972, "Calle Libertad, 16. Barcelona.");
        Alumno alumno4 = new Alumno("Victor", "Ferran", 623785926, "Calle Illescas, 24. Santiago.");
        
        
        Profesor profesor1 = new Profesor ("Miguel", "Garcia", 784512);
        Profesor profesor2 = new Profesor ("Fernando", "Morales", 685347);
        Profesor profesor3 = new Profesor ("Jose Luis", "Villa", 824123);
        Profesor profesor4 = new Profesor ("Pedro", "Gomez", 475128);
        Profesor profesor5 = new Profesor ("Adrian", "Perez", 624726);
        Profesor profesor6 = new Profesor ("Lucas", "Herranz", 872412);
        
        
        Asignatura asignatura1 = new Asignatura ("Matematicas", 6, profesor1);
        Asignatura asignatura2 = new Asignatura ("Programacion", 6, profesor2);
        Asignatura asignatura3 = new Asignatura ("Sistemas Digitales", 6, profesor3);
        Asignatura asignatura4 = new Asignatura ("Quimica", 6, profesor4);
        Asignatura asignatura5 = new Asignatura ("Algebra", 6, profesor5);
        Asignatura asignatura6 = new Asignatura ("Biologia", 6, profesor6);
        
        
        Grado grado1 = new Grado ("Informatica");
        Grado grado2 = new Grado ("Ciencias Fisicas");
        
        
        // Para cada objeto de Asignatura realizamos la llamada al metodo apuntarAlumno
        // y ubicamos a cada alumno en todas las asignaturas en las que este matriculado. 
        
        asignatura1.apuntarAlumno(alumno1); asignatura1.apuntarAlumno(alumno2);
        asignatura2.apuntarAlumno(alumno1); asignatura2.apuntarAlumno(alumno2);
        asignatura3.apuntarAlumno(alumno1); asignatura3.apuntarAlumno(alumno2);
        
        asignatura4.apuntarAlumno(alumno3); asignatura4.apuntarAlumno(alumno4);
        asignatura5.apuntarAlumno(alumno3); asignatura5.apuntarAlumno(alumno4);
        asignatura6.apuntarAlumno(alumno3); asignatura6.apuntarAlumno(alumno4);
        
        
        // Para cada objeto de Grado realizamos la llamada al metodo apuntarAsignatura
        // y ubicamos todas las asignaturas en el grado que les corresponde.
        
        grado1.apuntarAsignatura(asignatura1); grado1.apuntarAsignatura(asignatura2); grado1.apuntarAsignatura(asignatura3);
        grado2.apuntarAsignatura(asignatura4); grado2.apuntarAsignatura(asignatura5); grado2.apuntarAsignatura(asignatura6);
        
        
        // Tal como pedia el enunciado de nuestro ejercicio, realizamos una llamada a los metodos mostrarInfoAlumno y
        // mostrarInfoProfesor para mostrar en pantalla los datos de un alumno y un profesor en concreto.
        
        alumno1.mostrarInfoAlumno();
        
        profesor1.mostrarInfoProfesor();
        
        
        // Utilizando como ejemplo asignatura1, realizamos la llamada a los 3 posibles metodos para listar informacion
        // que nos indicaba nuestro enunciado de ejercicio.
        
        asignatura1.listarAlumnosIterator();
        
        asignatura1.listarAlumnosFor();
        
        asignatura1.listarAlumnosForEach();
        
        
        // Aqui tenemos la llamada al metodo para eliminar un alumno y a continuacion mediante el metodo de la estructura For
        // comprobamos en pantalla que efectivamente, el alumno en cuestion ya no aparece en lista. 
        
        asignatura1.eliminarAlumno(alumno2.getTelefonoContacto());
        
        asignatura1.listarAlumnosFor();
        
        
        // Por ultimo tenemos la llamada al metodo listarAsignaturasIterator donde ya aparece recogida toda la informacion
        // introducida de las 4 clases. Vemos en particular, que en asignatura1 (Matematicas) solamente tiene un alumno
        // porque acabamos de eliminar a uno de los alumnos.
        
        grado1.listarAsignaturasIterator();
        grado2.listarAsignaturasIterator();
        
    } 
}
