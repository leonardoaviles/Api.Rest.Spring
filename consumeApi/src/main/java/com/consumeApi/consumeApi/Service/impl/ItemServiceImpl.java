package com.consumeApi.consumeApi.Service.impl;

import com.consumeApi.consumeApi.Model.ItemEntity;
import com.consumeApi.consumeApi.Model.PersonaEntity;
import com.consumeApi.consumeApi.Service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class ItemServiceImpl implements ItemService {

    private String baseUrl = "http://localhost:8080/personas";

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public List<ItemEntity> listarItem() {
        List<PersonaEntity> personaEntity = List.of(restTemplate.getForObject(baseUrl + "/all", PersonaEntity[].class));
        return personaEntity.stream().map(p -> new ItemEntity(p, "Santiago")).collect(Collectors.toList());
    }

    @Override
    public ItemEntity listarItemById(int id, String municipio) {
        Map<String, Integer> pathVariables = new HashMap<String,Integer>();
        pathVariables.put("id",id);
        PersonaEntity personaEntity = restTemplate.getForObject(baseUrl+"/{id}",PersonaEntity.class,pathVariables);
        return new ItemEntity(personaEntity,municipio);
    }
}
