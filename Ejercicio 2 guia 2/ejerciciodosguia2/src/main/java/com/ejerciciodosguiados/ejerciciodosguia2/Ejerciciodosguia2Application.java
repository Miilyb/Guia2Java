/*2 -Escriba un programa que permita imprimir al revés cada uno de los elementos del siguiente
arreglo: [0, 28, 30, 10, 4]. */


package com.ejerciciodosguiados.ejerciciodosguia2;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.ArrayList;

@SpringBootApplication
public class Ejerciciodosguia2Application {

	public static void main(String[] args) {
		ArrayList <Integer> numeros = new ArrayList<>();
		  numeros.add (0);
		  numeros.add (28);
		  numeros.add (30);
		  numeros.add (10);
		  numeros.add (4);

		  for (int i = 4; i >= 0 ; i--){
			System.out.println(numeros.get(i));
		  }

		  /*for(int i = numeros.size()-1 ; i>=0 ; i--){
			System.out.print(numeros.get(i) + " ");

	}*/

}
}
