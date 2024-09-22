package minggu_1;
import  java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        int a, b, c, temp;
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        if (a > c) {
            temp = a;
            a = c;
            c = temp;
        }
        if (b > c) {
            temp = b;
            b = c;
            c = temp;
        }
        System.out.println(a + " " + b + " " + c);
    }
}
