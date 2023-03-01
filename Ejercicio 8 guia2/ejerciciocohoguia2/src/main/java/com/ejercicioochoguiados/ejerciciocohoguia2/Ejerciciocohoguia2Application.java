/* 8 - Escriba un programa que solicite al usuario el tamaño de un arreglo y un número entero, e
imprima en pantalla el resultado de llenar dicho arreglo con los múltiplos del número dado. Por
ejemplo, si se define un arreglo de tamaño 5 y se indica el valor 3, el resultado será el arreglo
formado por los valores [3, 6, 9, 12, 15]. */
package com.ejercicioochoguiados.ejerciciocohoguia2;

import java.util.ArrayList;
import java.util.Scanner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ejerciciocohoguia2Application {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("¿De que numero quiere saber sus multiplos? ingrese numero");
		int numero = teclado.nextInt();
		
		System.out.println("¿Cuantos multiplos quiere saber del numero? ingrese numero");
		int cantidadMultiplo = teclado.nextInt();

		ArrayList <Integer> multiplos = new ArrayList<>();
		// aqui que hace i va tomando el valor de la cantidad de multiplos que le pido por eso se pone
		//numero * i ej = 4x1=4, 4x2=8,4x3=12,4x4=16 ....
		for (int i = 1 ; i <= cantidadMultiplo ; i++){
			multiplos.add(numero * i);

		}
		System.out.println(multiplos);




	}

}
