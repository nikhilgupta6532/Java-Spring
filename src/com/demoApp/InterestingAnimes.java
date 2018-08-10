package com.demoApp;

import java.util.HashMap;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicScrollPaneUI.HSBChangeListener;

public class InterestingAnimes implements Anime {

	private String animeName;
	private Double animeRating;

	public Double getAnimeRating() {
		return animeRating;
	}

	public String getAnimeName() {
		return animeName;
	}

	public void setAnimeName(String animeName) {
		this.animeName = animeName;
	}

	public void setAnimeRating(Double animeRating) {
		this.animeRating = animeRating;
	}

	@Override
	public void addAnime() {
		Scanner scanner = new Scanner(System.in);
			
			System.out.println("\n Enter the name of anime: ");
			setAnimeName(scanner.next());

			System.out.println("\n Enter the rating for anime: ");
			setAnimeRating(scanner.nextDouble());

	}
	
	public void getOptions () {
		System.out.println("\nEnter your choice");
		
		System.out.println("\nPress 1 for adding an Anime");
		System.out.println("Press 2 for display the anime's");
	}
	
	@Override
	public String toString() {
		return "Name: "+animeName+ " Rating is: "+animeRating;
	}


}
