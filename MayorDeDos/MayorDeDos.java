/**
 * @ (#) MayorDeDos.java
 * 
 * En esta clase se desarrollan los metodos Datos y Comparador,
 * de forma que se puedan ejecutar en la clase principal MayorDeDosApp.
 * El metodo Datos solicita que se le den dos numeros,
 * y el metodo Comparador realiza dicha comparacion para devolver el mayor de ellos.
 *
 * @author Yassine Marroun
 * @version 1.00 2017/03/05
 */

import java.util.Scanner;

public class MayorDeDos {

	private int numero1;
	private int numero2;
    private Scanner entrada = new Scanner (System.in);
	
	int comparador (){
		if (numero1 > numero2){
			return numero1;
		} else{
			return numero2;
		}
	}		

	public void datos (){

	System.out.println("Introduce el primer numero.");

	numero1 = entrada.nextInt();

	System.out.println("Introduce el segundo numero.");

	numero2 = entrada.nextInt();
	}	
}