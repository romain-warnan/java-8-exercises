package fr.insee.java8exercises.streams;

import java.util.List;
import static java.util.stream.Collectors.*;

public class Joining {

    private Joining() {
    }

    public static String namesToString(List<Person> people) {
        return people.stream()
        	.map(Person::getName)
        	.collect(joining(", ", "Names: ", "."));
    }
}
