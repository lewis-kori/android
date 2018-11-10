package com.example.lewis.ipract;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;


public class Second_year extends AppCompatActivity {

    ListView YearTwo;
    String[] itemsS2;
    String[] lecturerS2;
    String[] roomS2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_year);

        Resources res = getResources();
        YearTwo = (ListView) findViewById(R.id.YearTwo);
        itemsS2 = res.getStringArray(R.array.itemsS2);
        lecturerS2 = res.getStringArray(R.array.lecturerS2);
        roomS2 = res.getStringArray(R.array.roomS2);

        itemAdapter itemAdapterY2 = new itemAdapter(this, itemsS2, lecturerS2, roomS2);
        YearTwo.setAdapter(itemAdapterY2);
    }
}