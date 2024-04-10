package com.softtek.modelo;


import lombok.*;

//Crear la clase globo con una variable estática entera para asignar el id del globo.
//En una clase principal PruebaGlobo se crearán distintos objetos y desde cada uno de
//ellos se mostrará el id del globo
@Data
@AllArgsConstructor
public class Globo {
    private static int cont=0;
    private int id;
    private String nombre;

    public Globo(){
        this.id=++cont;
    }

}
