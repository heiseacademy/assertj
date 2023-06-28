package com.github.sparsick.heise.assertj;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class AssertJTest {


    @Test
    void description() {
        String message = "Hello World";
        assertThat(message).as("check message").isNull();
    }

    @Test
    void errorMessage() {
        String message = "Hello World";
//        assertThat(message).overridingErrorMessage("message is not null").isNull();
        assertThat(message).withFailMessage("message is not null").isNull();
    }

    @Test
    void lazyErrorMessage() {
        String message = "Hello World";
//        assertThat(message).overridingErrorMessage(() -> "message is not null").isNull();
        assertThat(message).withFailMessage(() -> "message is not null").isNull();
    }







}
