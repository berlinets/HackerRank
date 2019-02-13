package fizzBuzzWoof;

public class Solution {
    public static void fizzBuzzWoof(int n) {
        String word = "";
        for (int i = 1; i <= n; i++) {
            if (i % 7 != 0 && i % 5 != 0 && i % 3 != 0) {
                word = Integer.toString(i);
            } else {
                if (i % 3 == 0) word = "Fizz";
                if (i % 5 == 0) word = "Buzz";
                if (i % 7 == 0) word = "Woof";
                if (i % 15 == 0) word = "FizzBuzz";
                if (i % 21 == 0) word = "FizzWoof";
                if (i % 105 == 0) word = "FizzBuzzWoof";
            }
            System.out.println(word);
        }

    }

    public static void main(String[] args) {
        fizzBuzzWoof(210);
    }
}
/**
 * In this challenge, consider a range of positive integers from 1 to a limit.
 * For each value, print either a string or the value based on whether the number
 * is a multiple of 3, 5, 7, all, any combination or neither.
 * Determine the string to return based on the following rules for an integer i:
 *
 * If i is a multiple of 3, print Fizz.
 * If i is a multiple of 5, print Buzz.
 * If i is a multiple of 7, print Woof.
 * If i is a multiple of any combination of numbers 3, 5 and 7, print a combination of words in one string. Ex. for 3,5,7, print FizzBuzzWoof.
 * For all others, print the value of i.
 *
 * Function Description
 *
 * Complete the function fizzBuzzWoof in the editor below. The function print the appropriate response for each value i ∈ {1, 2, ... n} in ascending order, each on a separate line.  There is no return value expected.
 * fizzBuzz has the following parameter(s):
 *
 * n:  upper limit of values to test (inclusive)
 *
 * Constraints
 *
 * 0 < n < 2 × 105
 */
