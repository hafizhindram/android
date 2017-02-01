package hafizh.him.javaclass;

import java.util.ArrayList;

/**
 * Created by D2J-00 on 31/01/2017.
 */
public class transaksi {

    private ArrayList<barang> ListBarang = new ArrayList<>();

    public  void addBarang(barang barang)
    {
        this.ListBarang.add(barang);
    }

    public int totalTransaksi()
    {
        int hasil=0;
        for (int i=0; i < ListBarang.size();i++)
        {
            hasil += ListBarang.get(i).getHarga();
        }

        return hasil;
    }

    public String printTransaksi()
    {
        String text = "Barang yang dibeli pada transaksi ini adalah: \n";
        text +="\n-------------------------------------------------------\n";

        for (int i=0; i<ListBarang.size();i++)
        {
            text += ListBarang.get(i).toString();
        }
        text +="\n-------------------------------------------------------\n";
        text +="Total pembelian : "+totalTransaksi()+"\n";
        text +="\n-------------------------------------------------------\n";

        return text;
    }


}
