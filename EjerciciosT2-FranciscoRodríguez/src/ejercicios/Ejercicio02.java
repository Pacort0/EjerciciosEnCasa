package ejercicios;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		int DNI;
		int resto;
		String letra;
		
		Scanner sc = new Scanner (System.in);
		
	System.out.print("Introduzca su número del DNI: ");
		DNI = sc.nextInt();

if(DNI <= 9999999 || DNI > 99999999) {
	System.out.print("El número de DNI introducido es incorrecto.");
}

else {

		resto = DNI % 23;
		
		letra = switch (resto) {
		case 0 -> {
				yield "T";
			}
		case 1 -> {
			yield "R";
		}
		case 2 -> {
			yield "W";
		}
		case 3 -> {
			yield "A";
		}
		case 4 -> {
			yield "G";
		}
		case 5 -> {
			yield "M";
		}
		case 6 -> {
			yield "Y";
		}
		case 7 -> {
			yield "F";
		}
		case 8 -> {
			yield "P";
		}
		case 9 -> {
			yield "D";
		}
		case 10 -> {
			yield "X";
		}
		case 11-> {
			yield "B";
		}
		case 12-> {
			yield "N";
		}
		case 13-> {
			yield "J";
		}
		case 14-> {
			yield "Z";
		}
		case 15 -> {
			yield "S";
		}
		case 16-> {
			yield "Q";
		}
		case 17-> {
			yield "V";
		}
		case 18-> {
			yield "H";
		}
		case 19-> {
			yield "L";
		}
		case 20-> {
			yield "C";
		}
		case 21-> {
			yield "K";
		}
		case 22-> {
			yield "E";
		}
			default ->{
				System.out.print("El número introducido es incorrecto.");
				yield "";
			}
		};
		System.out.print("La letra de su DNI es " + letra);
}
		
		sc.close();
	}

}
