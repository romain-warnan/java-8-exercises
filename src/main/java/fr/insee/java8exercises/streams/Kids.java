package fr.insee.java8exercises.streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Kids {

    public static Set<String> kidsNames(List<Person> people) {
        return people.stream()
        	.filter(Kids::isKid)
        	.map(Person::getName)
        	.collect(Collectors.toSet());
    }

	public static boolean isKid(Person person) {
		return person.getAge() < 18;
	}

	public static boolean isAdult(Person person) {
		return !isKid(person);
	}
}
