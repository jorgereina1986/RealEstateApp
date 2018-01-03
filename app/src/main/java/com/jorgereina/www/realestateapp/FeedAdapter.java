package com.jorgereina.www.realestateapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.jorgereina.www.realestateapp.model.Entry;

/**
 * Created by jorgereina on 12/29/17.
 */

public class FeedAdapter extends FirebaseRecyclerAdapter<Entry, EntryHolder> {

    private Context context;

    public FeedAdapter(@NonNull Context context, @NonNull FirebaseRecyclerOptions<Entry> options) {
        super(options);
        this.context = context;
    }

    @Override
    protected void onBindViewHolder(@NonNull EntryHolder holder, int position, @NonNull Entry model) {
        holder.bind(model);
    }

    @Override
    public EntryHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.entry_row, parent, false);
        return new EntryHolder(view);
    }


}
