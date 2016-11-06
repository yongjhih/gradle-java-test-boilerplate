package yongjhih;

/**
 *
 *	Print numbers from 1 to 100
 *
 *	if number is multiple of 5  -> replace the output with the word "fizz"
 *	if number is multiple of 3 -> replace the output with the word "buzz"
 *	if number is multiple of both -> replace the output with the word "fizzbuzz"
 *
 * Sample output:
 *	1
 *	2
 *	buzz
 *	4
 *	fizz
 * ...
 *
 **/
public class Main {
    public static String func(int i) {
        if (i <= 0) return String.valueOf(i);

        StringBuilder s = new StringBuilder();
        boolean b = false;

        // Optimized by concation of String, DO NOT change condition order until you understood that.
        // TODO Optimization of mod by DP
        if ((i % 5) == 0) {
            b = true;
            s.append("fizz");
        }
        if ((i % 3) == 0) {
            b = true;
            s.append("buzz");
        }
        if (!b) s.append(String.valueOf(i));

        return s.toString();
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println(func(i));
        }
    }
}
