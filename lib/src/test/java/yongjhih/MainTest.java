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

    @Test public void testZero() {
        assertThat(Main.func(0)).isEqualTo("0");
    }

    @SuppressWarnings("CheckReturnValue")
    @Test
    public void testBounds() {
        Main.func(Integer.MAX_VALUE);
        Main.func(Integer.MIN_VALUE);
        // No exception throws
    }

    @Test public void testNegative() {
        assertThat(Main.func(-1)).isEqualTo("-1");
        assertThat(Main.func(-3)).isEqualTo("-3");
        assertThat(Main.func(-5)).isEqualTo("-5");
        assertThat(Main.func(-15)).isEqualTo("-15");
    }

    @Test public void testNewMain() {
        assertThat(new Main()).isNotNull();
    }

    @Test public void testPrint() {
        Main.main(null);
        // No exception throws
    }
}
