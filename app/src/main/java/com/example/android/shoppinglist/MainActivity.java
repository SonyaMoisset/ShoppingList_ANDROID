package com.example.android.shoppinglist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView itemOneTextView = findViewById(R.id.item_one);
        TextView itemTwoTextView = findViewById(R.id.item_two);
        TextView itemThreeTextView = findViewById(R.id.item_three);
        TextView itemFourTextView = findViewById(R.id.item_four);
        TextView itemFiveTextView = findViewById(R.id.item_five);
        TextView itemSixTextView = findViewById(R.id.item_six);
        TextView itemSevenTextView = findViewById(R.id.item_seven);
        TextView itemEightTextView = findViewById(R.id.item_eight);
        TextView itemNineTextView = findViewById(R.id.item_nine);
        TextView itemTenTextView = findViewById(R.id.item_ten);


        Intent intent = getIntent();
        String milk = intent.getStringExtra(SecondActivity.MILK);
        String water = intent.getStringExtra(SecondActivity.WATER);
        String tea = intent.getStringExtra(SecondActivity.TEA);
        String coffee = intent.getStringExtra(SecondActivity.COFFEE);
        String soda = intent.getStringExtra(SecondActivity.SODA);
        String bread = intent.getStringExtra(SecondActivity.BREAD);
        String sugar = intent.getStringExtra(SecondActivity.SUGAR);
        String salt = intent.getStringExtra(SecondActivity.SALT);
        String chicken = intent.getStringExtra(SecondActivity.CHICKEN);
        String fish = intent.getStringExtra(SecondActivity.FISH);

        itemOneTextView.setText(milk);
        itemTwoTextView.setText(water);
        itemThreeTextView.setText(tea);
        itemFourTextView.setText(coffee);
        itemFiveTextView.setText(soda);
        itemSixTextView.setText(bread);
        itemSevenTextView.setText(sugar);
        itemEightTextView.setText(salt);
        itemNineTextView.setText(chicken);
        itemTenTextView.setText(fish);
    }

    public void addItem(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}
