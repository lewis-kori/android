package com.example.lewis.ipract;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sign_upActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        Button sUBtn =(Button)findViewById(R.id.sUBtn);
        sUBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent departmentActivity = new Intent(getApplicationContext(),departmentActivity.class);
                startActivity(departmentActivity);
            }
        });


    }
}
