package com.example.lewis.ipract;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class listViewActivity extends AppCompatActivity {

    ListView myListView;
    String[] items;
    String[] lecturer;
    String[] room;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        Resources res = getResources();
        myListView=(ListView) findViewById(R.id.myListView);
        items =res.getStringArray(R.array.items);
        lecturer =res.getStringArray(R.array.lecturer);
        room =res.getStringArray(R.array.room);

        itemAdapter itemAdapt= new itemAdapter(this,items,lecturer,room);
        myListView.setAdapter(itemAdapt);
    }
}
