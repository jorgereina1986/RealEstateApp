package com.jorgereina.www.realestateapp.feed;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.jorgereina.www.realestateapp.R;
import com.jorgereina.www.realestateapp.model.Entry;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "lagarto";
    private EditText inputEt;
    private Button okButton;
    private DatabaseReference databaseReference;
    private FeedAdapter adapter;
    private FirebaseRecyclerOptions<Entry> options;
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputEt = findViewById(R.id.input_et);
        okButton = findViewById(R.id.ok_btn);
        recyclerView = findViewById(R.id.feed_rv);
        layoutManager = new LinearLayoutManager(this);

        databaseReference = FirebaseDatabase.getInstance().getReference();

        Query query = databaseReference.child("listings");

        Log.d(TAG, "onCreate: " + FirebaseDatabase.getInstance().getReference().child("users"));

        options = new FirebaseRecyclerOptions.Builder<Entry>()
                .setQuery(query , Entry.class)
                .build();

        adapter = new FeedAdapter(this, options);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();

        addData();

    }

    private void addData() {
        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Entry entry = new Entry(null, "hello", "hello", "hello", "hello");

                databaseReference.child("listings").push().setValue(entry);
                inputEt.setText("");
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        adapter.startListening();
    }

    @Override
    protected void onStop() {
        super.onStop();
        adapter.stopListening();
    }
}
