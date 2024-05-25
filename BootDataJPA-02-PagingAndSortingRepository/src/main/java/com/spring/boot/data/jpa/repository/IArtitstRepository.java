package com.spring.boot.data.jpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.spring.boot.data.jpa.entity.Artist;

public interface IArtitstRepository extends CrudRepository<Artist, Integer>, PagingAndSortingRepository<Artist, Integer> {

}
