package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@SpringBootApplication
public class Demo1Application {


    public static void main(String[] args) {
        List<Personne> personnes = new ArrayList<>(); // Initialize the list
        Personne personne1 = new Personne("Alice", "Johnson", 25);
        Personne personne2 = new Personne("Bob", "Smith", 25);
        Personne personne3 = new Personne("Charlie", "Brown", 25);
        Personne personne4 = new Personne("David", "Williams", 26);
        Personne personne5 = new Personne("Eva", "Davis", 26);
        Personne personne6 = new Personne("Frank", "Miller", 26);
        Personne personne7 = new Personne("Grace", "Taylor", 28);
        Personne personne8 = new Personne("Hank", "Johnson", 28);
        Personne personne9 = new Personne("Ivy", "Smith", 28);
        Personne personne10 = new Personne("Jack", "Brown", 29);
        personnes.add(personne1);
        personnes.add(personne2);
        personnes.add(personne3);
        personnes.add(personne4);
        personnes.add(personne5);
        personnes.add(personne6);
        personnes.add(personne7);
        personnes.add(personne8);
        personnes.add(personne9);
        personnes.add(personne10);

        Map<Integer, List<Personne>> sortedAndGroupedByAge = personnes.stream().sorted(((o1, o2) -> o1.getPrenom().compareToIgnoreCase(o2.getPrenom()))).collect(Collectors.groupingBy(Personne::getAge));

        sortedAndGroupedByAge.forEach((key, value) -> {
            System.out.println("Age : " + key);
            value.forEach(System.out::println);
            System.out.println("---------");
        });

        SpringApplication.run(Demo1Application.class, args);
    }

}
