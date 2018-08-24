package com.example.android.dotainfo;

import android.util.Log;


import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;

public class Queryutils {



        /** Tag for the log messages */
        private static final String LOG_TAG = Queryutils.class.getSimpleName();

        /**
         * Create a private constructor because no one should ever create a {@link Queryutils} object.
         * This class is only meant to hold static variables and methods, which can be accessed
         * directly from the class name QueryUtils (and an object instance of QueryUtils is not needed).
         */
        private Queryutils() {
        }


    public static List<DotaplayersGSON> fetchDotaData(String requestUrl) {
        // Create URL object
        URL url = dotaplayercreateUrl(requestUrl);

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
        List<DotaplayersGSON> dotaplayer = extractFeatureFromJson(jsonResponse);

        // Return the list of {@link Earthquake}s
        return dotaplayer;
    }

    /**
     * Returns new URL object from the given string URL.
     */
    private static URL dotaplayercreateUrl(String stringUrl) {
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

        HttpURLConnection urlConnection = null;
        InputStream inputStream = null;
        try {
            urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setReadTimeout(10000 /* milliseconds */);
            urlConnection.setConnectTimeout(15000 /* milliseconds */);
            urlConnection.setRequestMethod("GET");
            urlConnection.connect();

            // If the request was successful (response code 200),
            // then read the input stream and parse the response.
            if (urlConnection.getResponseCode() == 200) {
                inputStream = urlConnection.getInputStream();
                jsonResponse = readFromStream(inputStream);
            } else {
                Log.e(LOG_TAG, "Error response code: " + urlConnection.getResponseCode());
            }
        } catch (IOException e) {
            Log.e(LOG_TAG, "Problem retrieving the Player JSON results.", e);
        } finally {
            if (urlConnection != null) {
                urlConnection.disconnect();
            }
            if (inputStream != null) {
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
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, Charset.forName("UTF-8"));
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
     * Return a list of {@link Dotaplayers} objects that has been built up from
     * parsing the given JSON response.
     */
    private static List<DotaplayersGSON> extractFeatureFromJson(String DotaplayersJSON) {

        Gson gson = new Gson();

        gson.fromJson(DotaplayersJSON, new TypeToken<List<DotaplayersGSON>>(){}.getType());
        List<DotaplayersGSON> players = gson.fromJson(DotaplayersJSON, new TypeToken<List<DotaplayersGSON>>(){}.getType());
        return players;




       // // If the JSON string is empty or null, then return early.
       // if (TextUtils.isEmpty(DotaplayersJSON)) {
       //     return null;
       // }

       // // Create an empty ArrayList that we can start adding earthquakes to
       // List<Dotaplayers> dotaplayer = new ArrayList<>();

       // // Try to parse the JSON response string. If there's a problem with the way the JSON
       // // is formatted, a JSONException exception object will be thrown.
       // // Catch the exception so the app doesn't crash, and print the error message to the logs.
       // try {

       //     JSONArray PlayersArray = new JSONArray(DotaplayersJSON);

       //     for (int i = 0; i < PlayersArray.length(); i++) {


       //         JSONObject currentDotaProPlayers = PlayersArray.getJSONObject(i);


       //         int accountId = currentDotaProPlayers.optInt("accountid");
       //         String steamid = currentDotaProPlayers.optString("steamid");
       //         String avatar = currentDotaProPlayers.getString("avatar");
       //         // String avatarmedium=currentDotaProPlayers.optString("avatarmedium");
       //         // String avatarfull=currentDotaProPlayers.optString("avatarfull");
       //         String profileurl = currentDotaProPlayers.optString("profileurl");
       //         String personaname = currentDotaProPlayers.optString("personaname");
       //         //String lastLogin=currentDotaProPlayers.optString("lastlogin");
       //         //String fullHistoryTime=currentDotaProPlayers.optString("fullhistorytime");
       //         //int cheese=currentDotaProPlayers.optInt("cheese");
       //         //Boolean fhUnavailable=currentDotaProPlayers.optBoolean("fhunavailable");
       //         String loccountrycode = currentDotaProPlayers.optString("loccountry");
       //         String name = currentDotaProPlayers.getString("name");
       //         //int fantasyRole=currentDotaProPlayers.optInt("fantasyrole");
       //         //int teamId=currentDotaProPlayers.optInt("teamid");
       //         String teamName = currentDotaProPlayers.optString("teamname");
       //         //String teamTag=currentDotaProPlayers.optString("teamtag");
       //         //Boolean isLocked=currentDotaProPlayers.optBoolean("islocked");
       //         boolean isPro = currentDotaProPlayers.optBoolean("ispro");
       //         //int lockedUntil=currentDotaProPlayers.optInt("lockeduntil");



       //         Dotaplayers dotaplayers = new Dotaplayers(accountId, steamid, avatar,
       //                 profileurl, personaname,  loccountrycode, name,  teamName,
       //                  isPro);

       //         dotaplayer.add(dotaplayers);
       //     }

       // } catch (JSONException e) {
       //     // If an error is thrown when executing any of the above statements in the "try" block,
       //     // catch the exception here, so the app doesn't crash. Print a log message
       //     // with the message from the exception.
       //     Log.e(LOG_TAG, "Problem parsing the earthquake JSON results", e);
       // }

       // // Return the list of earthquakes
       // return dotaplayer;
    }

}