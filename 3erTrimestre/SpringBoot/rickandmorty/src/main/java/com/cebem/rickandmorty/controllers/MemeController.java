package com.cebem.rickandmorty.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cebem.rickandmorty.Services.MemeService;
import com.cebem.rickandmorty.models.MemeModel;

@Controller
public class MemeController {

    @Autowired
    MemeService memeService;

    @RequestMapping("/memes")
    public String memes() {
        ArrayList<MemeModel> memes = memeService.getAllMemes();
        String html = "";
        for (MemeModel meme : memes) {
            html += meme.getDescription();
            html += "<br/>";
            html += "<img src='" + meme.getUrl() + "'>";
            html += "<hr/>";
        }

        return html;
    }
}
