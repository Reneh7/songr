package com.example.songr.controller;

import com.example.songr.models.Album;
import com.example.songr.models.Song;
import com.example.songr.repositres.AlbumJpa;
import com.example.songr.repositres.SongJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;
import com.example.songr.Exceptions.AlbumNotFoundException;

import java.util.List;

@Controller
public class SongController {
    @Autowired
    AlbumJpa albumRepo;
    @Autowired
    SongJpa songRepo;

    @GetMapping("/songs")
    public String getSongs(Model model){
        List<Song> songs=songRepo.findAll();
        model.addAttribute("songs",songs);
        return "songs.html";
    }

    @GetMapping("/albums/{id}/addSong")
    public String getAddSongForm(@PathVariable Long id, Model model) {
        Album album = albumRepo.findById(id)
                .orElseThrow(() -> new AlbumNotFoundException("Could not find album in db!"));
        model.addAttribute("album", album);
        return "add-song.html";
    }

    @PostMapping("/albums/{id}/addSong")
    public String addSong(@RequestParam Long albumId,@ModelAttribute Song song) {
        Album album = albumRepo.findById(albumId)
                .orElseThrow(() -> new AlbumNotFoundException("Could not find album for this song in db!"));
        song.setAlbum(album);
        songRepo.save(song);
        return "redirect:/albums/{id}";
    }



}
