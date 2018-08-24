package com.example.android.dotainfo;

import android.app.LoaderManager;
import android.content.Intent;
import android.content.Loader;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.AsyncTask;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.android.dotainfo.com.example.android.dotainfo2.DotaDetailsGSON;

import java.util.ArrayList;
import java.util.List;

public class DotamatchesActivity extends AppCompatActivity implements LoaderManager.LoaderCallbacks<List<DotamatchesGSON>>{
    private static final String LOG_TAG = DotamatchesActivity.class.getName();


    private static final String DOTAPROMATCHES_REQUEST_URL = "https://api.opendota.com/api/proMatches";

    private DotamatchesAdapter mAdapter;

    private static final int DOTA_LOADER_ID1 = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dotamatches);

        // Find a reference to the {@link ListView} in the layout
        ListView Dota1ListView = (ListView) findViewById(R.id.list1);


        mAdapter = new DotamatchesAdapter(this, new ArrayList<DotamatchesGSON>());

        // Set the adapter on the {@link ListView}
        // so the list can be populated in the user interface
        Dota1ListView.setAdapter(mAdapter);

        LoaderManager loaderManager = getLoaderManager();
        // Initialize the loader. Pass in the int ID constant defined above and pass in null for
        // the bundle. Pass in this activity for the LoaderCallbacks parameter (which is valid
        // because this activity implements the LoaderCallbacks interface).
        loaderManager.initLoader(DOTA_LOADER_ID1, null, this);


        // Start the AsyncTask to fetch the earthquake data
        DotamatchesActivityAsyncTask task = new DotamatchesActivityAsyncTask();
        task.execute(DOTAPROMATCHES_REQUEST_URL);


        Dota1ListView.setOnItemClickListener (new AdapterView.OnItemClickListener(){
           @Override
           public void onItemClick(AdapterView<?>adapterView, View view, int position, long l ){
               DotamatchesGSON current = mAdapter.getItem(position);

               String matchIDString = current.getMatchId().toString();


               Intent matchID;

               matchID = new Intent(DotamatchesActivity.this, Dotadetails2Activity.class);
               matchID.putExtra("matchID",matchIDString);

               startActivity(matchID);
           }
        });
    }

    @Override
    public Loader<List<DotamatchesGSON>> onCreateLoader(int i, Bundle bundle) {
        // Create a new loader for the given URL
        return new DotamatchesLoader(this, DOTAPROMATCHES_REQUEST_URL);
    }

    @Override
    public void onLoadFinished(Loader<List<DotamatchesGSON>> loader, List<DotamatchesGSON> dotamatch) {
        // Clear the adapter of previous earthquake data
        mAdapter.clear();

        // If there is a valid list of {@link Earthquake}s, then add them to the adapter's
        // data set. This will trigger the ListView to update.
        if (dotamatch != null && !dotamatch.isEmpty()) {
            mAdapter.addAll(dotamatch);
        }
    }

    @Override
    public void onLoaderReset(Loader<List<DotamatchesGSON>> loader) {
        // Loader reset, so we can clear out our existing data.
        mAdapter.clear();
    }

    /**
     * {@link AsyncTask} to perform the network request on a background thread, and then
     * update the UI with the list of earthquakes in the response.
     *
     * AsyncTask has three generic parameters: the input type, a type used for progress updates, and
     * an output type. Our task will take a String URL, and return an Earthquake. We won't do
     * progress updates, so the second generic is just Void.
     *
     * We'll only override two of the methods of AsyncTask: doInBackground() and onPostExecute().
     * The doInBackground() method runs on a background thread, so it can run long-running code
     * (like network activity), without interfering with the responsiveness of the app.
     * Then onPostExecute() is passed the result of doInBackground() method, but runs on the
     * UI thread, so it can use the produced data to update the UI.
     */
    private class DotamatchesActivityAsyncTask extends AsyncTask<String, Void, List<DotamatchesGSON>> {


        @Override
        protected List<DotamatchesGSON> doInBackground(String... urls) {
            // Don't perform the request if there are no URLs, or the first URL is null
            if (urls.length < 1 || urls[0] == null) {
                return null;
            }

            List<DotamatchesGSON> result = Queryutils2.fetchMatchDotaData(urls[0]);
            return result;
        }


        @Override
        protected void onPostExecute(List<DotamatchesGSON> data) {

            mAdapter.clear();


            if (data != null && !data.isEmpty()) {
                mAdapter.addAll(data);
            }
        }


        }

    }

