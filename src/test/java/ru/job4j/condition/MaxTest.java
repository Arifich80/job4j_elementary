package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax5To3Then5() {
        int left = 5;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax6To6Then6() {
        int left = 6;
        int right = 6;
        int result = Max.max(left, right);
        int expected = 6;
        assertThat(result).isEqualTo(expected);

    }

    @Test
    public void whenMax3To1To2Then3() {
        int left = 1;
        int right = 2;
        int third = 3;
        int result = Math.max(left, right) > third ? Math.max(left, right) : third;
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax5To1To2To3Then5() {
        int left = 1;
        int right = 2;
        int third = 3;
        int fourth = 5;
        int result = Math.max(Math.max(left, right), third) > fourth ? Math.max(Math.max(left, right), third) : fourth;
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }
}