package com.example.android.dotainfo;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;

public class DotamatchesLoader extends AsyncTaskLoader<List<DotamatchesGSON>> {
        private static final String LOG_TAG = DotamatchesLoader.class.getName();
    private String mUrl;
    public DotamatchesLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<DotamatchesGSON> loadInBackground() {
        if (mUrl == null) {
            return null;
        }

        // Perform the network request, parse the response, and extract a list of earthquakes.
        List<DotamatchesGSON> Dotamatch = Queryutils2.fetchMatchDotaData(mUrl);
        return Dotamatch;
    }
}