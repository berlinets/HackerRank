package jumpingOnClouds;

public class Solution {
    static int jumpingOnClouds(int[] c) {
        int jumpCounter = 0;
        for (int i = 0; i < c.length; i++) {
            if (c.length - i == 1) return jumpCounter;
            if (c.length - i <= 2) return jumpCounter + 1;
            if (c[i + 2] != 1) i++;
            jumpCounter++;
        }
        return jumpCounter;
    }

    public static void main(String[] args) {

        int[] a = {0, 1, 0, 1, 0, 1, 0, 0};
        int result = jumpingOnClouds(a);
        System.out.println(result);

    }
}
