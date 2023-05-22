public class LC67 {
    public static String addBinary(String a, String b) {
        int sum = Integer.parseInt(a) + Integer.parseInt(b);
        return Integer.toBinaryString(sum);
    }

    public static void main(String[] args) {
        String a = "5";
        String b = "6";
        int sum = Integer.parseInt(a) + Integer.parseInt(b);
        System.out.println(sum);
        System.out.println(Integer.toBinaryString(sum));
        System.out.println(Integer.toBinaryString(1));
    }


}
