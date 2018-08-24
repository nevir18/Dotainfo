package com.example.android.dotainfo;

import android.content.AsyncTaskLoader;
import android.content.Context;

import com.example.android.dotainfo.com.example.android.dotainfo2.DotaDetailsGSON;

import java.util.List;

public class Dotadetails2Loader extends AsyncTaskLoader<DotaDetailsGSON> {

    private String mUrl;
    public Dotadetails2Loader(Context context, String url) {
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public DotaDetailsGSON loadInBackground() {
        if (mUrl == null) {
            return null;
        }

        // Perform the network request, parse the response, and extract a list of earthquakes.
        DotaDetailsGSON Dotadetails2 =  Queryutils3.fetchdetails2DotaData(mUrl);
        return Dotadetails2;
    }

}