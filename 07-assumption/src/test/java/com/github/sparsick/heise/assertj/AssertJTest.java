package com.github.sparsick.heise.assertj;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class AssertJTest {


    @Test
    void assumptionWithAssert() {
        String message = "Hello World";
        assertThat(message).isNotNull();

        message = "Hello Space";

        assertThat(message).isEqualTo("Hello Space");
    }








}
