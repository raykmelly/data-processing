package com.pluralsight.streams;

import com.pluralsight.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StreamProgram {
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

        List<Person> matches = people.stream()
                .filter(person -> person.getFirstName().equalsIgnoreCase(search)
                        || person.getLastName().equalsIgnoreCase(search))
                .toList();

        // Display the search result
        System.out.println("\n[MATCHED THE SEARCH]");
        for (Person person : matches) {
            System.out.println(person.getFirstName() + " " + person.getLastName());
        }

        // Calculate the average age
        double sum = 0;
        for (Person person : people) {
            sum += person.getAge();
        }

        double averageAge = sum / people.size();
        System.out.println("\n[AVERAGE AGE OF ALL PEOPLE]\n" + averageAge);

        // Search for oldest person
        Person oldestPerson = null;
        for (Person person : people) {
            if (oldestPerson == null) {
                oldestPerson = person;
            } else if (person.getAge() > oldestPerson.getAge()) {
                oldestPerson = person;
            }
        }

        // Display the oldest person
        System.out.println("\n[OLDEST PERSON]\n" +
                oldestPerson.getFirstName() + " " + oldestPerson.getLastName()
        );

        // Search for youngest person
        Person youngestPerson = null;
        for (Person person : people) {
            if (youngestPerson == null) {
                youngestPerson = person;
            } else if (person.getAge() < youngestPerson.getAge()) {
                youngestPerson = person;
            }
        }

        // Display the youngest person
        System.out.println("\n[YOUNGEST PERSON]\n" +
                youngestPerson.getFirstName() + " " + youngestPerson.getLastName()
        );

        scanner.close();
    }
}
