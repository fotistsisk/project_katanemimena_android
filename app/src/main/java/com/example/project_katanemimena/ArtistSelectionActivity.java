package com.example.project_katanemimena;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class ArtistSelectionActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    MyAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);

        recyclerView = (RecyclerView) findViewById(R.id.artist_recycler_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true);

        // use a linear layout manager
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        ArrayList<String> artists = new ArrayList<String>();
        artists.add("Ariana Grande");
        artists.add("Billie Eilish");
        artists.add("Ariana Grande");
        artists.add("Billie Eilish");artists.add("Ariana Grande");
        artists.add("Billie Eilish");
        artists.add("Ariana Grande");
        artists.add("Billie Eilish");artists.add("Ariana Grande");
        artists.add("Billie Eilish");artists.add("Ariana Grande");
        artists.add("Billie Eilish");artists.add("Ariana Grande");
        artists.add("Billie Eilish");artists.add("Ariana Grande");
        artists.add("Billie Eilish");artists.add("Ariana Grande");
        artists.add("Billie Eilish");artists.add("Ariana Grande");
        artists.add("Billie Eilish");artists.add("Ariana Grande");
        artists.add("Billie Eilish");artists.add("Ariana Grande");
        artists.add("Billie Eilish");artists.add("Ariana Grande");
        artists.add("Billie Eilish");artists.add("Ariana Grande");
        artists.add("Billie Eilish");artists.add("Ariana Grande");
        artists.add("Billie Eilish");artists.add("Ariana Grande");
        artists.add("Billie Eilish");artists.add("Ariana Grande");
        artists.add("Billie Eilish");artists.add("Ariana Grande");
        artists.add("Billie Eilish");artists.add("Ariana Grande");
        artists.add("Billie Eilish");artists.add("Ariana Grande");
        artists.add("Billie Eilish");artists.add("Ariana Grande");
        artists.add("Billie Eilish");artists.add("Ariana Grande");
        artists.add("Billie Eilish");artists.add("Ariana Grande");
        artists.add("Billie Eilish");artists.add("Ariana Grande");
        artists.add("Billie Eilish");artists.add("Ariana Grande");
        artists.add("Billie Eilish");



        // specify an adapter (see also next example)
        mAdapter = new MyAdapter(artists);
        recyclerView.setAdapter(mAdapter);

    }
}
