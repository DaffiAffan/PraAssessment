import java.util.Scanner;

public class nomer1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bil = input.nextInt();

        for (int i = 1; i <= bil; i++) {
            for (int j = bil; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            for (int m = 1; m < i; m++) {
                System.out.print("*");
            }
            for (int l = bil; l > i; l--) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
