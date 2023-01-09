import java.util.Scanner;

public class No4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arrStr = new String[n];
        String[] arrRes = new String[n];
        for (int i = 0; i < n; i++) {
            arrStr[i] = sc.next();
        }

        for (int i = 0; i < arrStr.length; i += 2) {
            if (i != n - 1) {
                arrRes[i + 1] = arrStr[i];
            } else {
                arrRes[n - 1] = arrStr[n - 1];
            }
        }
        for (int i = 1; i < arrStr.length; i += 2) {
            arrRes[i - 1] = arrStr[i];
        }
        for (String str : arrRes) {
            System.out.println(str);
        }
    }
}