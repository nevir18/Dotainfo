package com.example.android.dotainfo;

import android.app.LoaderManager;
import android.content.Intent;
import android.content.Loader;
import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.AsyncTask;
import android.text.style.BackgroundColorSpan;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.example.android.dotainfo.com.example.android.dotainfo2.DotaDetailsGSON;
import com.example.android.dotainfo.com.example.android.dotainfo2.Player;

import java.util.ArrayList;
import java.util.List;

public class Dotadetails2Activity extends AppCompatActivity implements LoaderManager.LoaderCallbacks<DotaDetailsGSON> {
    private static final String LOG_TAG = Dotadetails2Activity.class.getName();


    private static final String DOTADETAILS2_REQUEST_URL = "https://api.opendota.com/api/matches/";

    private String dotadetailsextensionmatchid;


    private Dotadetails2PlayerAdapter mDetailsPlayerAdapter;
    private ListView mDetailsPlayerList;
    private TextView mMatchID;
    private TextView mleagueid;
    private TextView mWinnerColor;
    private Boolean mRadiantWin;


    private TextView mWinnerBackground;


    private static final int DOTA_DETAILS_LOADER_ID = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dotadetailslist);

        String matchIDString = getIntent().getStringExtra("matchID");

        dotadetailsextensionmatchid = DOTADETAILS2_REQUEST_URL + matchIDString;

        mMatchID = (TextView) findViewById(R.id.matchid);
        mWinnerColor = (TextView) findViewById(R.id.WinnerColor);
        mWinnerBackground = (TextView) findViewById(R.id.WinnerBackground);

        mDetailsPlayerList = (ListView) findViewById(R.id.playerlist);

        mDetailsPlayerAdapter = new Dotadetails2PlayerAdapter(this, new ArrayList<Player>());
        // Set the adapter on the {@link ListView}
        // so the list can be populated in the user interface

        mDetailsPlayerList.setAdapter(mDetailsPlayerAdapter);

        LoaderManager loaderManager = getLoaderManager();
        // Initialize the loader. Pass in the int ID constant defined above and pass in null for
        // the bundle. Pass in this activity for the LoaderCallbacks parameter (which is valid
        // because this activity implements the LoaderCallbacks interface).
        loaderManager.initLoader(DOTA_DETAILS_LOADER_ID, null, this);

    }


    @Override
    public Loader<DotaDetailsGSON> onCreateLoader(int i, Bundle bundle) {
        Uri newUri = Uri.parse(dotadetailsextensionmatchid);

        return new Dotadetails2Loader(this, newUri.toString());
    }

    @Override
    public void onLoadFinished(Loader<DotaDetailsGSON> loader, DotaDetailsGSON dotadetails) {
        // Clear the adapter of previous earthquake data
        Boolean mRadiantWin = dotadetails.getRadiantWin();
        if (mRadiantWin) {
            mWinnerColor.setText("RADIANTTEAM WINS");
            mWinnerColor.setTextColor(Color.parseColor("#ffffff"));
            mWinnerBackground.setBackgroundColor(Color.parseColor("#228B22"));

        } else {
            mWinnerColor.setText("DIRETEAM WINS");
            mWinnerColor.setTextColor(Color.parseColor("#ffffff"));
            mWinnerBackground.setBackgroundColor(Color.parseColor("#FF0000"));

        }
            if (dotadetails.getPlayers() != null && !dotadetails.getPlayers().isEmpty()) {
                mDetailsPlayerAdapter.addAll(dotadetails.getPlayers());
                mDetailsPlayerAdapter.notifyDataSetChanged();
            }
        }

    @Override
    public void onLoaderReset(Loader<DotaDetailsGSON> loader) {
        mDetailsPlayerAdapter.clear();
    }
}