package fr.insee.java8exercises.streams;

import static java.util.Comparator.*;
import java.util.List;
import java.util.Map.Entry;
import static java.util.stream.Collectors.*;

public class MaxBy {

    private MaxBy() {
    }
    
	public static String mostFrequentNationality(List<Person> people) {
		return people.stream()
			.collect(groupingBy(Person::getNationality, counting()))
			.entrySet()
			.stream()
			.max(comparingLong(Entry::getValue))
			.map(Entry::getKey)
			.get();
	}
}
