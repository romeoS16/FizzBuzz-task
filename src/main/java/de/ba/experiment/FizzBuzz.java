package de.ba.experiment;

public class FizzBuzz {

    /**
     * Gibt für die Zahlen von 1 bis n jeweils einen String zurück:
     *
     * - "Fizz"      bei Vielfachen von 3
     * - "Buzz"      bei Vielfachen von 5
     * - "FizzBuzz"  bei Vielfachen von 3 und 5
     * - sonst die Zahl selbst als String
     *
     * Beispiel für n = 5:
     *  ["1", "2", "Fizz", "4", "Buzz"]
     *
     * Hinweis: Der Rückgabe-Array hat die Länge n.
     * Index 0 entspricht der Zahl 1, Index 1 der Zahl 2 usw.
     * Optional: Für negative Werte kann eine IllegalArgumentException geworfen werden
     * oder einfach ein leeres String-Array zurückgeben werden
     */

    public static String[] fizzBuzz(int n) {
        if(n <= 0) {
            throw new IllegalArgumentException("n must be greater than 0");
        }

//        Ohne Exception
//        if(n <= 0) {
//            return new String[0];
//        }

        String[] result = new String[n];

        for(int i = 1; i <= n; i++) {
            boolean isFizz = (i % 3 == 0);
            boolean isBuzz = (i % 5 == 0);

            if(isFizz && isBuzz) {
                result[i - 1] = "FizzBuzz";
            }
            else if(isFizz) {
                result[i - 1] = "Fizz";
            }
            else if(isBuzz) {
                result[i - 1] = "Buzz";
            }
            else {
                result[i - 1] = "" + i;
            }
        }
        return result;
    }
}
