package com.example.lewis.ipract;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class itemAdapterY4 extends BaseAdapter {
    LayoutInflater mInflater4;
    String[] itemsY4;
    String[] lecturerY4;
    String[] roomY4;

    public itemAdapterY4(Context c, String[] i, String[] l, String[] r){
        itemsY4=i;
        lecturerY4=l;
        roomY4=r;
        mInflater4=(LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return itemsY4.length;
    }

    @Override
    public Object getItem(int i) {
        return itemsY4[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View View, ViewGroup parent) {
        View v =mInflater4.inflate(R.layout.my_listview_detail, null);
        TextView unitTextView=(TextView)v.findViewById(R.id.unitTextView);
        TextView lecTextView=(TextView)v.findViewById(R.id.lecTextView);
        TextView roomTextView=(TextView)v.findViewById(R.id.roomTextView);

        String nameY4=itemsY4[i];
        String lecY4 = lecturerY4[i];
        String kejaY4 = roomY4[i];

        unitTextView.setText(nameY4);
        lecTextView.setText(lecY4);
        roomTextView.setText(kejaY4);

        return v;
    }
}
