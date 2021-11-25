package com.example.forum.controller;

import java.util.Arrays;
import java.util.List;

import com.example.forum.model.Curso;
import com.example.forum.model.Topico;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicosController {
    @RequestMapping("/topicos")
    public List<Topico> lista() {
        Topico topico = new Topico("Duvida", "Duvida com Spring", new Curso("Spring", "Programação"));

        return Arrays.asList(topico, topico, topico);
    }
}
