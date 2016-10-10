package com.example.mahiro.cs273superheroes;

import android.content.Context;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/**
 * Class loads MusicEvent data from a formatted JSON (JavaScript Object Notation) file.
 * Populates data model (MusicEvent) with data.
 */

public class JSONLoader {

    /**
     * Loads JSON data from a file in the assets directory.
     * @param context The activity from which the data is loaded.
     * @throws IOException If there is an error reading from the JSON file.
     */
    public static ArrayList<SuperHeroes> loadJSONFromAsset(Context context) throws IOException {
        ArrayList<SuperHeroes> allSuperHeroes = new ArrayList<>();
        String json = null;
            InputStream is = context.getAssets().open("cs273superheroes.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");

        try {
            JSONObject jsonRootObject = new JSONObject(json);
            JSONArray allSuperHeroesJSON = jsonRootObject.getJSONArray("cs273superheroes");
            int numberOfEvents = allSuperHeroesJSON.length();

            for (int i = 0; i < numberOfEvents; i++) {
                JSONObject cs273superheroesJSON = allSuperHeroesJSON.getJSONObject(i);

                SuperHeroes hero = new SuperHeroes();

                hero.setName(cs273superheroesJSON.getString(("Name")));
                hero.setUsername(cs273superheroesJSON.getString(("UserName")));
                hero.setSuperpower(cs273superheroesJSON.getString(("Superpower")));
                hero.setOnething(cs273superheroesJSON.getString(("OneThing")));
                hero.setImageName(cs273superheroesJSON.getString(("ImageName")));

            allSuperHeroes.add(hero);
        }
        }
        catch (JSONException e)
        {
            Log.e("CS273 SuperHeroes", e.getMessage());
        }

        return allSuperHeroes;
    }
}
