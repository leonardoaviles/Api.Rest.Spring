package com.java.springwebclient.Services.Impl;

import com.java.springwebclient.Models.PersonaModel;
import com.java.springwebclient.Repository.PersonaRepository;
import com.java.springwebclient.Services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    @Override
    @Transactional(readOnly = true)
    public List<PersonaModel> listarPersonas() {
        return (List<PersonaModel>) personaRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public PersonaModel listarPersona(int id) {
        return personaRepository.findById(id).orElse(null);
    }

    @Override
    public void eliminarPersonaId(int id) {
        personaRepository.deleteById(id);

    }

    @Override
    public void guardarPersona(PersonaModel personaModel) {
        personaRepository.save(personaModel);
    }
}
