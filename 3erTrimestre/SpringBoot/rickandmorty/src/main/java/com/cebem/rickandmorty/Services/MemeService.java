package com.cebem.rickandmorty.Services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.cebem.rickandmorty.Repositories.MemeRepository;
import com.cebem.rickandmorty.models.MemeModel;

@Service
public class MemeService {
    MemeRepository memeRepository;

    public ArrayList<MemeModel> getAllMemes() {
        return (ArrayList<MemeModel>) memeRepository.findAll();

    }

    public MemeModel createMeme(MemeModel meme) {
        return memeRepository.save(meme);

    }
}
