package fr.insee.java8exercises.streams;

import java.util.Comparator;
import java.util.List;

public class OldestPerson {

    public static Person oldestPerson(List<Person> people) {
        return people.stream()
        	.max(Comparator.comparingInt(Person::getAge))
        	.get();
    }
}
