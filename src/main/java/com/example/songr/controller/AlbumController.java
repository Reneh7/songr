package com.example.songr.controller;

import com.example.songr.models.Album;
import com.example.songr.repositres.AlbumJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class AlbumController {

    @Autowired
    AlbumJpa albumJpa;

    @GetMapping("/albums")
    public String getAlbums(Model model) {
        List<Album> albums = albumJpa.findAll();
        model.addAttribute("albums", albums);
        return "albums.html";
    }

    @PostMapping("/create-album")
    public RedirectView createAlbum(String title, String artist, int songCount, int length, String imageUrl) {
        Album newAlbum = new Album(title, artist, songCount, length, imageUrl);
        albumJpa.save(newAlbum);
        return new RedirectView("albums");

    }
}



