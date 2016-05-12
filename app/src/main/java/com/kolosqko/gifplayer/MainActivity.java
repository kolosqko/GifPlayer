
package com.kolosqko.gifplayer;

        import android.app.Activity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.TabHost;
        import android.widget.TabHost.OnTabChangeListener;
        import android.widget.Toast;

public class MainActivity extends Activity {
    /** Called when the activity is first created. */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost = (TabHost) findViewById(android.R.id.tabhost);

        tabHost.setup();
        TabHost.TabSpec tabSpec;

        tabSpec = tabHost.newTabSpec("tag1");
        tabSpec.setIndicator("Favorites");
        tabSpec.setContent(R.id.tvTab1);
        tabHost.addTab(tabSpec);

        tabSpec = tabHost.newTabSpec("tag2");
        tabSpec.setIndicator("Add New Gif");
        tabSpec.setContent(R.id.tvTab2);
        tabHost.addTab(tabSpec);



    }
}