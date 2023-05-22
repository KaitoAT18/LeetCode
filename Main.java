import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FindPivotIndex findPivotIndex = new FindPivotIndex();
        System.out.print("n = ");
        int n = new Scanner(System.in).nextInt();
        int nums[] = new int[n];

        System.out.println("Arr: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = new Scanner(System.in).nextInt();
        }

        System.out.println(findPivotIndex.pivotIndex(nums));
    }
}