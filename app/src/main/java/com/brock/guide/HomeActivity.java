package com.brock.guide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Timer;
import java.util.TimerTask;

public class HomeActivity extends AppCompatActivity {

    private Button buttonResto,buttonHotel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        buttonResto = (Button) findViewById(R.id.buttonResto);
        buttonHotel = (Button) findViewById(R.id.buttonHotel);

        buttonResto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this,ListingActivity.class);
                intent.putExtra("isResto",true);
                startActivity(intent);
            }
        });
        buttonHotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this,ListingActivity.class);
                intent.putExtra("isResto",false);
                startActivity(intent);
            }
        });
    }
}
