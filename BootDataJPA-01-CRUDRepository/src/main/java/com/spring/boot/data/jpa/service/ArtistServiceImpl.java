package com.spring.boot.data.jpa.service;

import java.util.List;
import java.util.Optional;

import org.aspectj.weaver.reflect.IReflectionWorld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.data.jpa.entity.Artist;
import com.spring.boot.data.jpa.repository.IArtitstRepository;

@Service
public class ArtistServiceImpl implements IArtistService {

	@Autowired
	private IArtitstRepository iArtitstRepository;

	@Override
	public String generateArtist(Artist artist) {
//		artist.setArtistName("Rumaesa");
//		artist.setAddress("Mumbai");
//		artist.setArtForm("Sketch");
		Artist artistt = iArtitstRepository.save(artist);
		return "Artist's data has been inserted with ID :" + artistt.getArtitstId();
	}

	@Override
	public boolean isArtistAvailable(Integer id) {

		return iArtitstRepository.existsById(id);
	}

	@Override
	public long countAllArtist() {
		return iArtitstRepository.count();
	}

	@Override
	public Iterable<Artist> getAllTheArtists() {
		Iterable<Artist> allArtists = iArtitstRepository.findAll();
		return allArtists;
	}

	@Override
	public Iterable<Artist> getAllArtistsById(Iterable<Integer> ids) {
		Iterable<Artist> allArtistsById = iArtitstRepository.findAllById(ids);
		return allArtistsById;
	}

	@Override
	public String generateMultipleArtists(List<Artist> artists) {
		Iterable<Artist> insertedArtists = iArtitstRepository.saveAll(artists);
//		Iterable<Integer> artistsIds = insertedArtists.forEach(artist -> artist.getArtitstId() );
//		insertedArtists.forEach(artists.get);
		List<Integer> idsInserted = null;
//		for(int i= 0;i<=insertedArtists.)
//		List<Integer> insertedIds = insertedArtists.forEach(artistss -> ((Artist) artists).getArtitstId());
		return artists.size() + " Artists has been registered..";
	}

	/*
	 * @Override public Artist getArtistById(Integer id) { return
	 * iArtitstRepository.findById(id).orElseThrow(() -> new
	 * IllegalArgumentException("Invalid Artist Id")); }
	 */

	/*
	 * @Override public Artist getArtistById(Integer id) { Optional<Artist> artist =
	 * iArtitstRepository.findById(id); if(artist.isPresent()) { return
	 * artist.get(); } else { throw new IllegalArgumentException("Invalid ID"); }
	 * 
	 * }
	 */

	@Override
	public Artist getArtistById(Integer id) {
		Artist dummyArtist = new Artist();
		dummyArtist.setAddress("In House Artist");
		dummyArtist.setArtistName("");
		Artist artist = iArtitstRepository.findById(id).orElse(dummyArtist);
		return artist;
	}

	@Override
	public String registerOrUpdateArtist(Artist artist) {
		Optional<Artist> checkArtist = iArtitstRepository.findById(artist.getArtitstId());
		if (checkArtist.isPresent()) {
			iArtitstRepository.save(artist);
			return "Information of Artist " + artist.getArtitstId() + " is updated";
		} else {
			Artist newArtist = iArtitstRepository.save(artist);
			return "New artist registered with id " + newArtist.getArtitstId();
		}
	}

	@Override
	public String updateArtistAddress(Integer id, String newAddress) {
		Optional<Artist> artistAvailable = iArtitstRepository.findById(id);
		if (artistAvailable.isPresent()) {
			Artist artist = artistAvailable.get();
			artist.setAddress(newAddress);
			iArtitstRepository.save(artist);
			return artist.getArtitstId() + " update...";
		} else {
			return "There is no artist available with id " + id;
		}
	}

	@Override
	public String removeArtistById(Integer id) {
		Optional<Artist> findArtist = iArtitstRepository.findById(id);
		if (findArtist.isPresent()) {
			iArtitstRepository.deleteById(id);
			return "Artist " + id + " is deleted.";
		} else {
			return "Artist " + id + " is not found for deletion.";
		}
	}

	@Override
	public String removeArtist(Artist artist) {
		Optional<Artist> checkArtitst = iArtitstRepository.findById(artist.getArtitstId());
		if (checkArtitst.isPresent()) {
			iArtitstRepository.delete(artist);
			;
			return "Artist " + artist.getArtitstId() + " is deleted.";
		} else {
			return "Artist " + artist.getArtitstId() + " is not found for deletion.";
		}
	}

	@Override
	public String removeAllArtists() {
		long count  = iArtitstRepository.count();
		iArtitstRepository.deleteAll();
		return count + " Artists have been removed";
	}
}
