package com.epizy.learnitapp.learnitheree;

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

public class Adapter_Res extends ArrayAdapter<ModalRes> {


    public Adapter_Res(@NonNull Context context, int resource, @NonNull List<ModalRes> objects) {
        super(context,0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView== null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_res,parent,false);

        }
        ModalRes modal_res = getItem(position);

        TextView heading = listItemView.findViewById(R.id.title_res);
        heading.setText(modal_res.getTitle_res());
        ImageView img = listItemView.findViewById(R.id.thumbnail);
        img.setImageResource(modal_res.getThumbnail());

        return  listItemView;

    }
}
