package fr.insee.java8exercises.streams;

import org.junit.Test;

import java.util.List;

import static fr.insee.java8exercises.streams.FilterCollection.*;
import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class FilterCollectionTest {

    @Test
    public void shouldKeepStringsShorterThant4Characters() {
        List<String> collection = asList("My", "name", "is", "John", "Doe");
        List<String> expected = asList("My", "is", "Doe");
        assertThat(stringsShorterThan4Characters(collection)).hasSameElementsAs(expected);
    }

}
