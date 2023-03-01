/* 6 -Escriba un programa que lea un arreglo de seis elementos (ingresados por el usuario) e
intercambie las posiciones de sus elementos, de tal forma que el primero pase a ser el último y
el último el primero, el segundo el penúltimo, y así sucesivamente. Imprima en pantalla el
arreglo resultante. */
package com.ejercicioseisguiados.ejercicioseisguia2;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.ArrayList;
import java.util.Scanner;




@SpringBootApplication
public class Ejercicioseisguia2Application {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);

		ArrayList <Integer> derecho = new ArrayList<Integer>();

		for (int i = 0 ; i < 6 ; i++){
			System.out.println("Ingrese datos del arreglo");
			int numerosArreglo = teclado.nextInt();
			derecho.add(numerosArreglo);
		}
		

		ArrayList <Integer> alReves = new ArrayList<Integer>();

		for (int i = derecho.size()-1 ; i >= 0 ;  i=i-1) {
			alReves.add(derecho.get(i));
		}
		System.out.println("El array invertido es: " + alReves);




	}

}
