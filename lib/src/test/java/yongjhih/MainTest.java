package yongjhih;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class MainTest {
    @Test public void testCommonFactor() {
        assertThat(Main.func(15)).isEqualTo("fizzbuzz");
    }

    @Test public void testFizz() {
        assertThat(Main.func(3)).isEqualTo("buzz");
    }

    @Test public void testBuzz() {
        assertThat(Main.func(5)).isEqualTo("fizz");
    }

    @Test public void testNumber() {
        assertThat(Main.func(1)).isEqualTo("1");
    }

    @Test public void testBounds() {
        assertThat(Main.func(0)).isEqualTo("0");
        assertThat(Main.func(-1)).isEqualTo("-1");
        assertThat(Main.func(-3)).isEqualTo("-3");
        assertThat(Main.func(-5)).isEqualTo("-5");
    }
}
