package com.example.untitledfruits;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.untitledfruits.basket.Basket;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //referencing buttons in xml file and adding click listeners
        Button userList = findViewById(R.id.userList);
        userList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inBasket = new Intent(getApplicationContext(), Basket.class);
                startActivity(inBasket);
            }
        });

        Button userState = findViewById(R.id.userState);
        userState.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inState = new Intent(getApplicationContext(),State.class);
                startActivity(inState);
            }
        });

        Button userSeason = findViewById(R.id.userSeason);
        userSeason.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inSeason = new Intent(getApplicationContext(),Season.class);
                startActivity(inSeason);
            }
        });

        Button userColors = findViewById(R.id.userColors);
        userColors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inColors = new Intent(getApplicationContext(),Colors.class);
                startActivity(inColors);
            }
        });
    }
}
