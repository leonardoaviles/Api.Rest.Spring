package com.java.springwebclient.Controllers;

import com.java.springwebclient.Models.PersonaModel;
import com.java.springwebclient.Services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personas")
public class PersonaController {

    @Autowired
    PersonaService personaService;


    @GetMapping("/all")
    public @ResponseBody List<PersonaModel> listarPersonas(){
        return personaService.listarPersonas();
    }

    @GetMapping("/{id}")
    public @ResponseBody PersonaModel listarPersona(@PathVariable int id){
        return personaService.listarPersona(id);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminarPersona(@PathVariable int id){
        personaService.eliminarPersonaId(id);
    }

    @PostMapping("/guardar")
    public void guardarPersona(@RequestBody PersonaModel personaModel){
        personaService.guardarPersona(personaModel);
    }

}
