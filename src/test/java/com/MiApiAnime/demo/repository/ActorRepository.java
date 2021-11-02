package com.MiApiAnime.demo.repository;

import com.MiApiAnime.demo.domain.model.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ActorRepository extends JpaRepository<Actor, UUID> {
}
