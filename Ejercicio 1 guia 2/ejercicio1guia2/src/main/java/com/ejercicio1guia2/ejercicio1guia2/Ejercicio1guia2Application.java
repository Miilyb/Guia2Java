/* 1- Escriba un programa que permita imprimir en pantalla cada uno de los elementos del siguiente
arreglo: [0, 28, 30, 10, 4]. */

package com.ejercicio1guia2.ejercicio1guia2;


import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class Ejercicio1guia2Application {

	public static void main(String[] args) {
		ArrayList <Integer> numeros = new ArrayList<>();
          numeros.add (0);
		  numeros.add (28);
		  numeros.add (30);
		  numeros.add (10);
		  numeros.add (4);
		  System.out.println(numeros);
	}

}
