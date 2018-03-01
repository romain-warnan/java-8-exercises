package fr.insee.java8exercises.streams;

import java.util.List;
import java.util.Map;
import static java.util.stream.Collectors.*;

public class Grouping {

    private Grouping() {
    }

    public static Map<String, List<Person>> groupByNationality(List<Person> people) {
        return people.stream().collect(groupingBy(Person::getNationality));
    }
}
