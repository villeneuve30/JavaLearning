package com.example.demo.formation_1.controllers;

import com.example.demo.formation_1.entities.Pays;
import com.example.demo.formation_1.repositories.PaysRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PaysController
{
    @Autowired
    PaysRepository paysRepository;

    @GetMapping("/get-pays")
    public @ResponseBody List<Pays> getPays()
    {
        return paysRepository.findAll();
    }
}
