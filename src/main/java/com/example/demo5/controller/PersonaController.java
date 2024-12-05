/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo5.controller;

import com.example.demo5.repository.PersonaRepository;
import org.springframework.ui.Model;
import com.example.demo5.model.Persona;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author leoru
 */
public class PersonaController {
    
    private final PersonaRepository personaRepository;
    
    public PersonaController(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }
    
    @GetMapping("/personas")
    public String listarPersonas(Model model) {
        List<Persona> personas = personaRepository.findAll();
        model.addAttribute("personas", personas);
        return "personas";
    }
    
}
