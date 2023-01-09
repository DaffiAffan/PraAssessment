import java.util.Scanner;
import java.util.*;

public class nomer3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        String vokal = "aiueo", huruf = "bcdfghjklmnpqrstvwxyz", simpan;
        String masukan = input.nextLine();
        masukan += " ";
        input.close();

        simpan = String.valueOf(vokal.charAt(rand.nextInt(vokal.length())));
        simpan += huruf.charAt(rand.nextInt(huruf.length()));
        funcGanti(masukan, simpan);

    }

    private static void funcGanti(String isi, String isi2) {
        String word = isi.replaceAll(" ", isi2 + " ");
        System.out.println(word.toUpperCase());
    }
}