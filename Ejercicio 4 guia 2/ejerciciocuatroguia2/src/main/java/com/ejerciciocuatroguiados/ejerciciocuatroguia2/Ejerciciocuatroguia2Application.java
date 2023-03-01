/*4 - Escriba un programa que deduzca e imprima en pantalla el número menor en el siguiente
arreglo: [90, 1, 38, 0, 29, 4].*/
package com.ejerciciocuatroguiados.ejerciciocuatroguia2;

import java.util.ArrayList;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ejerciciocuatroguia2Application {

	public static void main(String[] args) {
		ArrayList <Integer> numeros = new ArrayList<>();
		numeros.add (90);
		numeros.add (1);
		numeros.add (38);
		numeros.add (0);
		numeros.add (29);
		numeros.add (4);

		int numMenor = numeros.get(0);

		for (int i = 1 ; i < numeros.size() ; i++) {

			if (numeros.get(i) < numMenor){
				numMenor = numeros.get(i);
			}
		}
		System.out.println("El número menor es: " + numMenor);

		
	}

}
