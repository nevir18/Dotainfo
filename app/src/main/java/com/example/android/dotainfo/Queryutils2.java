package com.example.android.dotainfo;

import android.text.TextUtils;
import android.util.Log;


import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class Queryutils2 {



    /** Tag for the log messages */
    private static final String LOG_TAG = Queryutils2.class.getSimpleName();

    /**
     * Create a private constructor because no one should ever create a {@link Queryutils2} object.
     * This class is only meant to hold static variables and methods, which can be accessed
     * directly from the class name QueryUtils (and an object instance of QueryUtils is not needed).
     */
    private Queryutils2() {
    }


    public static List<DotamatchesGSON> fetchMatchDotaData(String requestUrl) {
        // Create URL object
        URL url = createUrl(requestUrl);

        // Perform HTTP request to the URL and receive a JSON response back
        String jsonResponse = null;
        try {
            jsonResponse = makeHttpRequest(url);
        } catch (IOException e) {
            Log.e(LOG_TAG, "Problem making the HTTP request.", e);
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Extract relevant fields from the JSON response and create a list of {@link Earthquake}s
        List<DotamatchesGSON> dotamatch = extractFeatureFromJson(jsonResponse);

        // Return the list of {@link Earthquake}s
        return dotamatch;
    }

    /**
     * Returns new URL object from the given string URL.
     */
    private static URL createUrl(String stringUrl) {
        URL url = null;
        try {
            url = new URL(stringUrl);
        } catch (MalformedURLException e) {
            Log.e(LOG_TAG, "Problem building the URL ", e);
        }
        return url;
    }

    /**
     * Make an HTTP request to the given URL and return a String as the response.
     */
    private static String makeHttpRequest(URL url) throws IOException {
        String jsonResponse = "";

        // If the URL is null, then return early.
        if (url == null) {
            return jsonResponse;
        }

        HttpURLConnection url1Connection = null;
        InputStream inputStream = null;
        try {
            url1Connection = (HttpURLConnection) url.openConnection();
            url1Connection.setReadTimeout(10000 /* milliseconds */);
            url1Connection.setConnectTimeout(15000 /* milliseconds */);
            url1Connection.setRequestMethod("GET");
            url1Connection.connect();

            // If the request was successful (response code 200),
            // then read the input stream and parse the response.
            if (url1Connection.getResponseCode() == 200) {
                inputStream = url1Connection.getInputStream();
                jsonResponse = readFromStream(inputStream);
            } else {
                Log.e(LOG_TAG, "Error response code: " + url1Connection.getResponseCode());
            }
        } catch (IOException e) {
            Log.e(LOG_TAG, "Problem retrieving the Match JSON results.", e);
        } finally {
            if (url1Connection != null) {
                url1Connection.disconnect();
            }
            if (inputStream!= null) {
                // Closing the input stream could throw an IOException, which is why
                // the makeHttpRequest(URL url) method signature specifies than an IOException
                // could be thrown.
                inputStream.close();
            }
        }
        return jsonResponse;
    }

    /**
     * Convert the {@link InputStream} into a String which contains the
     * whole JSON response from the server.
     */
    private static String readFromStream(InputStream inputStream) throws IOException {
        StringBuilder output = new StringBuilder();
        if (inputStream != null) {
            InputStreamReader inputStreamReader= new InputStreamReader(inputStream, Charset.forName("UTF-8"));
            BufferedReader reader = new BufferedReader(inputStreamReader);
            String line = reader.readLine();
            while (line != null) {
                output.append(line);
                line = reader.readLine();
            }
        }
        return output.toString();
    }

    /**
     * Return a list of {@link Dotamatches} objects that has been built up from
     * parsing the given JSON response.
     */
    private static List<DotamatchesGSON> extractFeatureFromJson(String DotamatchesJSON) {
        Gson gson = new Gson();
        gson.fromJson(DotamatchesJSON, new TypeToken<List<DotamatchesGSON>>(){}.getType());
        List<DotamatchesGSON> matches = gson.fromJson(DotamatchesJSON, new TypeToken<List<DotamatchesGSON>>(){}.getType());
        return matches;


        // If the JSON string is empty or null, then return early.
  ////      if (TextUtils.isEmpty(DotamatchesJSON)) {
  ////          return null;
  ////      }
////
  ////      // Create an empty ArrayList that we can start adding earthquakes to
  ////      List<Dotamatches> dotamatch = new ArrayList<>();
////
  ////      // Try to parse the JSON response string. If there's a problem with the way the JSON
  ////      // is formatted, a JSONException exception object will be thrown.
  ////      // Catch the exception so the app doesn't crash, and print the error message to the logs.
  ////      try {
////
  ////          JSONArray MatchesArray = new JSONArray(DotamatchesJSON);
////
  ////          for (int i = 0; i < MatchesArray.length(); i++) {
////
////
  ////              JSONObject currentDotaProMatches = MatchesArray.getJSONObject(i);
////
////
  ////              long Matchid= currentDotaProMatches.getLong("Matchid");
  ////              int RadiantTeamId=currentDotaProMatches.getInt("RadiantTeamId");
  ////              int Duration=currentDotaProMatches.getInt("Duration");
  ////              String RadiantName = currentDotaProMatches.getString("RadiantName");
  ////              String DireName = currentDotaProMatches.getString("DireName");
  ////              int DireTeamId=currentDotaProMatches.getInt("DireTeamId");
  ////              int DireScore=currentDotaProMatches.getInt("RadiantTeamId");
  ////              int RadiantScore=currentDotaProMatches.getInt("RadiantScore");
  ////              boolean RadiantWin=currentDotaProMatches.getBoolean("RadiantWin");
////
////
////
  ////              Dotamatches dotamatches = new Dotamatches(
  ////                      Matchid,
  ////                      RadiantTeamId,
  ////                      Duration,
  ////                      RadiantName,
  ////                      DireTeamId,
  ////                      DireName,
  ////                      RadiantScore,
  ////                      DireScore,
  ////                      RadiantWin
  ////                     );
////
  ////              dotamatch.add(dotamatches);
  ////          }
////
  ////      } catch (JSONException e) {
  ////          // If an error is thrown when executing any of the above statements in the "try" block,
  ////          // catch the exception here, so the app doesn't crash. Print a log message
  ////          // with the message from the exception.
  ////          Log.e(LOG_TAG, "Problem parsing the matches JSON results", e);
  ////      }
////
  ////      // Return the list of earthquakes
  ////      return dotamatch;
  }

}