package com.softtek.modelo;

public class Calculadora {
    public static double suma (double uno, double dos){
        return uno+dos;
    }

    public static double resta (double uno, double dos){
        return uno-dos;
    }

    public static double multiplicacion (double uno, double dos){
        return uno*dos;
    }

    public static double dividir(double uno, double dos){
        if(dos==0){
            throw new ArithmeticException("Division no permitida");
        }
        return uno/dos;
    }
}
