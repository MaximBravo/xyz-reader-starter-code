package com.example.xyzreader.remote;

import android.util.Log;

import com.example.xyzreader.data.Chunk;

import java.net.MalformedURLException;
import java.net.URL;

public class Config {
    public static final URL BASE_URL;
    private static String TAG = Config.class.toString();

    public static boolean continueLoading = true;
    public static boolean killThread = false;

    public static String urlUsing = "https://raw.githubusercontent.com/TNTest/xyzreader/master/data.json";
    static {
        URL url = null;
        try {
            url = new URL(urlUsing);
        } catch (MalformedURLException ignored) {
            // TODO: throw a real error
            Log.e(TAG, "Please check your internet connection.");
        }

        BASE_URL = url;
    }
}
