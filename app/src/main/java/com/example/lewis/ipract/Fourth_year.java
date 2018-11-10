package com.example.lewis.ipract;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class Fourth_year extends AppCompatActivity {

    ListView YearFour;
    String[] itemsY4;
    String[] lecturerY4;
    String[] roomY4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_year);

        Resources res = getResources();
        YearFour=(ListView) findViewById(R.id.YearFour);
        itemsY4 =res.getStringArray(R.array.itemsY4);
        lecturerY4 =res.getStringArray(R.array.lecturerY4);
        roomY4 =res.getStringArray(R.array.roomY4);

        itemAdapter itemAdapterY3= new itemAdapter(this,itemsY4,lecturerY4,roomY4);
        YearFour.setAdapter(itemAdapterY3);
    }
}
