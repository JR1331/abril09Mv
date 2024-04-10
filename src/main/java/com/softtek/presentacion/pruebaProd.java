package com.softtek.presentacion;

import com.softtek.modelo.Producto;

public class pruebaProd {
    public static void main(String[] args) {
        System.out.println(Producto.contador);
        Producto p1 = new Producto();
        System.out.println(p1.toString());
        Producto p22 = new Producto();
        System.out.println(p22.toString());
    }
}
