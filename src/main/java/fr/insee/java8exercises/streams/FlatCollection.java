package fr.insee.java8exercises.streams;

import java.util.Collection;
import java.util.List;
import static java.util.stream.Collectors.*;

public class FlatCollection {

    private FlatCollection() {
    }

    public static List<String> flattenCollection(List<List<String>> collection) {
        return collection.stream()
        	.flatMap(Collection::stream)
        	.collect(toList());
    }
}
