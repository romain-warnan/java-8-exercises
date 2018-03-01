package fr.insee.java8exercises.streams;

import java.util.IntSummaryStatistics;
import java.util.List;

public class PeopleStats {

    private PeopleStats() {
    }

    public static Stats calculateStats(List<Person> people) {
        IntSummaryStatistics stat = people.stream()
        		.mapToInt(Person::getAge)
        		.summaryStatistics();
        return new Stats(stat.getCount(), stat.getSum(), stat.getMin(), stat.getMax());
    }
}
