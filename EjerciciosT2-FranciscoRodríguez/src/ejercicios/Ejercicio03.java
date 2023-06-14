package ejercicios;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		double compra;
		double ingieren;
		int animales;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca la cantidad de comida que ha comprado (kilos): ");
		compra = sc.nextDouble();
		System.out.print("Introduzca la cantidad de comida que ingieren sus animales en total (kilos): ");
		ingieren = sc.nextDouble();
		System.out.print("Introduzca la cantidad de animales que posee: ");
		animales = sc.nextInt();
		
		if(animales <= 0 || compra <= 0 || ingieren <= 0) {
			System.out.print("Datos introducidos erróneos");
		}
		else {
			if(compra < ingieren){
				System.out.print("Con la comida comprada sus animales no podrán consumir su ración diaria de " + ingieren / animales + " kilos."
						+ "\n Con lo comprado, a cada uno le corresponden " + compra / animales + " kilos.");
			}
			else {
				System.out.print("Con la comida comprada es suficiente para que los animales ingieran sus " + ingieren / animales + " kilos diarios de comida.");
			}
		}
		sc.close();
	}

}
