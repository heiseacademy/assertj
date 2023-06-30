package com.github.sparsick.heise.assertj;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assumptions.assumeThat;


public class AssertJTest {


    @Test
    void assumptionWithAssert() {
        String message = null;
        assumeThat(message).isNotNull();

        message = "Hello Space";

        assertThat(message).isEqualTo("Hello Space");
    }








}
