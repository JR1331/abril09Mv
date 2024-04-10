package com.softtek.presentacion;

import com.softtek.modelo.Configuracion;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.function.Supplier;
//Sirve para solo retornar no tiene datos de entrada
public class ProbarProveedor {
    public void metodo1(int i, int j){
        Supplier<Integer> numAleatorio = ()->{
            return (int)(Math.random() * (j - i + 1)) + i;
        };
        System.out.println(numAleatorio.get());
    }

    public void metodo2(){
        Supplier<String> lista = ()->{
            ArrayList<String> nombre = new ArrayList<>();
            nombre.add("Jaime");
            nombre.add("Luis");
            nombre.add("Javier");
            nombre.add("Pedro");
            return nombre.toString();
        };
        System.out.println(lista.get());
    }

    public void metodo3(){
        Supplier<LocalDateTime> fechaYHora = LocalDateTime::now;
        System.out.println(fechaYHora.get());
    }

    public void metodo4(){
        Supplier<String> vacio= ()->"";
        System.out.println(vacio.get());
    }

    public void metodo5(){
        Supplier<Configuracion> config = ()->new Configuracion();
        System.out.println(config.get());
    }


    public static void main(String[] args) {
        ProbarProveedor p = new ProbarProveedor();
        p.metodo1(1,10);
        p.metodo2();
        p.metodo3();
        p.metodo4();
        p.metodo5();
    }
}
