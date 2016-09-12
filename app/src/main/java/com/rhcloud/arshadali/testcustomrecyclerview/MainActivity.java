package com.rhcloud.arshadali.testcustomrecyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private PostDetailAdapter mAdapter;
    private RecyclerView mRecycler;
    private LinearLayoutManager mManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecycler = (RecyclerView)findViewById(R.id.post_detail_recycler_view);
        mRecycler.setHasFixedSize(true);

        mAdapter = new PostDetailAdapter(MainActivity.this);

        // Set up Layout Manager, reverse layout
        mManager = new LinearLayoutManager(MainActivity.this);
        mManager.setReverseLayout(true);
        mManager.setStackFromEnd(true);
        mRecycler.setLayoutManager(mManager);

        mRecycler.setAdapter(mAdapter);

    }
}
