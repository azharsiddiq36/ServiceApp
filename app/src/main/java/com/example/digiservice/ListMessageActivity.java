package com.example.digiservice;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.digiservice.databinding.ActivityListMessageBinding;
import com.example.digiservice.model.People;

import java.util.List;

public class ListMessageActivity extends AppCompatActivity {

    private AdapterListBasic mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityListMessageBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_list_message);
        initToolbar(binding);
        initComponent(binding);
    }

    private void initToolbar(ActivityListMessageBinding binding) {
        binding.toolbar.toolbar.setNavigationIcon(R.drawable.ic_menu);
        setSupportActionBar(binding.toolbar.toolbar);
        getSupportActionBar().setTitle("Pesan");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    private void initComponent(ActivityListMessageBinding binding) {
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        binding.recyclerView.setHasFixedSize(true);

        List<People> items = DataGenerator.getPeopleData(this);
        items.addAll(DataGenerator.getPeopleData(this));
        items.addAll(DataGenerator.getPeopleData(this));

        //set data and list adapter
        mAdapter = new AdapterListBasic(this, items);
        binding.recyclerView.setAdapter(mAdapter);

        // on item list clicked
        mAdapter.setOnItemClickListener(new AdapterListBasic.OnItemClickListener() {
            @Override
            public void onItemClick(View view, People obj, int position) {
                Intent gotomessage = new Intent(ListMessageActivity.this,MessageActivity.class);
                startActivity(gotomessage);
            }
        });

    }


}