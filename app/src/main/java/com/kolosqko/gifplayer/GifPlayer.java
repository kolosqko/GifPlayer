package com.kolosqko.gifplayer;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;

/**
 * Created by user on 12.05.2016.
 */
public class GifPlayer extends Activity{
    public GifPlayer (){
    }
    public GifPlayer (String path){
        url = path;
    }

    private String url;

    protected void onCreate(Bundle savedInstantState){
        super.onCreate(savedInstantState);
        Intent intent = getIntent();
        url = intent.getStringExtra("url");
        GifWebView view = new GifWebView(this,url);
        setContentView(view);
    }
}

class GifWebView extends WebView{



    public GifWebView(Context context, String path) {
        super(context);
        loadUrl(path);
    }
}
