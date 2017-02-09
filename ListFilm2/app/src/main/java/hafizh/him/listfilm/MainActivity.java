package hafizh.him.listfilm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private String[] filmTitles={"The Thor", "Harry Potter","Inception","Wolf of Wallstreet",
            "Django unchained","Titanic","Captain America","Doctor Strange",
            "X-men Apocalypse","Shuter Island", "The Avenger", "Fantastic Beast & Where to Find Them"};

    private ArrayList<Movie> movies = new ArrayList<>();

    private void initMovies(){
        movies.add(new Movie("The Thor", "Superhero anak dari dewa Zeus yang turun ke bumi", 7.5, 2009));
        movies.add(new Movie("Harry Potter","Kisah Seorang penyihir yang baik dan rajin menabung",8.0,2013));
        movies.add(new Movie("The Avenger","Kisah seorang pahlawan bertopeng yang mencari jati dirinya",6.9,2015));
        movies.add(new Movie("Captain America","Seorang captain yang ingin menjuarai piala dunia",9.0,2016));
        movies.add(new Movie("Doctor Strange","Seorang doktor kandungan yang menculik pasiennya",7.0,2017));
        movies.add(new Movie("Shuter Island","Sebuah pulau yang berisikan banyak wanita seksi",9.5,2017));
        movies.add(new Movie("Titanic","Sebuah perahu yang mengantarkan pengantin baru ke jurang kematian",9.9,2016));
        movies.add(new Movie("Wolf of wallstreet","Kisah serigala yang tidak mempunyai taring namun bisa terbang",5.0,2017));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initMovies();
        ArrayAdapter<Movie> adapter = new ArrayAdapter<Movie>(this,
                android.R.layout.simple_list_item_1, movies);
        ListView listView = (ListView) findViewById(R.id.list_film);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               Movie selectedMovie = movies.get(position);
                Intent intent = new Intent(getBaseContext(), DetailActivity.class);
                intent.putExtra("hafizh.him.listfilm",selectedMovie);
                startActivity(intent);
            }
        });
    }
}
