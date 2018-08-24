package com.example.android.dotainfo;

import android.app.LoaderManager;
import android.content.Loader;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class DotaplayersActivity extends AppCompatActivity implements LoaderManager.LoaderCallbacks<List<DotaplayersGSON>> {
    private static final String LOG_TAG = DotaplayersActivity.class.getName();


    private static final String DOTAPROPLAYERS_REQUEST_URL = "https://api.opendota.com/api/proPlayers";

    private DotaplayersAdapter mAdapter;

    private static final int DOTA_LOADER_ID = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find a reference to the {@link ListView} in the layout
        ListView DotaListView = (ListView) findViewById(R.id.list);


        mAdapter = new DotaplayersAdapter(this, new ArrayList<DotaplayersGSON>());

        // Set the adapter on the {@link ListView}
        // so the list can be populated in the user interface
        DotaListView.setAdapter(mAdapter);

        LoaderManager loaderManager = getLoaderManager();
        // Initialize the loader. Pass in the int ID constant defined above and pass in null for
        // the bundle. Pass in this activity for the LoaderCallbacks parameter (which is valid
        // because this activity implements the LoaderCallbacks interface).
        loaderManager.initLoader(DOTA_LOADER_ID, null, this);

        // Start the AsyncTask to fetch the earthquake data
        DotaplayersActivityAsyncTask task = new DotaplayersActivityAsyncTask();
        task.execute(DOTAPROPLAYERS_REQUEST_URL);
    }

    @Override
    public Loader<List<DotaplayersGSON>> onCreateLoader(int i, Bundle bundle) {
        // Create a new loader for the given URL
        return new DotaplayersLoader(this, DOTAPROPLAYERS_REQUEST_URL);
    }

    @Override
    public void onLoadFinished(Loader<List<DotaplayersGSON>> loader, List<DotaplayersGSON> dotaplayer) {
        // Clear the adapter of previous earthquake data
        mAdapter.clear();

        // If there is a valid list of {@link Earthquake}s, then add them to the adapter's
        // data set. This will trigger the ListView to update.
        if (dotaplayer != null && !dotaplayer.isEmpty()) {
            mAdapter.addAll(dotaplayer);
        }
    }

    @Override
    public void onLoaderReset(Loader<List<DotaplayersGSON>> loader) {
        // Loader reset, so we can clear out our existing data.
        mAdapter.clear();
    }


    private class DotaplayersActivityAsyncTask extends AsyncTask<String, Void, List<DotaplayersGSON>> {


        @Override
        protected List<DotaplayersGSON> doInBackground(String... urls) {
            // Don't perform the request if there are no URLs, or the first URL is null
            if (urls.length < 1 || urls[0] == null) {
                return null;
            }

            List<DotaplayersGSON> result = Queryutils.
                    fetchDotaData(urls[0]);
            return result;
        }


        @Override
        protected void onPostExecute(List<DotaplayersGSON> data) {

            mAdapter.clear();


            if (data != null && !data.isEmpty()) {
                mAdapter.addAll(data);
            }
        }
    }
}
