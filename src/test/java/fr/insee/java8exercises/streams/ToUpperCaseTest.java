package fr.insee.java8exercises.streams;

import org.junit.Test;

import java.util.List;

import static fr.insee.java8exercises.streams.ToUpperCase.*;
import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class ToUpperCaseTest {

    @Test
    public void shouldConvertCollectionElementsToUpperCase() {
        List<String> collection = asList("My", "name", "is", "John", "Doe");
        List<String> expected = asList("MY", "NAME", "IS", "JOHN", "DOE");
        assertThat(toUpperCase(collection)).hasSameElementsAs(expected);
    }

}
