package com.github.sparsick.heise.assertj;

import org.assertj.core.data.Percentage;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class AssertJTest {

    @Test
    void assertionForPrimitives() {
        double number = 10.0;

        assertThat(number).describedAs("number should be closed to 10.1").isPositive().isCloseTo(10.1, Percentage.withPercentage(1));
    }

    @Test
    void assertionForString(){
        String value = "Hello World";

        assertThat(value).describedAs("value should have Hello").containsWhitespaces().contains("Hello");
    }

    @Test
    void assertionForObject(){
        var hero = new Hero("Batman", "Gotham", ComicUniversum.DC_COMICS);

        assertThat(hero).isInstanceOf(Hero.class)
                .hasFieldOrPropertyWithValue("name", "Batman")
                .hasFieldOrPropertyWithValue("city", "Gotham")
                .extracting("universum").isEqualTo(ComicUniversum.DC_COMICS);
    }





}
