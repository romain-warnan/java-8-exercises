package fr.insee.java8exercises.streams;

import java.util.List;

public class PeopleStats {

    private PeopleStats() {
    }

    public static Stats calculateStats(List<Person> people) {
        int sum = people.stream().mapToInt(Person::getAge).sum();
        int min = people.stream().mapToInt(Person::getAge).min().getAsInt();
        int max = people.stream().mapToInt(Person::getAge).max().getAsInt();
        return new Stats(people.size(), sum, min, max);
    }
}
