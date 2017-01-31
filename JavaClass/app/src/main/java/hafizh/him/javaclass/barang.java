package hafizh.him.javaclass;

/**
 * Created by D2J-00 on 31/01/2017.
 */
public class barang {

    public static final int ELEKTRONIK = 1;
    public static final int Non_ELECTRONIK = 2;
    private String nama;
    private int category;
    private int harga;

    public barang(String nama, int category, int harga) {
        this.nama = nama;
        this.setCategory(category);
        this.harga = harga;
    }

    public String toString(){
        return nama+" | "+this.getStringCategory()+" | "+this.harga+"\n";
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return this.nama;
    }

    public int getCategory() {
        return category;
    }

    public String getStringCategory(){
        if (category == 1)
            return "Elektronik";
        else
            return "Non Elektronik";
    }

    public void setCategory(int category) {
        if (category !=1 && category != 2)
            this.category=2;
        else
            this.category = category;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
}
