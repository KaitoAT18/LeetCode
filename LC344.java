import java.util.Arrays;

public class LC344 {
    public static void reverseString(char[] s) {
        char[] rev = new char[s.length];
        int k = 0;
        for (int i = s.length-1; i >= 0; i--) {
            rev[k++] = s[i];
        }
        System.out.println(Arrays.toString(rev));
    }

    public static void main(String[] args) {
        char[] s = {'h', 'e','l','l','o'};
        reverseString(s);
    }
}
