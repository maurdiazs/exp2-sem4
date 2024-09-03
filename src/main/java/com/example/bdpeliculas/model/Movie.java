package com.example.bdpeliculas.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "movie")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column (name = "title")
    private String title;
    @Column(name = "year")
    private int year;
    @Column (name = "director")
    private String director;
    @Column (name = "gender")
    private String gender;
    @Column (name = "synopsis")
    private String synopsis;

    //Getters y Setters

    public Long getId(){
        return id;
    }

    public String getTitle(){
        return title;
    }

    public int getYear(){
        return year;
    }

    public String getDirector(){
        return director;
    }

    public String getGender(){
        return gender;
    }

    public String getSynopsis(){
        return synopsis;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }
    
}
