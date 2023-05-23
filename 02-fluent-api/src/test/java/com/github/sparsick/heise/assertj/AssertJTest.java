package com.github.sparsick.heise.assertj;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.assertThat;


public class AssertJTest {

    @Test
    void hamcrestSample() {
        MatcherAssert.assertThat("Hello World",
                Matchers.allOf(Matchers.equalTo("Hello World"), Matchers.containsString("Hello")));
    }

    @Test
    void assertJSample(){
        assertThat("Hello World")
                .isEqualTo("Hello World")
                .contains("Hello");
    }
}
