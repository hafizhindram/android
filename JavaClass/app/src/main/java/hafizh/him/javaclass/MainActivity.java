package hafizh.him.javaclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public String showString;
    public TextView showText;
    public barang[] arrBarang = new barang[10];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showText = (TextView) findViewById(R.id.show_text);
        showString = "Manipulasi class java android";
        addSeparator();


        initBarang();
        showString += arrBarang[5].toString();
        addSeparator();
        showString += arrBarang[7].toString();
        showText.setText(showString);
    }

    public void addSeparator() {
        showString += "\n-----------------------------------------------\n";
    }

    public void initBarang() {
        arrBarang[0] = new barang(1, 7000000, "Laptop");
        arrBarang[1] = new barang(barang.ELEKTRONIK, 2500000, "Printer");
        arrBarang[2] = new barang(barang.ELEKTRONIK, 1500000, "Monitor");
        arrBarang[3] = new barang(barang.ELEKTRONIK, 1000000, "Scanner");
        arrBarang[4] = new barang(barang.NON_ELEKTRONIK, 200000, "Meja");
        arrBarang[5] = new barang(barang.NON_ELEKTRONIK, 100000, "Kursi");
        arrBarang[6] = new barang(barang.NON_ELEKTRONIK, 20000, "Baju");
        arrBarang[7] = new barang(barang.NON_ELEKTRONIK,150000,"Celana");
        arrBarang[8] = new barang(barang.ELEKTRONIK,5000000,"Handphone");
        arrBarang[9] = new barang(barang.ELEKTRONIK,80000,"Flashdisk");
        arrBarang[10] = new barang(barang.NON_ELEKTRONIK,2000,"Sepeda");
    }
}
