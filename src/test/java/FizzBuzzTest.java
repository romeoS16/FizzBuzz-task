import de.ba.experiment.FizzBuzz;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @Test
    public void fizzBuzzOfOne_returnsArrayWithOne() {
        String[] result = FizzBuzz.fizzBuzz(1);
        assertArrayEquals(new String[]{"1"}, result);
    }

    @Test
    public void fizzBuzzOfThree_containsFizzAtPositionThree() {
        String[] result = FizzBuzz.fizzBuzz(3);
        assertArrayEquals(new String[]{"1", "2", "Fizz"}, result);
    }

    @Test
    public void fizzBuzzOfFive_containsFizzAndBuzz() {
        String[] result = FizzBuzz.fizzBuzz(5);
        assertArrayEquals(new String[]{"1", "2", "Fizz", "4", "Buzz"}, result);
    }

    @Test
    public void fizzBuzzOfFifteen_containsFizzBuzzAtPositionFifteen() {
        String[] result = FizzBuzz.fizzBuzz(15);
        assertEquals("FizzBuzz", result[14]); // 15 ist an Index 14
    }

    @Test (expected = IllegalArgumentException.class)
    public void negativNumber_throwsIllegalArgumentException() {
        FizzBuzz.fizzBuzz(-1);
    }

//    Ohne Exception
//    @Test
//    public void negativNumber_throwsIllegalArgumentException2() {
//        String[] result = FizzBuzz.fizzBuzz(-1);
//        assertEquals(0, result.length);
//    }

}
