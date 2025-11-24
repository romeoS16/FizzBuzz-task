import de.ba.experiment.FizzBuzz;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class FizzBuzzTest {

    // In dieser Gruppe nutzen Sie das test-after-Prinzip:
    // 1. Implementieren Sie zuerst FizzBuzz.fizzBuzz(int n).
    // 2. Schreiben Sie danach eigene Tests für typische Fälle und Randfälle.

    @Test
    public void fizzBuzzOfOne_returnsArrayWithOne() {
        String[] result = FizzBuzz.fizzBuzz(1);
        assertArrayEquals(new String[]{"1"}, result);
    }

    // TODO: weitere Tests schreiben

}
