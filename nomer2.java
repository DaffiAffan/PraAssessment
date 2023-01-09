import java.util.Scanner;
import java.util.ArrayList;

public class nomer2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> warna = new ArrayList<>();

        System.out.println("Isi list :");

        for (int i = 0; i < 5; i++) {
            warna.add(input.next());
        }

        System.out.println("Masukkan kata :");

        String kata = input.next();

        if (warna.contains(kata)) {
            System.out.println("Kata " + kata + " ada dalam list");
        } else {
            System.out.println("Kata " + kata + " tidak ada dalam list");
        }
    }
}
