package com.example.lewis.ipract;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class csUnitsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cs_units);

        Button firstyrBtn = (Button)findViewById(R.id.firstyrBtn);
        firstyrBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent listViewActivity = new Intent(getApplicationContext(), listViewActivity.class);
                startActivity(listViewActivity);
            }
        });
        Button secondyrBtn = (Button)findViewById(R.id.secondyrBtn);
        secondyrBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent secondyear = new Intent(getApplicationContext(), Second_year.class);
                startActivity(secondyear);
            }
        });
        Button thirdyrBtn = (Button)findViewById(R.id.thirdyrBtn);
        thirdyrBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent thirdyear = new Intent(getApplicationContext(), Third_year.class);
                startActivity(thirdyear);
            }
        });
        Button fourthyrBtn = (Button)findViewById(R.id.fourthyrBtn);
        fourthyrBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Fourthyear = new Intent(getApplicationContext(), Fourth_year.class);
                startActivity(Fourthyear);
            }
        });
    }
}
