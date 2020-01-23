import java.util.ArrayList;
import java.util.Scanner;

public class Masiv {
    public static boolean Func(int x,int[] A){
        boolean b = false;
        for (int i=0;i<A.length;i++){
            if (x == A[i]){
                return true;
            }
        }
        return b;
    }
    public static void main(String[] args) {
        int[] A = new int[10];
        int[] B = new int[10];
        Scanner sc = new Scanner(System.in);
        int x;
        for (int i = 0; i < 10; i++) {
            A[i] = sc.nextInt();
        }
        int count, counter = 0;
        for (int i = 0; i < A.length - 1; i++) {
            x = A[i];
            count = 0;
            for (int j = i + 1; j < A.length; j++) {
                if (A[j] == x && count == 0 && !Func(x,B)) {
                    count++;
                    B[counter] = x;
                    counter++;
                }
            }
        }
        for (int i = 0; i < counter; i++) {
            System.out.print(B[i] + " ");
        }
    }

}