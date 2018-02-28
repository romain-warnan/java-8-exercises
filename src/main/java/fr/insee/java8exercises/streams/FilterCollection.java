package fr.insee.java8exercises.streams;

import java.util.List;
import java.util.stream.Collectors;

public class FilterCollection {

    private FilterCollection() {
    }

    public static List<String> stringsShorterThan4Characters(List<String> collection) {
        return collection.stream()
        	.filter(s -> s.length() < 4)
        	.collect(Collectors.toList());
    }
}
