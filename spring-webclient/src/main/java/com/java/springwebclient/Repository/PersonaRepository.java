package com.java.springwebclient.Repository;

import com.java.springwebclient.Models.PersonaModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends CrudRepository<PersonaModel , Integer> {
}
