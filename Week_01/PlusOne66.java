import java.util.Arrays;

public class PlusOne66 {

    public static int[] plusOne(int[] digits) {
        int len = digits.length;
        for (int i = len - 1; i >= 0; i--) {
            if(digits[i] != 9){
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;
        }
        digits = new int[++len];
        digits[0] = 1;
        return digits;
    }

    public static int[] plusOne2(int[] digits) {
        int len = digits.length;
        for (int i = len - 1; i >= 0; i--) {
            // 加1
            digits[i] += 1;
            // 模10
            digits[i] %= 10;
            if (digits[i] != 0){
                return digits;
            }
        }
        // 容量+1
        digits = new int[len + 1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {
        int[] digits = {9, 9};
        // int[] digits = {1, 9, 3, 9};
        int[] newInt = plusOne(digits);
        System.out.println(Arrays.toString(newInt));
    }

}
