import org.hamcrest.Matchers;
import org.junit.Test;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void factorial() {
        assertThat(Factorial.factorial(0), equalTo(1));
        assertThat(Factorial.factorial(1), equalTo(1));
        assertThat(Factorial.factorial(120), equalTo(5));
        assertThat(Factorial.factorial(5040), equalTo(7));
        assertThat(Factorial.factorial(1932053504), equalTo(13));
    }

    @Test(expected = IllegalArgumentException.class)
    public void factorialException() {
        Factorial.factorial(-5);
    }
}