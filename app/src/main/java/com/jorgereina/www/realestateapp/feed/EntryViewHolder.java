package com.jorgereina.www.realestateapp.feed;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.jorgereina.www.realestateapp.R;
import com.jorgereina.www.realestateapp.model.Entry;

/**
 * Created by jorgereina on 1/2/18.
 */

public class EntryViewHolder extends RecyclerView.ViewHolder {

    private TextView titleTv;
    private TextView dateTv;
    private TextView descriptionTv;

    public EntryViewHolder(View itemView) {
        super(itemView);

        titleTv = itemView.findViewById(R.id.title_tv);
        dateTv = itemView.findViewById(R.id.date_tv);
        descriptionTv = itemView.findViewById(R.id.description_tv);
    }

    public void bind(Entry entry) {
        titleTv.setText(entry.getTitle());
        dateTv.setText(entry.getDate());
        descriptionTv.setText(entry.getDescription());
    }
}
