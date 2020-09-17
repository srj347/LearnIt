package com.epizy.learnitapp.learnitheree;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class MyAdapter extends ArrayAdapter<Modal> {

    
    public MyAdapter(@NonNull Context context, int resource, @NonNull List<Modal> objects) {
        super(context,0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView== null){
            listItemView = LayoutInflater.from((Activity)getContext()).inflate(R.layout.list_item,parent,false);

        }
        Modal modal = getItem(position);


        TextView heading = listItemView.findViewById(R.id.title);

        heading.setText(modal.getTitle());
        ImageView img = listItemView.findViewById(R.id.pdf_icon_item);
        img.setImageResource(modal.getIcon());

        return  listItemView;

    }
}
