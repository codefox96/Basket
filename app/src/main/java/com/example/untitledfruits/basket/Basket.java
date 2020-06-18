package com.example.untitledfruits.basket;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.example.untitledfruits.R;

import java.util.ArrayList;

public class Basket extends AppCompatActivity {
    ArrayList<String> allFruit;
    ArrayAdapter<String> adaptFruit;
    ListView userPick;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basket);
        setup();
        Button userBasket = (findViewById(R.id.userBasket));
        userBasket.setOnClickListener((new View.OnClickListener() {
            //////////////////////"SAVE POINT": CONTINUE BUTTON IMPLEMENTATION//////////////////////
            @Override
            public void onClick(View v) {
                Intent openBasket = new Intent(getApplicationContext(), inBasket.class);
                startActivity(openBasket);
            }
        }));


        fruit a1 = new fruit("Apple","pome",false);
        allFruit.add(a1.name);

        fruit a2 = new fruit("Pear","pome",false);
        allFruit.add(a2.name);

        fruit a3 = new fruit("Apricot","drupe",false);
        allFruit.add(a3.name);

        fruit a4 = new fruit("Peach","drupe",false);
        allFruit.add(a4.name);

        fruit a5 = new fruit("Blueberry","berry",false);
        allFruit.add(a5.name);

        fruit a6 = new fruit("Strawberry","berry",false);
        allFruit.add(a6.name);

        fruit a7 = new fruit("Watermelon","melon",false);
        allFruit.add(a7.name);

        fruit a8 = new fruit("Cantaloupe","melon",false);
        allFruit.add(a8.name);

        fruit a9 = new fruit("Lemon","citrus",false);
        allFruit.add(a9.name);

        fruit a10 = new fruit("Mandarin","citrus",false);
        allFruit.add(a10.name);

    }

    //creates an array list and adapts objects to the ListView in the xml
    public void setup(){
        allFruit = new ArrayList<>();
        adaptFruit = new ArrayAdapter<>(this,android.R.layout.simple_expandable_list_item_1 ,allFruit);
        userPick = findViewById(R.id.userPick);
        userPick.setAdapter(adaptFruit);
    }

}
