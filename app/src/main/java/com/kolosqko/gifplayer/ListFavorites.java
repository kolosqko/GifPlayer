package com.kolosqko.gifplayer;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.ArrayAdapter;

/**
 * Created by user on 12.05.2016.
 */
public class ListFavorites extends Activity implements AdapterView.OnItemClickListener {

    String[] gif_names ={"first", "second"};
    String[] gif_urls ={"https://media.giphy.com/media/N35rW3vRNeaDC/giphy.gif", "https://media.giphy.com/media/lSuhT1XP7eZ4Q/giphy.gif"};

    protected void onCreate(Bundle savedInstantState){

        super.onCreate(savedInstantState);
        setContentView(R.layout.list_favoites);

        ListView listFav = (ListView) findViewById(R.id.listFavorits);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, gif_names);

        listFav.setAdapter(adapter);
        listFav.setOnItemClickListener(this);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Intent intent = new Intent(this, GifPlayer.class);
            startActivity(intent);

    }
}
