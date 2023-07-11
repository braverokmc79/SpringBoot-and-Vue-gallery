package org.africalib.gallery.backend.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.africalib.gallery.backend.entity.Item;
import org.africalib.gallery.backend.repository.ItemRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@Log4j2
public class ItemController {

    private final ItemRepository itemRepository;

//    @GetMapping("/api/items")
//    public List<String> getItems(){
//        List<String> items =new ArrayList<>();
//        items.add("alpha");
//        items.add("beta");
//        items.add("gamma");
//        return items;
//    }


    @GetMapping("/api/items")
    public List<Item> getItems() throws  Exception{
        List<Item> items = itemRepository.findAll();
        return items;
    }


}
