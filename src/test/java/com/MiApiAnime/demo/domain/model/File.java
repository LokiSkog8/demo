package com.MiApiAnime.demo.domain.model;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "movie")
public class File {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //esto hace que el id lo cree de forma automatica la base de datos
    public UUID fileid;

    public String contenttype;
    
    @Lob
    @Type(type = "org.hibernate.type.BinaryType")
    public byte[] data;
}


/*
my_nueva_variable

myNuevaVariable

my-nueva-variable


 */