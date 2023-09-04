package com.example.songr.controller;

import com.example.songr.Album;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AlbumController {
    @GetMapping("/albums")
    public String getAlbums(Model model) {
        List<Album> albums= new ArrayList<>();

        albums.add(new Album("Album 1", "Eminem", 10, 3000, "https://images.rapgenius.com/bbb8c439379fab73405be842290f2670.1000x1000x1.jpg"));
        albums.add(new Album("Album 2", "Taylor Swift", 12, 3500, "https://th.bing.com/th/id/OIP.Jx29JUwdow8i7hZMK48QegHaHa?pid=ImgDet&rs=1"));
        albums.add(new Album("Album 3", "Adele", 8, 2800, "https://th.bing.com/th/id/R.1f8b5a5c03c298653b75f39fa0bae1a2?rik=beXxjic4XroAJA&riu=http%3a%2f%2fskirtpr.com%2fblog%2fwp-content%2fuploads%2fadele-someone-like-you-album-cover.jpg&ehk=9Bk7weABlwva215QWuoYzF4rus1TbcCacA34SPePp3Y%3d&risl=&pid=ImgRaw&r=0"));
        model.addAttribute("albums", albums);

        return "albums.html";
    }
}

