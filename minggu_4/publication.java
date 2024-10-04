package minggu_4;
import java.text.NumberFormat;
import java.util.Locale;

public class publication {
    private String title;
    private int price;
    private int page;

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getPage() {
        return page;
    }
    public void setPage(int page) {
        this.page = page;
    }
    public void printHeader() {
        System.out.println("===== Mencari Informasi Buku =====");
    }
    public void printBookInfo() {
        Locale myIndonesianLocale = new Locale("in", "ID");
        NumberFormat formatter = NumberFormat.getCurrencyInstance(myIndonesianLocale);
        System.out.println(this.title + " (Price List: " + formatter.format(this.price) + ")");
    }
}
