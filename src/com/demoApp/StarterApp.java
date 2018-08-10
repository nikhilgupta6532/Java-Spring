package com.demoApp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import javax.swing.plaf.basic.BasicScrollPaneUI.HSBChangeListener;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;

public class StarterApp {

	public static void main(String[] args) {
		
		int i=0;
		String terminateCondition;
		
		Scanner scanner = new Scanner(System.in);
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("demoApp.xml");
		
		Anime newAnime = context.getBean("myAnime",Anime.class);
		
		
		
		HashMap<Integer,Anime> mapAnime = new HashMap<>();
		
		
		do {
			i++;
			
			System.out.println("\nEnter your choice");
			int n = scanner.nextInt();
			
			
			switch(n) {
				case 1:
					System.out.println("Please start adding the anime's");
					newAnime.addAnime();	
					mapAnime.put(i, newAnime);
					break;
					
				case 2:
					System.out.println("\nAnime list is\n");
					Set<Integer> keyAnime = mapAnime.keySet();
					
					Iterator<Integer> mapItr = keyAnime.iterator();
					
					while(mapItr.hasNext()) {
						System.out.println(mapAnime.get(mapItr.next()));
					}
					break;
			}
			
			System.out.println("\nDo you wants to continue? yes or no ");
			terminateCondition = scanner.next();
		}while(terminateCondition.equals("yes"));
		
		System.out.println("your program is terminated");
		
		
		context.close();
	}

}
