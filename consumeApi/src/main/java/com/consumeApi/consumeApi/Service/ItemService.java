package com.consumeApi.consumeApi.Service;

import com.consumeApi.consumeApi.Model.ItemEntity;

import java.util.List;

public interface ItemService {

    List<ItemEntity> listarItem();
    ItemEntity listarItemById(int id, String municipio);

}
