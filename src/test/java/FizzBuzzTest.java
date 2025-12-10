import de.ba.experiment.FizzBuzz;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    // Vorgegebener Fall
    @Test
    public void fizzBuzzOfOne_returnsArrayWithOne() {
        String[] result = FizzBuzz.fizzBuzz(1);
        assertArrayEquals(new String[]{"1"}, result);
    }

    // A: n <= 0

    @Test (expected = IllegalArgumentException.class)
    public void nZero_throwsIllegalArgumentException() {
        FizzBuzz.fizzBuzz(0);
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

//    @Test
//    public void nZero_throwsIllegalArgumentException2() {
//        String[] result = FizzBuzz.fizzBuzz(0);
//        assertEquals(0, result.length);
//    }


    // B: Kleine n
    @Test
    public void nOne_returnsOnly1() {
        String[] result = FizzBuzz.fizzBuzz(1);
        assertArrayEquals(new String[] { "1" }, result);
    }

    @Test
    public void nTwo_returns1And2() {
        String[] result = FizzBuzz.fizzBuzz(2);
        assertArrayEquals(new String[] { "1", "2" }, result);
    }


    // C: Fizz / Buzz / FizzBuzz Verhalten

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
    public void multiplesOfThreeButNotFive_becomeFizz() {
        String[] result = FizzBuzz.fizzBuzz(6);

        assertEquals("Fizz", result[2]); // 3
        assertEquals("Fizz", result[5]); // 6
    }

    @Test
    public void multiplesOfFiveButNotThree_becomeBuzz() {
        String[] result = FizzBuzz.fizzBuzz(10);

        assertEquals("Buzz", result[4]);  // 5
        assertEquals("Buzz", result[9]);  // 10
    }

    @Test
    public void fizzBuzzOfFifteen_containsFizzBuzzAtPositionFifteen() {
        String[] result = FizzBuzz.fizzBuzz(15);
        assertEquals("FizzBuzz", result[14]);
    }

    // D: Voller repräsentativer Lauf für n = 15

    @Test
    public void nFifteen_fullSequenceIsCorrect() {
        String[] result = FizzBuzz.fizzBuzz(15);

        assertEquals(15, result.length);

        assertEquals("1",        result[0]);  // 1
        assertEquals("2",        result[1]);  // 2
        assertEquals("Fizz",     result[2]);  // 3
        assertEquals("4",        result[3]);  // 4
        assertEquals("Buzz",     result[4]);  // 5
        assertEquals("Fizz",     result[5]);  // 6
        assertEquals("7",        result[6]);  // 7
        assertEquals("8",        result[7]);  // 8
        assertEquals("Fizz",     result[8]);  // 9
        assertEquals("Buzz",     result[9]);  // 10
        assertEquals("11",       result[10]); // 11
        assertEquals("Fizz",     result[11]); // 12
        assertEquals("13",       result[12]); // 13
        assertEquals("14",       result[13]); // 14
        assertEquals("FizzBuzz", result[14]); // 15
    }

}
