package minggu_1;
import java.util.Scanner;
public class soal2 {
    public static void main(String[] args) {
        double mill, km;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jarak dalam mill: ");
        mill = input.nextDouble();
        km = mill * 1.6;
        System.out.println(mill + " mill setara dengan " + km + " km");
    }
}