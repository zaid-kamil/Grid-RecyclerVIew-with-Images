package com.zbk.catgrid;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        RecyclerView catlist = findViewById(R.id.catlist);
        GridLayoutManager manager = new GridLayoutManager(this, 2);
        CatAdapter adapter = new CatAdapter(this, DummyDataGenerator.create(), R.layout.card);
        catlist.setLayoutManager(manager);
        catlist.setAdapter(adapter);
    }


}
