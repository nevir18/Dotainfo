package com.example.android.dotainfo;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;

public class DotaplayersLoader extends AsyncTaskLoader<List<DotaplayersGSON>> {

        /**
         * Tag for log messages
         */
        private static final String LOG_TAG = DotaplayersLoader.class.getName();

        /**
         * Query URL
         */
        private String mUrl;

        /**
         * Constructs a new {@link DotaplayersLoader}.
         *
         * @param context of the activity
         * @param url     to load data from
         */
        public DotaplayersLoader(Context context, String url) {
            super(context);
            mUrl = url;
        }

        @Override
        protected void onStartLoading() {
            forceLoad();
        }

        /**
         * This is on a background thread.
         */
        @Override
        public List<DotaplayersGSON> loadInBackground() {
            if (mUrl == null) {
                return null;
            }

            // Perform the network request, parse the response, and extract a list of earthquakes.
            List<DotaplayersGSON> dotaplayer = Queryutils.fetchDotaData(mUrl);
            return dotaplayer;
        }
    }

