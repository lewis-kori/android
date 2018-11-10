package com.example.lewis.ipract;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class Third_year extends AppCompatActivity {

    ListView YearThree;
    String[] itemsY3;
    String[] lecturerY3;
    String[] roomY3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_year);

        Resources res = getResources();
        YearThree=(ListView) findViewById(R.id.YearThree);
        itemsY3 =res.getStringArray(R.array.itemsY3);
        lecturerY3 =res.getStringArray(R.array.lecturerY3);
        roomY3 =res.getStringArray(R.array.roomY3);

        itemAdapter itemAdapterY3= new itemAdapter(this,itemsY3,lecturerY3,roomY3);
        YearThree.setAdapter(itemAdapterY3);
    }
}
