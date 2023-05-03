package com.cebem.rickandmorty.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cebem.rickandmorty.models.MemeModel;

@Repository
public interface MemeRepository extends CrudRepository<MemeModel, Long> {

}
