package com.spring.boot.data.jpa.service;

import java.util.List;

import com.spring.boot.data.jpa.entity.Artist;

public interface IArtistService {
	
	public String generateArtist(Artist artist); 
	public boolean isArtistAvailable(Integer id);
	public long countAllArtist();
	public Iterable<Artist> getAllTheArtists();
	public Iterable<Artist> getAllArtistsById(Iterable<Integer> ids);
	public String generateMultipleArtists(List<Artist> artists);
	public Artist getArtistById(Integer id);
	public String registerOrUpdateArtist(Artist artist);
	public String updateArtistAddress(Integer id, String newAddress);
	public String removeArtistById(Integer id);
	public String removeArtist(Artist artist);
	public String removeAllArtists();
}
