package fr.insee.java8exercises.streams;

import org.junit.Test;

import fr.insee.java8exercises.streams.Person;

import java.util.List;

import static fr.insee.java8exercises.streams.OldestPerson.*;
import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class OldestPersonSpec {

    @Test
    public void shouldReturnOldestPerson() {
        Person sara = new Person("Sara", 4);
        Person viktor = new Person("Viktor", 40);
        Person eva = new Person("Eva", 42);
        List<Person> collection = asList(sara, eva, viktor);
        assertThat(oldestPerson(collection)).isEqualToComparingFieldByField(eva);
    }

}
