package it.figuccia;

import java.util.*;

public class Start {
    public static void main(String[] args) {

        List<Integer> divisorsOf52 = new ArrayList<>();
        List<Integer> randomNumbers = new ArrayList<>(List.of(1, 60, 13, 12));

        for (int count = 0, divisor = 1, number = 52; divisor <= number; divisor++) {
            if ((number % divisor) == 0) {
                count++;
                divisorsOf52.add(divisor);
            }

        }
/* for testing lists
        System.out.println("Divisors of 52 are: " + divisorsOf52);
        System.out.println("Initial random numbers: " + randomNumbers);
*/
        randomNumbers.addAll(divisorsOf52);
        System.out.println("Random numbers: " + randomNumbers);
        System.out.println("There are " + randomNumbers.size() + " numbers");

        Set<Integer> uniqueRandomNumbers = new HashSet<>(randomNumbers);
        System.out.println("Random numbers without double elements: " + uniqueRandomNumbers);
        System.out.println("There are " + uniqueRandomNumbers.size() + " numbers");

        List<Integer> sortedUniqueRandomNumbers = new ArrayList<>(uniqueRandomNumbers);
        Collections.sort(sortedUniqueRandomNumbers, Collections.reverseOrder());
        System.out.println("Sorted random numbers: " + sortedUniqueRandomNumbers);
    }
}