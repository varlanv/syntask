import org.junit.Test;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class Factorial {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int result = 1;
        for (int k = 1; ; k++) {
            result *= k;
            if (result == n) {
                return k;
            } else if (result <= 0) throw new IllegalArgumentException(n + " is not valid factorial value");
        }
    }

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
