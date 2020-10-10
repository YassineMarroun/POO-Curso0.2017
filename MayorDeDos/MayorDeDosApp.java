/**
 * @ (#) MayorDeDosApp.java
 * 
 * Este programa solicita que se le introduzcan dos numeros, y devuelve en pantalla el mayor de ellos.
 * A continuacion, da la opcion de realizar un nuevo calculo o salir del programa.
 *
 * @author Yassine Marroun
 * @version 1.00 2017/03/05
 */

import java.util.Scanner;

public class MayorDeDosApp {
		
	public static void main(String[] args) {
			
		String opcion = "C";
		int resultado = 0;
		Scanner teclado = new Scanner(System.in);
		MayorDeDos maximo = new MayorDeDos();

		System.out.println("Bienvenido al programa MayorDeDos\n");
				
		do {	
			switch (opcion) {
				case "C":
				maximo.datos();
				resultado = maximo.comparador();
				System.out.println("El numero mayor es: " + resultado + " \n");
				break;
				case "S":
				break;
			}
		System.out.println("Para realizar un nuevo calculo pulsa C. Para salir pulsa S.");
		opcion = teclado.nextLine();
		} while (opcion.equals ("C"));
	System.out.println("Hasta la proxima.");
	teclado.close();
	System.exit(0);
	}
}