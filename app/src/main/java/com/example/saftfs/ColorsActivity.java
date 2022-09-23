package com.example.saftfs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ColorsActivity extends AppCompatActivity {

    private ConstraintLayout mConstraintLayout;
    private TextView mInfoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        mConstraintLayout = findViewById(R.id.ConsL);

        Button BtnRed = findViewById(R.id.BtnRed);
        BtnRed.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "Красный",Toast.LENGTH_LONG).show();
                mConstraintLayout.setBackgroundColor(ContextCompat
                .getColor(ColorsActivity.this, R.color.RedColor));
            }
        });

    }
    public void onGreenButtonClick(View view) {
        Toast.makeText(getApplicationContext(),
                "Зеленый",Toast.LENGTH_LONG).show();
        mConstraintLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.GreenColor));
    }

    public void onBlueButtonClick(View view) {
        Toast.makeText(getApplicationContext(),
                "Синий",Toast.LENGTH_LONG).show();
        mConstraintLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.BlueColor));
    }

    public void onWhiteButtonClick(View view) {
        Toast.makeText(getApplicationContext(),
                "Белый",Toast.LENGTH_LONG).show();
        mConstraintLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.WhiteColor));
    }

    public void onBlackButtonClick(View view) {
        Toast.makeText(getApplicationContext(),
                "Черный",Toast.LENGTH_LONG).show();
        mConstraintLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.BlackColor));
    }
}