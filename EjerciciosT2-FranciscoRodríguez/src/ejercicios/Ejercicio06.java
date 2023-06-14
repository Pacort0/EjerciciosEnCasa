package ejercicios;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		double num1 = Math.random()*99;
		double num2 = Math.random()*99;
		int suma;
		int sumaUs;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Debe usted sumar los dos siguientes números: " + (int)num1 + " + " + (int)num2);
		System.out.print("Introduzca el resultado de la suma aquí: ");
		sumaUs = sc.nextInt();
		
		suma = (int)num1 + (int)num2;
		if(suma == sumaUs) {
			System.out.print("¡Correcto! El resultado de la suma es " + sumaUs + " ;)");
		}
		else {
			System.out.print("Lo siento, el resultado de la suma no es " + sumaUs + " :(");
		}
		sc.close();
	}

}
