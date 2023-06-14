package ejercicios;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		int num, resto, millar, centena, decena, unidad;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Introduzca un número entero del 0 al 9999: ");
		num = sc.nextInt();
		
		if(num < 0 || num > 9999) {
			System.out.println("Número introducido fuera de rango.");
		}
		else {
			
			millar = num / 1000;
			resto = num % 1000;
			
			centena = resto / 100;
			resto %= 100;
			
			decena = resto  / 10;
			
			unidad = num % 10;

			if(num >= 0 && num < 10) {
				System.out.print("El número es capicúa.");
			}
			else if(num >= 10 && num < 100) {
				if (decena == unidad) {
					System.out.print("El número es capicúa.");
				}
				else {
					System.out.print("El número no es capicúa.");
				}
			}
			else if(num >= 100 && num < 1000) {
				if (centena == unidad) {
					System.out.print("El número es capicúa.");
				}
				else {
					System.out.print("El número no es capicúa.");
				}
			}
			else {
				if (millar == unidad && centena == decena) {
					System.out.print("El número es capicúa.");
				}
				else {
					System.out.print("El número no es capicúa");
				}
			}
		}
		sc.close();
	}

}

