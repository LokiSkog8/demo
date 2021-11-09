package com.MiApiAnime.demo.repository;

import com.MiApiAnime.demo.domain.model.File;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FileRepository extends JpaRepository<File, UUID> {

}
