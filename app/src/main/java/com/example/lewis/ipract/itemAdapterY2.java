package com.example.lewis.ipract;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class itemAdapterY2 extends BaseAdapter {
    LayoutInflater mInflater2;
    String[] itemsS2;
    String[] lecturerS2;
    String[] roomS2;

    public itemAdapterY2(Context c, String[] i, String[] l, String[] r){
        itemsS2=i;
        lecturerS2=l;
        roomS2=r;
        mInflater2=(LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return itemsS2.length;
    }

    @Override
    public Object getItem(int i) {
        return itemsS2[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View View, ViewGroup parent) {
        View v =mInflater2.inflate(R.layout.my_listview_detail, null);
        TextView unitTextView=(TextView)v.findViewById(R.id.unitTextView);
        TextView lecTextView=(TextView)v.findViewById(R.id.lecTextView);
        TextView roomTextView=(TextView)v.findViewById(R.id.roomTextView);

        String name2=itemsS2[i];
        String lec2 = lecturerS2[i];
        String keja2 = roomS2[i];

        unitTextView.setText(name2);
        lecTextView.setText(lec2);
        roomTextView.setText(keja2);

        return v;
    }
}
