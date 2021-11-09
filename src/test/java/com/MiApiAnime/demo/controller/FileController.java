package com.MiApiAnime.demo.controller;

import com.MiApiAnime.demo.domain.model.File;
import com.MiApiAnime.demo.domain.model.Movie;
import com.MiApiAnime.demo.repository.FileRepository;
import com.MiApiAnime.demo.repository.MovieRepository;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/files")

public class FileController {
private final FileRepository fileRepository;
FileController(FileRepository fileRepository){

    this.fileRepository=fileRepository;
}

@GetMapping("/{id}")
public byte[] jajajaja(@PathVariable UUID id){
    File file = fileRepository.getById(id);
    return  file.data;
}

    @PostMapping
    public String upload(@RequestParam("file") MultipartFile uploadedFile) {
        try {
            System.out.println(uploadedFile.getOriginalFilename() + ", " + uploadedFile.getContentType());
            File file = new File();
            file.contenttype = uploadedFile.getContentType();
            file.data = uploadedFile.getBytes();

            return fileRepository.save(file).fileid.toString();
        } catch (Exception e) {
            e.printStackTrace();

            return null;
        }



}}
