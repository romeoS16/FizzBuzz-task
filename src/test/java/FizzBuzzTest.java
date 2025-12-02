import de.ba.experiment.FizzBuzz;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class FizzBuzzTest {

    // In dieser Gruppe arbeiten Sie mit TDD und dürfen zusätzlich KI nutzen.
    // Wichtig: Schreiben Sie zuerst eigene Testfälle OHNE KI.
    // Bevor Sie eine KI um Hilfe bitten (siehe README und ki-log.md).

    @Test
    public void fizzBuzzOfOne_returnsArrayWithOne() {
        String[] result = FizzBuzz.fizzBuzz(1);
        assertArrayEquals(new String[]{"1"}, result);
    }

    // TODO: weitere Tests schreiben

}
