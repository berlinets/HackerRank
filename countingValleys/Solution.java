package countingValleys;

public class Solution {
    static int countingValleys(int n, String s) {
        int seaLevel = 0;
        int valleysCount = 0;
        for (char step : s.toCharArray()) {
            if (step == 'U') {
                seaLevel += 1;
                if (seaLevel == 0) {
                    valleysCount++;
                }
            } else {
                seaLevel -= 1;
            }
        }
        return valleysCount;
    }

    public static void main(String[] args) {

        int result = countingValleys(8, "UDDDUDUU");
        System.out.println(result);

    }
}
