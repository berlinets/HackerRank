package sockMerchant;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    static int sockMerchant(int n, int[] ar) {
        Set<Integer> colors = new HashSet<>();
        int pairs = 0;

        for (int i = 0; i < n; i++) {
            if (!colors.contains(ar[i])) {
                colors.add(ar[i]);
            } else {
                pairs++;
                colors.remove(ar[i]);
            }
        }
        return pairs;
    }

    public static void main(String[] args) {
        int[] ar = {1, 1, 3, 1, 2, 1, 3, 3, 3, 3};
        sockMerchant(10, ar);

    }
}
