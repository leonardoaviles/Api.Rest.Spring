package com.consumeApi.consumeApi.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonaEntity {

    private int id;
    private String nombre;
    private String apellido;
    private String email;
    private String usuario;

}
