import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class MatchesTest {
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