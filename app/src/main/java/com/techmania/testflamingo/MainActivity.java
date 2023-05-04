package com.techmania.testflamingo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ConstraintLayout constraintLayout;
    ItemAdapter itemAdapter;
    ArrayList<String> titleList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        constraintLayout = findViewById(R.id.constraintLayout);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        titleList.add("Title 1");
        titleList.add("Title 2");
        titleList.add("Title 3");
        titleList.add("Title 4");
        titleList.add("Title 5");

        itemAdapter = new ItemAdapter(titleList,constraintLayout);
        recyclerView.setAdapter(itemAdapter);

    }
}