package com.github.sparsick.heise.assertj;

import org.assertj.core.groups.Tuple;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.as;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.in;
import static org.assertj.core.api.Assertions.tuple;
import static org.assertj.core.api.InstanceOfAssertFactories.STRING;
import static org.assertj.core.util.Lists.list;


public class AssertJTest {


    @Test
    void contentChecking() {
        List<String> heroNames = list("Wonder Woman", "Batman");

        assertThat(heroNames).hasSize(2).contains("Batman");
    }

    @Test
    void contentObjectChecking() {
        List<Hero> heros = list(new Hero("Wonder Woman", "London", ComicUniversum.DC_COMICS), new Hero("Iron Man", "New York", ComicUniversum.MARVEL));

        assertThat(heros).hasSize(2).extracting("universum")
                .containsOnly(ComicUniversum.DC_COMICS, ComicUniversum.MARVEL);
        assertThat(heros).hasSize(2).extracting("universum", "name")
                .containsOnly( tuple(ComicUniversum.DC_COMICS, "Wonder Woman"), tuple(ComicUniversum.MARVEL, "Iron Man"));
        assertThat(heros).filteredOn("universum", in(ComicUniversum.DC_COMICS)).hasSize(1);
    }

    @Test
    void contentMapChecking() {
        Map<String, String> heros = Collections.singletonMap("name", "Wonder Woman");

        assertThat(heros).hasSize(1).containsKey("name");
    }

}
