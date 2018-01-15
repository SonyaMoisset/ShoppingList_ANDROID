package com.example.android.shoppinglist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    public static final String MILK = "Milk";
    public static final String WATER = "Water";
    public static final String TEA = "Tea";
    public static final String COFFEE = "Coffee";
    public static final String SODA = "Soda";
    public static final String BREAD = "Bread";
    public static final String SUGAR = "Sugar";
    public static final String SALT = "Salt";
    public static final String CHICKEN = "Chicken";
    public static final String FISH = "Fish";

    private Button mMilkButton, mWaterButton, mTeaButton, mCoffeeButton, mSodaButton;
    private Button mBreadButton, mSugarButton, mSaltButton, mChickenButton, mFishButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mMilkButton = findViewById(R.id.milk);
        mWaterButton = findViewById(R.id.water);
        mTeaButton = findViewById(R.id.tea);
        mCoffeeButton = findViewById(R.id.coffee);
        mSodaButton = findViewById(R.id.soda);
        mBreadButton = findViewById(R.id.bread);
        mSugarButton = findViewById(R.id.sugar);
        mSaltButton = findViewById(R.id.salt);
        mChickenButton = findViewById(R.id.chicken);
        mFishButton = findViewById(R.id.fish);
    }

    public void addMilk(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        String milk = mMilkButton.getText().toString();

        intent.putExtra(MILK, milk);
        startActivity(intent);
    }

    public void addWater(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        String water = mWaterButton.getText().toString();

        intent.putExtra(WATER, water);
        startActivity(intent);
    }

    public void addTea(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        String tea = mTeaButton.getText().toString();

        intent.putExtra(TEA, tea);
        startActivity(intent);
    }

    public void addCoffee(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        String coffee = mCoffeeButton.getText().toString();

        intent.putExtra(COFFEE, coffee);
        startActivity(intent);
    }

    public void addSoda(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        String soda = mSodaButton.getText().toString();

        intent.putExtra(SODA, soda);
        startActivity(intent);
    }

    public void addBread(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        String bread = mBreadButton.getText().toString();

        intent.putExtra(BREAD, bread);
        startActivity(intent);
    }

    public void addSugar(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        String sugar = mSugarButton.getText().toString();

        intent.putExtra(SUGAR, sugar);
        startActivity(intent);
    }

    public void addSalt(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        String salt = mSaltButton.getText().toString();

        intent.putExtra(SALT, salt);
        startActivity(intent);
    }

    public void addChicken(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        String chicken = mChickenButton.getText().toString();

        intent.putExtra(CHICKEN, chicken);
        startActivity(intent);
    }

    public void addFish(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        String fish = mFishButton.getText().toString();

        intent.putExtra(FISH, fish);
        startActivity(intent);
    }
}
