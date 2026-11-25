package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // List of 10 people
        List<Person> people = new ArrayList<>();
        people.add(new Person("Ray","Melly",26));
        people.add(new Person("John","Doe",35));
        people.add(new Person("Jane","Doe",30));
        people.add(new Person("Mark","Hill",20));
        people.add(new Person("Bill","Gates",65));
        people.add(new Person("Jim","Cane",17));
        people.add(new Person("Malik","Brown",26));
        people.add(new Person("Andre","White",8));
        people.add(new Person("Will","Smith",45));

        // Search for person, by first or last
        System.out.print("-> Enter a first or last name to search: ");
        String search = scanner.nextLine();

        List<Person> matches = new ArrayList<>();
        for (Person person : people) {
            // Check if search is the same as first or last name
            if (person.getFirstName().equalsIgnoreCase(search) ||
                    person.getLastName().equalsIgnoreCase(search)) {
                matches.add(person);
            }
        }

        // Display the search result
        System.out.println("[MATCHED THE SEARCH]");
        for (Person person : matches) {
            System.out.println(person.getFirstName() + " " + person.getLastName());
        }

        // Calculate the average age

        scanner.close();
    }
}