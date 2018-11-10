package com.example.lewis.ipract;

import android.content.Context;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class itemAdapter extends BaseAdapter {
    LayoutInflater mInflater;
    String[] items;
    String[] lecturer;
    String[] room;

    public itemAdapter(Context c, String[] i, String[] l, String[] r){
        items=i;
        lecturer=l;
        room=r;
        mInflater=(LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return items.length;
    }

    @Override
    public Object getItem(int i) {
        return items[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View View, ViewGroup parent) {
        View v =mInflater.inflate(R.layout.my_listview_detail, null);
        TextView unitTextView=(TextView)v.findViewById(R.id.unitTextView);
        TextView lecTextView=(TextView)v.findViewById(R.id.lecTextView);
        TextView roomTextView=(TextView)v.findViewById(R.id.roomTextView);

        String name=items[i];
        String lec = lecturer[i];
        String keja = room[i];

        unitTextView.setText(name);
        lecTextView.setText(lec);
        roomTextView.setText(keja);

        return v;
    }
}
