package com.example.dreamteam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    String[] dreamTeam = new String[] {"Dan", "Fred", "Carol", "Alex"};

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);

        ArrayAdapter<String> dogAdapter = new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_list_item_1, dreamTeam);

        listView.setAdapter(dogAdapter);

        listView.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        System.out.println(dreamTeam[position]);

        Intent moveToDetailIntent = new Intent(getBaseContext(), PlayerDetailActivity.class);
        moveToDetailIntent.putExtra("playerName", dreamTeam[position]);
        startActivity(moveToDetailIntent);
    }
}