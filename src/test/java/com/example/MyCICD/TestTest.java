package com.example.MyCICD;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class TestTest {
    @Test
    public void test() {
        // given
        int a = 1;
        int b = 2;

        // when
        int c = a + b;

        // then
        assertThat(c).isEqualTo(3);
    }

}
