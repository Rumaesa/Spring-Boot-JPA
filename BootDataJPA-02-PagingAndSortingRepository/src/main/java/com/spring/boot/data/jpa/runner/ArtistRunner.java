package com.spring.boot.data.jpa.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.spring.boot.data.jpa.entity.Artist;
import com.spring.boot.data.jpa.service.IArtistService;

@Component
public class ArtistRunner implements CommandLineRunner {

	@Autowired
	private IArtistService iArtistService;

	@Override
	public void run(String... args) throws Exception {
		try {
			Iterable<Artist> sortedArtistsByName =  iArtistService.showSortedArtists(true, "artistName");
//			sortedArtistsByName.forEach(System.out::println);
			System.out.println("-------------------------------------");
			Iterable<Artist> sortedArtistsByNameAndId =  iArtistService.showSortedArtists(true, "artistName","artForm");
//			sortedArtistsByNameAndId.forEach(System.out::println);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			Page<Artist> artistsPage = iArtistService.showArtistsByPageNo(1, 2);
//			artistsPage.forEach(System.out::println);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			Page<Artist> artistsPage = iArtistService.showSortedArtistsByPageNo(0,3,false,"artistName");
//			artistsPage.forEach(System.out::println);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			iArtistService.showArtistsDataPageByPage(2);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}