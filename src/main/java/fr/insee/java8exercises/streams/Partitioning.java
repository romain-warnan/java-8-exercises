package fr.insee.java8exercises.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Partitioning {

    private Partitioning() {
    }

    public static Map<Boolean, List<Person>> partitionAdults(List<Person> people) {
        return people.stream()
        	.collect(Collectors.partitioningBy(Kids::isAdult));
    }
}
