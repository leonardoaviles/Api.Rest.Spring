package com.consumeApi.consumeApi.Controller;

import com.consumeApi.consumeApi.Model.ItemEntity;
import com.consumeApi.consumeApi.Service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping("listar")
    public List<ItemEntity> listarItems(){
        return itemService.listarItem();
    }

    @GetMapping("/{id}/{municipio}")
    public ItemEntity itemById(@PathVariable int id, @PathVariable String municipio){

        return itemService.listarItemById(id,municipio);

    }
}
