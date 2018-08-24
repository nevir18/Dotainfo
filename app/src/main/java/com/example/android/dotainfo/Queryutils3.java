package com.example.android.dotainfo;

import android.content.Context;
import android.util.Log;

import com.example.android.dotainfo.com.example.android.dotainfo2.DotaDetailsGSON;
import com.example.android.dotainfo.com.example.android.dotainfo2.Player;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
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

public class Queryutils3 {

    private static final String LOG_TAG = Queryutils3.class.getSimpleName();

    /**
     * Create a private constructor because no one should ever create a {@link Queryutils3} object.
     * This class is only meant to hold static variables and methods, which can be accessed
     * directly from the class name QueryUtils (and an object instance of QueryUtils is not needed).
     */
    private Queryutils3() {
    }


    public static  DotaDetailsGSON fetchdetails2DotaData(String requestUrl) {
        // Create URL object
        URL url = createUrl(requestUrl);
        Log.d("requestUrl",requestUrl);
        // Perform HTTP request to the URL and receive a JSON response back
        String jsonResponse = null;
        try {
            jsonResponse = makeHttpRequest(url);
            Log.d("jsonresponse",jsonResponse);
        } catch (IOException e) {
            Log.e(LOG_TAG, "Problem making the HTTP request.", e);
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Extract relevant fields from the JSON response and create a list of {@link Earthquake}s
        DotaDetailsGSON dotadetails2 = extractFeatureFromJson(jsonResponse);

        // Return the list of {@link Earthquake}s
        return dotadetails2;
    }

    /**
     * Returns new URL object from the given string URL.
     */
    private static URL createUrl(String stringUrl) {
        URL url = null;
        try {
            url = new URL(stringUrl);
            Log.d("stringUrl",stringUrl);
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
     * @param
     */
    private static DotaDetailsGSON extractFeatureFromJson(String Dotadetails2JSON) {
//        Gson gson = new Gson();
        Gson gson = new GsonBuilder().registerTypeAdapterFactory(new ArrayAdapterFactory()).create();
        gson.fromJson(Dotadetails2JSON, new TypeToken<DotaDetailsGSON>(){}.getType());
        DotaDetailsGSON details = gson.fromJson(Dotadetails2JSON, new TypeToken<DotaDetailsGSON>(){}.getType());
        return details;


    }
}
