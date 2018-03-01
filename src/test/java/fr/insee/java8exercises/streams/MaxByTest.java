package fr.insee.java8exercises.streams;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;
import static fr.insee.java8exercises.streams.MaxBy.mostFrequentNationality;

import java.util.List;

import org.junit.Test;

public class MaxByTest {

    @Test
    public void shouldReturnMostFrequentNationality() {
        Person sara = new Person("Sara", 4, "Norwegian");
        Person viktor = new Person("Viktor", 40, "Serbian");
        Person eva = new Person("Eva", 42, "Norwegian");
        Person pierre = new Person("Pierre", 42, "Serbian");
        Person paul = new Person("Paul", 42, "Norwegian");
        Person jean = new Person("Jean", 42, "French");
        List<Person> people = asList(sara, eva, viktor, pierre, paul, jean);
        String result = mostFrequentNationality(people);
        assertThat(result).isEqualTo("Norwegian");
    }
}
