package com.example.dreamteam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class PlayerDetailActivity extends AppCompatActivity {

    TextView nameTextView;
    TextView ageTextView;
    TextView collegeTextView;
    TextView heightTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_detail);

        nameTextView = (TextView) findViewById(R.id.nameTextView);
        ageTextView = (TextView) findViewById(R.id.ageTextView);
        collegeTextView = (TextView) findViewById(R.id.collegeTextView);
        heightTextView = (TextView) findViewById(R.id.heightTextView);

        String playerName = (String) getIntent().getExtras().get("playerName");
        nameTextView.setText(playerName);

        // Player Age
        if (playerName.equals("Dan")) {
            ageTextView.setText("Age: 22");
        }
        if (playerName.equals("Fred")) {
            ageTextView.setText("Age: 56");
        }
        if (playerName.equals("Carol")) {
            ageTextView.setText("Age: 12");
        }
        if (playerName.equals("Alex")) {
            ageTextView.setText("Age: 33");
        }

        // Player College
        if (playerName.equals("Dan")) {
            collegeTextView.setText("College: U of O");
        }
        if (playerName.equals("Fred")) {
            collegeTextView.setText("College: Boise State");
        }
        if (playerName.equals("Carol")) {
            collegeTextView.setText("College: Harvard");
        }
        if (playerName.equals("Alex")) {
            collegeTextView.setText("College: Cal State Sac");
        }

        // Player Height
        if (playerName.equals("Dan")) {
            heightTextView.setText("Height: 7'3");
        }
        if (playerName.equals("Fred")) {
            heightTextView.setText("Height: 6'5");
        }
        if (playerName.equals("Carol")) {
            heightTextView.setText("Height: 6'9");
        }
        if (playerName.equals("Alex")) {
            heightTextView.setText("Height: 8'2");
        }

       // System.out.println("The Player is here!" + playerName);
    }
}