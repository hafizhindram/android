package hafizh.him.listfilm;

import java.io.Serializable;

/**
 * Created by D2J-00 on 09/02/2017.
 */
public class Movie implements Serializable{
    public String judul;
    public String description;
    public double rating;
    public int year;

    public Movie(String judul,String description, double rating, int year){
        this.judul = judul;
        this.description = description;
        this.rating =rating;
        this.year=year;
    }
    public String toString(){
        return this.judul;
    }
}
