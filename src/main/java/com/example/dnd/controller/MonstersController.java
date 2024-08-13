package com.example.dnd.controller;


import com.example.dnd.model.Monsters;

import com.example.dnd.repository.MonstersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/monsters")
public class MonstersController {

    @Autowired
    private MonstersRepository monstersRepository;

    @GetMapping
    public List<Monsters> getAllDati() {
        return monstersRepository.findAll();
    }

}
