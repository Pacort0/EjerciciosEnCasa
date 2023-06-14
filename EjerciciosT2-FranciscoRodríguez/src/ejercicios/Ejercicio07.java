package ejercicios;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		int horas, minutos, segundos;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca las horas: ");
		horas = sc.nextInt();
		System.out.print("Introduzca los minutos: ");
		minutos = sc.nextInt();
		System.out.print("Introduzca los segundos: ");
		segundos = sc.nextInt();
		if(horas < 0 || horas > 24 || segundos > 59 || segundos < 0 || minutos > 59 || minutos < 0) {
			System.out.print("Valores introducidos incorrectos.");
		}
		else {	
			if (segundos == 59 && minutos != 59) {
				segundos = 00;
				minutos += 1;
			}
			else if (segundos == 59 && minutos == 59) {
				segundos = 00;
				minutos = 00;
				horas += 1;
			}
			else {
				segundos +=1;
			}
			if (horas == 24) {
				horas = 0;
			}
		System.out.print("Son las " + horas + " horas," + minutos + " minutos y " + segundos + " segundos.");
		sc.close();
		}
	}

}
