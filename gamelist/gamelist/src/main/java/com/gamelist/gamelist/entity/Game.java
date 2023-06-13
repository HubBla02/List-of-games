package com.gamelist.gamelist.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "games")
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "Title", nullable = false)
    private String title;
    @Column(name = "Genre")
    private String genre;
    @Column(name = "Developer", nullable = false)
    private String developer;
    @Column(name = "PLatform", nullable = false)
    private String platform;

    @Column(name = "Multiplayer")
    private String multiplayer;
    @Column(name = "Free")
    private String free;

    public Game(){

    }

    public Game(String title, String genre, String developer, String platform, String isMulti, String isFree) {
        this.title = title;
        this.genre = genre;
        this.developer = developer;
        this.platform = platform;
        this.multiplayer = isMulti;
        this.free = isFree;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getMultiplayer() {
        return this.multiplayer;
    }

    public void setMultiplayer(String multi) {
        this.multiplayer = multi;
    }

    public String getFree() {
        return this.free;
    }

    public void setFree(String free) {
        this.free = free;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
