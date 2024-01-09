package com.codegym.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Song {
    @NotEmpty(message = "Không được để trống.")
    @Size(max = 800, message = "Không vượt quá 800 kí tự.")
    @Pattern(regexp = "^[^@;,.=+\\-\\u2026]*$", message = "Không đúng định dạng")
    private String nameSong;
    @NotEmpty(message = "Không được để trống")
    @Size(max = 500, message = "Không vượt quá 500 kí tự")
    @Pattern(regexp = "^[^@;,.=+\\-\\u2026]*$", message = "Không đúng định dạng")
    private String artist;
    @NotEmpty(message = "Không được để trống")
    @Size(max = 1000, message = "Không vượt quá 1000 kí tự")
    @Pattern(regexp = "^[a-zA-Z0-9\\s]*,?[a-zA-Z0-9\\s]*$", message = "Không đúng định dạng")
    private String kindOfMusic;

    public Song() {
    }

    public Song(String nameSong, String artist, String kindOfMusic) {
        this.nameSong = nameSong;
        this.artist = artist;
        this.kindOfMusic = kindOfMusic;
    }

    public String getNameSong() {
        return nameSong;
    }

    public void setNameSong(String nameSong) {
        this.nameSong = nameSong;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getKindOfMusic() {
        return kindOfMusic;
    }

    public void setKindOfMusic(String kindOfMusic) {
        this.kindOfMusic = kindOfMusic;
    }
}
