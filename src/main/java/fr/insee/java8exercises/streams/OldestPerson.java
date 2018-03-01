package fr.insee.java8exercises.streams;

import static java.util.Comparator.*;
import java.util.List;

public class OldestPerson {

    public static Person oldestPerson(List<Person> people) {
        return people.stream()
        	.max(comparingInt(Person::getAge))
        	.get();
    }
}
