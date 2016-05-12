
package com.kolosqko.gifplayer;

        import android.app.TabActivity;
        import android.content.Intent;
        import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends TabActivity {

    /** Called when the activity is first created. */
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost = (TabHost) findViewById(android.R.id.tabhost);

        tabHost.setup();
        TabHost.TabSpec tabSpec;

        tabSpec = tabHost.newTabSpec("tag1");
        tabSpec.setIndicator("Favorites");
        tabSpec.setContent(new Intent(this, ListFavorites.class));
        tabHost.addTab(tabSpec);

        tabSpec = tabHost.newTabSpec("tag2");
        tabSpec.setIndicator("Add New Gif");
        tabSpec.setContent(R.id.tvTab);
        tabHost.addTab(tabSpec);



    }
}