package com.example.lewis.ipract;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class itemAdapterY3 extends BaseAdapter {
    LayoutInflater mInflater3;
    String[] itemsY3;
    String[] lecturerY3;
    String[] roomY3;

    public itemAdapterY3(Context c, String[] i, String[] l, String[] r){
        itemsY3=i;
        lecturerY3=l;
        roomY3=r;
        mInflater3=(LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return itemsY3.length;
    }

    @Override
    public Object getItem(int i) {
        return itemsY3[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View View, ViewGroup parent) {
        View v =mInflater3.inflate(R.layout.my_listview_detail, null);
        TextView unitTextView=(TextView)v.findViewById(R.id.unitTextView);
        TextView lecTextView=(TextView)v.findViewById(R.id.lecTextView);
        TextView roomTextView=(TextView)v.findViewById(R.id.roomTextView);

        String nameY3=itemsY3[i];
        String lecY3 = lecturerY3[i];
        String kejaY3 = roomY3[i];

        unitTextView.setText(nameY3);
        lecTextView.setText(lecY3);
        roomTextView.setText(kejaY3);

        return v;
    }
}
