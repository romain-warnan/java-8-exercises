package fr.insee.java8exercises.streams;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

public class MaxBy {

    private MaxBy() {
    }
    
	public static String mostFrequentNationality(List<Person> people) {
		Map<String, Integer> map = new HashMap<>();
		for (Person person : people) {
			String nationality = person.getNationality();
			Integer count = Optional.ofNullable(map.get(nationality)).orElse(0);
			map.put(nationality, count + 1);
		}
		int max = 0;
		String mostFrequentNationality = null;
		for (Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() > max) {
				max = entry.getValue();
				mostFrequentNationality = entry.getKey();
			}
		}
		return mostFrequentNationality;
	}
}
