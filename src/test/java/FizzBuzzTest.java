import de.ba.experiment.FizzBuzz;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class FizzBuzzTest {

    @Test
    public void fizzBuzzOfOne_returnsArrayWithOne() {
        String[] result = FizzBuzz.fizzBuzz(1);
        assertArrayEquals(new String[]{"1"}, result);
    }

    // TODO: weitere Tests schreiben

}
