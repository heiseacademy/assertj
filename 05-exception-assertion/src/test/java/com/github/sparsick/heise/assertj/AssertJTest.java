package com.github.sparsick.heise.assertj;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.assertj.core.api.Assertions.assertThatNullPointerException;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.catchThrowable;


public class AssertJTest {


    @Test
    void exceptionBasic() {
        Throwable throwable = catchThrowable(() -> new Exception("Boom"));
        assertThat(throwable).isInstanceOf(Exception.class)
                .hasMessage("Boom")
                .hasCause(new NullPointerException())
                .hasRootCause(new IndexOutOfBoundsException());

    }

    @Test
    void exceptionBasic2() {
        assertThatThrownBy(() -> new Exception("Boom")).isInstanceOf(Exception.class);
    }

    @Test
    void exceptionBasic3() {
        assertThatExceptionOfType(Exception.class).isThrownBy(() -> new Exception("Boom"));

        // assertThatNullPointerException()
    }

    @Test
    void exceptionBasic4() {
        assertThatCode(() -> System.out.println()).doesNotThrowAnyException();
    }






}
