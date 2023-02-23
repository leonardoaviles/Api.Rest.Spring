package com.java.springwebclient.Services;

import com.java.springwebclient.Models.PersonaModel;

import java.util.List;

public interface PersonaService {

    List<PersonaModel> listarPersonas();
    PersonaModel listarPersona(int id);
    void eliminarPersonaId(int id);
    void guardarPersona(PersonaModel personaModel);

}
