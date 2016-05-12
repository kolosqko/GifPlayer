package com.kolosqko.gifplayer;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.ArrayAdapter;

/**
 * Created by user on 12.05.2016.
 */
public class ListFavorites extends Activity {

    String[] gif_names ={"first", "second"};
    String[] gif_urls ={"https://media2.giphy.com/media/t8lbAKMlzmcNi/200.gif", "https://media4.giphy.com/media/u2NvKgLW1W7Wo/200.gif"};

    protected void onCreate(Bundle savedInstantState){

        super.onCreate(savedInstantState);
        setContentView(R.layout.list_favoites);

        ListView listFav = (ListView) findViewById(R.id.listFavorits);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, gif_names);

        listFav.setAdapter(adapter);
    }
}
