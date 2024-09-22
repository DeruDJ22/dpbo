package minggu_1;
import java.util.Scanner;

public class soal5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0, angka = 0;
        while (i < 11) {
            angka = input.nextInt();
            if (angka >  7) {
                System.out.println(angka + " lebih besar dari 7");
            } else if (angka < 7) {
                System.out.println(angka + " lebih kecil dari 7");
            } else {
                System.out.println(angka + " sama dengan 7");
            }
            i++;
        }
    }
}
