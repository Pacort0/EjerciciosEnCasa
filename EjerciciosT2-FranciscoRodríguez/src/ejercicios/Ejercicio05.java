package ejercicios;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		int num;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Introduzca un número entero: ");
		num = sc.nextInt();
		
		num = num > 0 ? num : num*-1;
		
		System.out.print("El valor absoluto del número introducido es: |" + num + "|");
		
		sc.close();
	}

}
