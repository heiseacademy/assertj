package com.github.sparsick.heise.assertj;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.util.Lists.list;


public class AssertJTest {



//    Different ways of checking iterables/arrays content

    @Test
    void contentChecking(){
        List<String> heroNames = list("Wonder Woman", "Batman");

        assertThat(heroNames).contains("Batman")
                .containsOnly("Wonder woman", "");
    }
//
//    Running assertions on some elements (any, all, none)
//
//    Navigating to a given element to check it
//
//    Filtering elements before asserting]
//
//    Extracting/mapping elements before asserting
//
//    Comparing elements with a specific comparator



    @Test
    void collectionSample(){
    }
}
