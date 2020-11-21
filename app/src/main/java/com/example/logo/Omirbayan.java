package com.example.logo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Omirbayan extends AppCompatActivity {
    ExpandableListView kyrykbes;
    List<String> listGroup;
    HashMap<String,List<String>> listItem;
    MyAdater adapter;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_omirbayan);

        kyrykbes = findViewById(R.id.kyrykbes);
        listGroup = new ArrayList<>();
        listItem = new HashMap<>();
        adapter = new MyAdater(this,listGroup,listItem);
        kyrykbes.setAdapter(adapter);
        initListData();
    }

    private void initListData() {
        listGroup.add(getString(R.string.Eki));
        listGroup.add(getString(R.string.Uzh));
        listGroup.add(getString(R.string.Tort));
        listGroup.add(getString(R.string.Bes));
        listGroup.add(getString(R.string.Alty));
        listGroup.add(getString(R.string.Zheti));
        listGroup.add(getString(R.string.Segiz));
        listGroup.add(getString(R.string.Togiz));
        listGroup.add(getString(R.string.on));
        listGroup.add(getString(R.string.onb));
        listGroup.add(getString(R.string.one));

        String[] array;

        List<String> list =new ArrayList<>();
        array = getResources().getStringArray(R.array.Eki);
        for (String item : array){
            list.add(item);
        }
        listItem.put(listGroup.get(0),list);
        adapter.notifyDataSetChanged();



    }
}