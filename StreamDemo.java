package com.collabera.streamdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		
		List<Professor> professors = new ArrayList<Professor>();
		
		professors.add(new Professor ("Minerva", "McGonnagal", "Transfiguration", "Gryffindor"));
		professors.add(new Professor ("Quirinis", "Quirrel", "Defense Against the Dark Arts","Ravenclaw"));
		professors.add(new Professor ("Severus", "Snape", "Potions", "Slytherin"));
		professors.add(new Professor ("Gilderoy", "Lockhart", "Defense Against the Dark Arts", "Ravenclaw"));
		professors.add(new Professor ("Pomona", "Sprout", "Herbology", "Hufflepuff"));
		professors.add(new Professor ("Filius", "Flitwick", "Charms", "Ravenclaw"));
		professors.add(new Professor ("Remus", "Lupin", "Defense Against the Dark Arts", "Gryffindor"));
		professors.add(new Professor ("Sybill", "Trelawney", "Divination", "Ravenclaw"));
		professors.add(new Professor ("Rubeus", "Hagrid", "Care of Magical Creatures", "Gryffindor"));
				
		Professor d1 = professors.stream()
				.filter(prof -> prof.getSubject().equals("Defense Against the Dark Arts"))
				.findFirst()
				.orElse(null);
		
		System.out.println("The first DADA Professor Was: " + d1.getfName() + " " + d1.getlName());
		System.out.println("-----");
		
		Professor h1 = professors.stream()
				.filter(prof -> prof.getHouse().equals("Gryffindor"))
				.findAny()
				.orElse(null);
	
		System.out.println(h1.getfName() + " " + h1.getlName()  + " attended Gryffindor house when they were a student.");
		System.out.println("-----");
		
		Long count = professors.stream()
				.collect(Collectors.counting());
		
		System.out.println("There are " + count + " professors at Hogwarts.");
		System.out.println("-----");

		String allSubjects = professors.stream()
				.map(Professor::getSubject)
				.distinct()
				.reduce((s1, s2) -> s1 + ", " + s2)
				.get();
		System.out.println("Subjects offered at Hogwarts include: " + allSubjects);
		System.out.println("-----");
		
		
		String allHouses = professors.stream()
				.map(Professor::getHouse)
				.distinct()
				.reduce((s1, s2) -> s1 + ", " + s2)
				.get();
		
		System.out.println(allHouses);
		System.out.println("-----");
		
		professors.stream()
		.filter((p) -> p.getHouse().startsWith("G"))
        .forEach(System.out::println);
		System.out.println("-----");
		
		professors.stream()
		.limit(4)
		.forEach(System.out::println);

		
		
	}
}
