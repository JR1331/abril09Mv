package com.softtek.modelo;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Configuracion {
    private String rutaArchivoLogs = "/ruta/a/logs/";
    private String rutaArchivoConfiguracion = "/ruta/a/configuracion/";
}
