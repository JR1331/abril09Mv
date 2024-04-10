package com.softtek.modelo;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Persona {
    private String nombre;
    private int edad;
    private EstadoCivil eCivil;
}
