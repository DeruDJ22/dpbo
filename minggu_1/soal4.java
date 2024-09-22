package minggu_1;

import java.util.Scanner;

public class soal4 {
    public static void main(String[] args) {
        int apel = 0, jeruk = 0, mangga = 0, jumBuah = 0;
        int i = 0;
        String buah;
        Scanner input = new Scanner(System.in);
        jumBuah = input.nextInt();
        while (i <= jumBuah) {
            buah = input.nextLine();
            if (buah.equals("apel")) {
                apel++;
            } else if (buah.equals("jeruk")) {
                jeruk++;
            } else if (buah.equals("mangga")) {
                mangga++;
            }
            i++;
        }
        System.out.println(apel + " " + jeruk + " " + mangga);
    }
}
