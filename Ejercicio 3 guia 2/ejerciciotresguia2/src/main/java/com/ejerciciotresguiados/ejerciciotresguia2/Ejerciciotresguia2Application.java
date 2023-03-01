/*3 -Escriba un programa que permita calcular la suma de todos los elementos del siguiente arreglo:
[1, 3, 6, 82, 23]. */

package com.ejerciciotresguiados.ejerciciotresguia2;

import java.util.ArrayList;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ejerciciotresguia2Application {

	public static void main(String[] args) {
		ArrayList <Integer> numeros = new ArrayList<>();
		  numeros.add (1);
		  numeros.add (3);
		  numeros.add (6);
		  numeros.add (82);
		  numeros.add (23);

		  int suma = 0;
		for (int i = 0 ; i < numeros.size(); i++){
			 suma = suma + numeros.get(i);
		}

		System.out.println("La suma del arreglo es de: " + suma );
	}

}
