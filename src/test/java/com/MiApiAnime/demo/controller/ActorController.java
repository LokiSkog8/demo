package com.MiApiAnime.demo.controller;

import com.MiApiAnime.demo.domain.model.Actor;
import com.MiApiAnime.demo.domain.model.Movie;
import com.MiApiAnime.demo.repository.ActorRepository;
import com.MiApiAnime.demo.repository.MovieRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

    @RestController
    @RequestMapping("/actors")

    public class ActorController {
        private final ActorRepository actorRepository;

        ActorController(ActorRepository actorRepository) {
            this.actorRepository = actorRepository;
        }

        @GetMapping("/")
        public List<Actor> jujas() {
            return actorRepository.findAll();
        }
    }
