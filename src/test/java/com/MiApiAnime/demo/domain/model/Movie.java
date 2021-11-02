package com.MiApiAnime.demo.domain.model;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "movie")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //esto hace que el id lo cree de forma automatica la base de datos
    public UUID movieid;

    public String title;
    public String imageurl;
}


/*
my_nueva_variable

myNuevaVariable

my-nueva-variable


 */