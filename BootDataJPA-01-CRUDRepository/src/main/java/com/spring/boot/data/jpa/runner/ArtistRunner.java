package com.spring.boot.data.jpa.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.spring.boot.data.jpa.entity.Artist;
import com.spring.boot.data.jpa.service.IArtistService;

@Component
public class ArtistRunner implements CommandLineRunner {

	@Autowired
	private IArtistService iArtistService;

	@Override
	public void run(String... args) throws Exception {

//		try {
//			Artist artist = new Artist();
//			artist.setArtistName("Rumaesa");
//			artist.setAddress("Mumbai");
//			artist.setArtForm("Sketch");
//			String artistInserted = iArtistService.generateArtist(artist);
//			System.out.println(artistInserted);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		try {
//			Integer id = 1;
//			boolean artictisAvailability = iArtistService.isArtistAvailable(id);
//			System.out.println("Artist " + id + " available ? " + artictisAvailability);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

//		try {
//			long artictisCount= iArtistService.countAllArtist();
//			System.out.println("Available artists ? "+artictisCount);
//		}catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

//		try {
//			Iterable<Artist> allArtists = iArtistService.getAllTheArtists();
//			allArtists.forEach(System.out::println);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

//		try {
////			int[] ids = {1,2,105,200};
//			Iterable<Artist> allArtistsById = iArtistService.getAllArtistsById(List.of(1,102,252));
//			allArtistsById.forEach(System.out::println);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

/*	try {
			List<Artist> artists;
			Artist artist = new Artist();
			artist.setArtistName("Yash");
			artist.setAddress("Mulund");
			artist.setArtForm("Mimicry");
			artists.add(artist);

			Artist artist2 = new Artist();
			artist2.setArtistName("Rajesh");
			artist2.setAddress("Mulund");
			artist2.setArtForm("Singing");
			artists.add(artist2);

			Artist artist1 = new Artist("Lyba", "Mumbai", "Hafiz");
			Artist artist2 = new Artist("Sameer", "Jogeshwari", "Rider");
			Artist artist3 = new Artist("Alisha", "Mumbai", "Dabba");
			
			List<Artist> artistsToBeInserted = List.of(artist1,artist2,artist3);
			
			String generatedArtists = iArtistService.generateMultipleArtists(artistsToBeInserted);
			System.out.println(generatedArtists);

		} catch (Exception e) {
			e.printStackTrace();
		}
*/
		
		/*try {
			Artist artist = iArtistService.getArtistById(45);
			System.out.println(artist);
		}catch (Exception e) {
			e.printStackTrace();
		}
		*/
		/*
		 try {
		
			Artist artist = new Artist();
			artist.setArtistName("Sami");
			artist.setAddress("Jogeshwari");
			artist.setArtForm("Painting");
			artist.setArtitstId(502);
			String updateMessage = iArtistService.registerOrUpdateArtist(artist);
			System.out.println(updateMessage);
		}catch (Exception e) {
			e.printStackTrace();
		}
 */
		
	/*
		try {
			String updateMessage = iArtistService.updateArtistAddress(1, "Pune");
			System.out.println(updateMessage);
		}catch (Exception e) {
			e.printStackTrace();
		}
		*/
	
		/*
		 try {
			String removeMessage  = iArtistService.removeArtistById(102);
			System.out.println(removeMessage);
		}catch (Exception e) {
			e.printStackTrace();
		}
		*/
	
		/*
		try {
			Artist artristToRemove = new Artist(152,"Rumaesa","Mumbai","Sketch");
			String removeMessage  = iArtistService.removeArtist(artristToRemove);
			System.out.println(removeMessage);
		}catch (Exception e) {
			e.printStackTrace();
		}
		*/
		
		try {
			String removeAllMessage = iArtistService.removeAllArtists();
			System.out.println(removeAllMessage);
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}