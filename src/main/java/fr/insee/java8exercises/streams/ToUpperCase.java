package fr.insee.java8exercises.streams;

import java.util.List;
import static java.util.stream.Collectors.*;

public class ToUpperCase {

    private ToUpperCase() {
    }

    public static List<String> toUpperCase(List<String> collection) {
        return collection.stream()
        	.map(String::toUpperCase)
        	.collect(toList());
    }
}
