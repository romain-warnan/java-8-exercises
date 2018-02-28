package fr.insee.java8exercises.streams;

import java.util.List;

public class Sum {

    private Sum() {
    }

    public static int calculateSum(List<Integer> numbers) {
        return numbers.stream().mapToInt(Integer::intValue).sum();
    }
}
