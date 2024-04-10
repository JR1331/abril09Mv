package com.softtek.presentacion;

import java.util.function.Predicate;
//Se usa para criterios y condicionales
public class ProbarPredicado {

    private void metodo1(){
        Predicate<Integer> numPositivo = x -> x>0;
        boolean resultado = numPositivo.test(7);
        System.out.println(resultado);
    }

    private void metodo2(){
        Predicate<String> noVacia = x -> x.isEmpty();
        boolean resultado = noVacia.test("Cadenaprueba");
        System.out.println(resultado);
    }

    private void metodo3(){
        Predicate<Integer> numPar = x -> (x % 2)==0;
        boolean resultado = numPar.test(7);
        System.out.println(resultado);
    }

    private void metodo4(int i){
        Predicate<Integer> esMayorQue = x -> x > i;
        boolean resultado = esMayorQue.test(7);
        System.out.println(resultado+"mayor que "+i);
    }

    private void metodo5(){
        Predicate<Integer> esPrimo = x->{
            boolean primo=false;
            int cont = 0;
            for (int i=1;i<=x;i++){
                if(x%i==0)
                    cont++;
            }
            if (cont==2)
                primo=true;
            return primo;
        };
        boolean resultado = esPrimo.test(7);
        System.out.println(resultado);
    }

    public static void main(String[] args) {
        ProbarPredicado pp = new ProbarPredicado();
        pp.metodo1();
        pp.metodo2();
        pp.metodo3();
        pp.metodo4(10);
        pp.metodo5();
    }
}
