package com.softtek.presentacion;

import com.softtek.modelo.EstadoCivil;
import com.softtek.modelo.Persona;

public class TestPersona {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.setECivil(EstadoCivil.SOLTERO);
        Persona p2 = new Persona("Jaime",24,EstadoCivil.VIUDO);
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}
