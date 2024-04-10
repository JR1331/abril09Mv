package com.softtek.presentacion;

import com.softtek.modelo.Producto;

import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.function.Consumer;
//Es void, no tiene salida, pero un parametro de entrada
public class ProbarConsumidor {
    private void metodo1(){
        Consumer<String> imprMayus = x->System.out.println(x.toUpperCase());
        imprMayus.accept("minuscula");
    }

    private void metodo2(){
        Consumer<Integer> cuadrado = x->System.out.println(x+" "+Math.pow(x,2));
        cuadrado.accept(4);
    }

    private void metodo3(){
        Consumer<Producto> detalles = x->System.out.println(x.toString());
        detalles.accept(new Producto());
    }

    private void metodo4(){
        Consumer<String> mostrarMensaje = x-> JOptionPane.showMessageDialog(null,x);
        mostrarMensaje.accept("Buenas tardes");
    }

    private void metodo5(){
        Consumer<String> fichero = x->{
            try {
                FileWriter fw = new FileWriter("fichero.txt");
                fw.write(x+"\n");
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        };
        fichero.accept("texto de ejemplo");
    }

    public static void main(String[] args) {
        ProbarConsumidor p1 = new ProbarConsumidor();
        p1.metodo1();
        p1.metodo2();
        p1.metodo3();
        p1.metodo4();
        p1.metodo5();
    }

}
