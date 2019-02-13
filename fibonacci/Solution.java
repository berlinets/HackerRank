package fibonacci;

public class Solution {
    public static void main(String[] args) {
        fibo(100);
    }

    private static void fibo(int value) {
        int a = 0, b = 1, c = 0;
        while (b < value){
            System.out.println(c);
            c = a+b;
            a = b;
            b = c;
        }
    }
}
