import java.util.Scanner;

public class No2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int total = sc.nextInt();

        int[] arrToples = new int[n];

        for (int i = 0; i < arrToples.length; i++) {
            arrToples[i] = sc.nextInt();
        }
        for (int i = 0; i < arrToples.length; i++) {

            int toples1 = arrToples[i];
            for (int j = i + 1; j < arrToples.length; j++) {

                int toples2 = arrToples[j];
                int num1 = i + 1;
                int num2 = j + 1;

                if (toples1 + toples2 == total) {
                    if (num1 > num2)

                        System.out.println(num2 + " " + num1);
                    else if (num2 > num1)
                        System.out.println(num1 + " " + num2);

                }
            }
        }
    }
}