package com.softtek.presentacion;

import java.util.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class PruebaArray {

    public static void main(String[] args) {
        //No se puede crear un
        ArrayList<Integer> numeros = new ArrayList<>();

        // Metodo .add() para añadir elementos al arraylist
        numeros.add(5);
        numeros.add(10);
        numeros.add(3);
        numeros.add(8);
        System.out.println("ArrayList antes de ordenar");
        System.out.println(numeros);
        System.out.println("Podemos comprobar el tamaño del ararylist");
        System.out.println(numeros.size());
        //Se utiliza el metodo sort cuando el arraylist
        Collections.sort(numeros);

        System.out.println("despues de ordenarlo");
        System.out.println(numeros);

        numeros.remove(0);
        System.out.println("Borramos el elemento con el indice 0");
        System.out.println(numeros);
        System.out.println("Volvemos a comprobar el tamaño despues de borrar el elemento");
        System.out.println(numeros.size());

        // Ordenamos el ArrayList en orden descendente
        System.out.println("Ordenamos en orden reverso el arraylist");
        Collections.sort(numeros, Collections.reverseOrder());

        System.out.println(numeros);

        // Metodo indexof para buscar un elemento por el indice
        int indice = numeros.indexOf(5);
        System.out.println("Puesto 5 del arraylist: " + indice);

        System.out.println("Buscamos un numero que no existe");
        int indice2 = numeros.indexOf(3);
        System.out.println("Posicion del numero 3 en el arraylist "+indice2);
        System.out.println(numeros.contains(3));
        System.out.println(numeros.contains(5));

        numeros.clear();

        System.out.println(numeros);


    }
}

