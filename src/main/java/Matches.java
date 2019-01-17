import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class Matches {
    public static int matches(int n) {
        if (n == 0) return 0;
        if (n < 0) throw new IllegalArgumentException("Input should be a positive integer");

        //to minimise amount of matches, we need to build a rectangle with shape as close as possible to a square
        //then, one of the sides of rectangle will be equal a square root of n
        int sideA = (int) Math.ceil(Math.sqrt(n));

        //if a figure is not a perfect square, we need to know second side too
        //knowing that area of a rectangle equals n, we can find side B by n / side A
        int sideB = (int) Math.ceil((double) n / sideA);

        //knowing amount of matches needed to build two sides of a figure, we can add missing matches, two for each square
        int missingMatches = 2 * n;

        //then the result will be a sum of matches, needed to build sides plus missing matches
        int matchesAmount = sideA + sideB + missingMatches;

        return matchesAmount;
    }


    @Test
    public void matches() {
        assertThat(Matches.matches(0), equalTo(0));
        assertThat(Matches.matches(1), equalTo(4));
        assertThat(Matches.matches(2), equalTo(7));
        assertThat(Matches.matches(3), equalTo(10));
        assertThat(Matches.matches(4), equalTo(12));
        assertThat(Matches.matches(5), equalTo(15));
        assertThat(Matches.matches(6), equalTo(17));
        assertThat(Matches.matches(7), equalTo(20));
        assertThat(Matches.matches(8), equalTo(22));
        assertThat(Matches.matches(24), equalTo(58));
    }

    @Test(expected = IllegalArgumentException.class)
    public void matchesException() {
        Matches.matches(-5);
    }
}
