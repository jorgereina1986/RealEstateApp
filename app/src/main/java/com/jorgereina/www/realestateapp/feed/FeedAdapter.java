package com.jorgereina.www.realestateapp.feed;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.jorgereina.www.realestateapp.R;
import com.jorgereina.www.realestateapp.model.Entry;

/**
 * Created by jorgereina on 12/29/17.
 */

public class FeedAdapter extends FirebaseRecyclerAdapter<Entry, EntryViewHolder> {

    private Context context;

    public FeedAdapter(@NonNull Context context, @NonNull FirebaseRecyclerOptions<Entry> options) {
        super(options);
        this.context = context;
    }

    @Override
    protected void onBindViewHolder(@NonNull EntryViewHolder holder, int position, @NonNull Entry model) {
        holder.bind(model);
    }

    @Override
    public EntryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.entry_row, parent, false);
        return new EntryViewHolder(view);
    }


}
