package com.example.android.shoppinglist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    public static final String MILK = "milk";
    public static final String WATER = "water";
    public static final String TEA = "tea";
    public static final String COFFEE = "coffee";
    public static final String SODA = "soda";
    public static final String BREAD = "bread";
    public static final String SUGAR = "sugar";
    public static final String SALT = "salt";
    public static final String CHICKEN = "chicken";
    public static final String FISH = "fish";

    Button mMilkButton, mWaterButton, mTeaButton, mCoffeeButton, mSodaButton;
    Button mBreadButton, mSugarButton, mSaltButton, mChickenButton, mFishButton;

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

    public void addItem(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        Bundle extras = new Bundle();

        extras.putString(MILK, mMilkButton.getText().toString());
        extras.putString(WATER, mWaterButton.getText().toString());
        extras.putString(TEA, mTeaButton.getText().toString());
        extras.putString(COFFEE, mCoffeeButton.getText().toString());
        extras.putString(SODA, mSodaButton.getText().toString());
        extras.putString(BREAD, mBreadButton.getText().toString());
        extras.putString(SUGAR, mSugarButton.getText().toString());
        extras.putString(SALT, mSaltButton.getText().toString());
        extras.putString(CHICKEN, mChickenButton.getText().toString());
        extras.putString(FISH, mFishButton.getText().toString());

        intent.putExtras(extras);
        Log.d("extras", String.valueOf(extras));
        startActivity(intent);
    }
}
