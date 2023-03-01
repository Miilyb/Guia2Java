/* 5 - Escriba un programa que permita calcular la suma y el producto entre pares de todos los
elementos de los siguientes arreglos: [0, 28, 30, 10, 4] y [1, 3, 6, 82, 23].*/
package com.ejerciciocincoguiados.ejerciciocincoguia2;

import java.util.ArrayList;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ejerciciocincoguia2Application {

	public static void main(String[] args) {
		ArrayList <Integer> arregloUno = new ArrayList<>();
		  arregloUno.add(0);
		  arregloUno.add (28);
		  arregloUno.add (30);
		  arregloUno.add (10);
		  arregloUno.add (4);

		  ArrayList <Integer> arregloDos = new ArrayList<>();
		  arregloDos.add(1);
		  arregloDos.add (3);
		  arregloDos.add (6);
		  arregloDos.add (82);
		  arregloDos.add (23);

		  /*ArrayList <Integer> suma = new ArrayList<Integer>();
		  ArrayList <Integer> multi = new ArrayList<Integer>();*/

		  for (int i = 0 ; i < 5 ; i++){
			int sumas = arregloUno.get(i) + arregloDos.get(i);
			int producto = arregloUno.get(i) * arregloDos.get(i);
			/*suma.add(sumas);
			multi.add(producto);*/

			System.out.println("La suma de los arreglos es: " + sumas);
		   System.out.println("El producto delos arreglos es: " + producto);
              }

           }

		
}

