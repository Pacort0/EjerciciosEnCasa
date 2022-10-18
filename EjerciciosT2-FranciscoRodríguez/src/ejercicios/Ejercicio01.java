package ejercicios;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		//En la variable 'numero' guardaremos el número que el usuario introduzca por teclado
		int numero, aux;
		//Creamos e iniciamos a 0 la variable 'invertido', donde guardaremos el número con sus cifras invertidas
		int invertido = 0;
		//En la variable resto guardaremos el resto de las multiples divisiones que hagamos
		int resto = 0;
		//Iniciamos la variable cifras y le asignams uno de los posibles valores para ahorrarnos código
		int cifras = 4;
		
		//Creamos el escáner del programa
		Scanner sc = new Scanner(System.in);
		
		//Imprimimos el mensaje inicial y guardamos el valor que el usuario introduzca en la variable asignada
		System.out.print("Introduzca un número entre el 0 y el 9999: ");
		numero = sc.nextInt();
		
		//Si el número no se encuentra en el intervalo de 0 y 9999, imprime mensaje de error
		if(numero < 0 || numero > 9999) {
			System.out.println("Número introducido incorrecto.");
		}
		
		//Si el número se encuentra entre 10 y 99, tiene 2 cifras
		if(numero >= 10 && numero < 100) {
			cifras = 2;
		}
		//Si el número se encuentra entre 100 y 999, tiene 3 cifras
		if(numero >= 100 && numero < 1000) {
			cifras = 3;
		}
		
		//Le asignamos el valor del número original a la variable auxiliar
		aux = numero;
		
		//Si el número tiene dos cifras
		if (cifras == 2 ) {
			//Hacemos este proceso tantas veces como cifras tenga el número. El objetivo es obtener el número dado la vuelta
				//La clave del programa está en que las variables están iniciadas como 'int'
				//y el programa solo se va a quedar con la parte decimal a la hora de coger restos o cocientes
			
			//El resto de la primera operación siempre va a obtener como resto la última cifra del número
			resto = aux % 10;
			//Esta cifra va a hacer de decenas, así que la multiplicamos por 10
			invertido = resto * 10;
			//Dividimos el número original entre diez para obtener el cociente (ya tenemos el resto)
			aux /= 10;
			
			//Ahora solo queda una cifra, y al ser un int, el programa se va a quedar con la cifra como resto porque
			//no puede sacar decimales
			resto = aux % 10;
			//Le sumamos las unidades a las decenas. Ya le hemos dado la vuelta al número.
			invertido += resto;
		}
		
		//Con el número de tres cifras pasa lo mismo, solo que hay una repetición más del primer "bucle"
		else if(cifras == 3) {
			resto = aux % 10;
			//Multiplicamos la primera cifra por 100 para conseguir las centenas del número invertido
			invertido = resto * 100;
			aux /= 10;
			
			//Ahora mismo, 'invertido' vale lo que vale la última cifra del número introducido
			//y el número que se va a dividir entre diez son las 2 cifras restantes.
			
			//Con esta división recogemos como resto la segunda cifra del número, y el cociente es la cifra que queda sin tomar
			resto = aux % 10;
			//A las centenas le sumamos el resto multiplicado por 10(las decenas)
			invertido = invertido + resto*10 ;
			aux /= 10;
			
			//El resto es la cifra que queda
			resto = aux % 10;
			//Se la sumamos a lo que ya tenemos de número invertido (unidades)
			invertido += resto;
			
		}
		//4 cifras es el valor por defecto de 'cifras'. Repetimos los procesos anteriores pero con un paso más.
		else {
			resto = aux % 10;
			invertido = resto * 1000;
			aux /= 10;
			
			resto = aux % 10;
			invertido += resto * 100;
			aux /= 10;
			
			resto = aux % 10;
			invertido += resto * 10;
			aux /= 10;
			
			resto = aux % 10;
			invertido += resto;
		}
		
		//Si el número original es igual al número invertido obtenido, el número era capicúa
		if(invertido == numero) {
			System.out.println("El número introducido es capicúa.");
		}
		//Si no, no lo era
		else {
			System.out.println("El número introducido no es capicúa.");
		}
		
		//Cerramos el escáner
		sc.close();
	}

}

