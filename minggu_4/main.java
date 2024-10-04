package minggu_4;
import java.text.NumberFormat;
import java.util.Locale;

class main {

    public static void main(String[] args) {
        publication threeKingdom = new publication();
        threeKingdom.setTitle("Three Kingdom");
        threeKingdom.setPrice(5000);
        threeKingdom.setPage(67);
        
        publication aPie = new publication();
        aPie.setTitle("A Pie");
        aPie.setPrice(8400);
        aPie.setPage(82);

        Locale myIndonesianLocale = new Locale("in", "ID");
        NumberFormat formatter = NumberFormat.getCurrencyInstance(myIndonesianLocale);
        int totalThreeKingdom = threeKingdom.getPrice() * threeKingdom.getPage();
        int totalAPie = aPie.getPrice() * aPie.getPage();
        int total = totalThreeKingdom + totalAPie;

        threeKingdom.printHeader();
        System.out.println(" ");
        threeKingdom.printBookInfo();
        aPie.printBookInfo();
        System.out.println(" ");
        System.out.println("====================");
        System.out.println(" ");
        System.out.println(threeKingdom.getTitle() + " - Pembelian Jilid: " + threeKingdom.getPage());
        System.out.println(aPie.getTitle() + " - Pembelian Jilid: " + aPie.getPage());
        System.out.println(" ");
        System.out.println("====================");
        System.out.println(" ");
        System.out.println(threeKingdom.getTitle() + " " + threeKingdom.getPage() + " Jilid (" + formatter.format(totalThreeKingdom) + ")");
        System.out.println(aPie.getTitle() + " " + aPie.getPage() + " Jilid (" + formatter.format(totalAPie) + ")");
        System.out.println(" ");
        System.out.println("====================");
        System.out.println(" ");
        System.out.println("Jumlah Total Pembelian: " + formatter.format(total));
    }
}