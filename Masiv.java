import java.util.ArrayList;
import java.util.Scanner;

public class Masiv {
    public static void main(String[] args) {
        int[] A = new int[10];
        int[] B = new int[10];
        Scanner sc = new Scanner(System.in);
        int x;
        int num;
        for (int i = 0; i < 10; i++) {
            A[i] = sc.nextInt();
        }
        int count, counter = 0;
        for (int i = 0; i < A.length - 1; i++) {
            x = A[i];
            count = 0;
            for (int j = i + 1; j < A.length; j++) {
                if (A[j] == x && count == 0) {
                    count++;
                    counter++;
                    B[i] = x;
                }
            }
        }
        for (int i = 0; i < counter; i++) {
            System.out.print(A[i] + " ");
        }
    }

}