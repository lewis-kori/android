package com.example.lewis.ipract;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class departmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_department);

        Button csBtn = (Button)findViewById(R.id.csBtn);
        csBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent csUnitsActivity= new Intent(getApplicationContext(),csUnitsActivity.class);
                startActivity(csUnitsActivity);
            }
        });

        //opening an app outside this app
        Button portalBtn =(Button)findViewById(R.id.portalBtn);
        portalBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String google= "http://www.TUKENYA.AC.KE";
                Uri webaddress = Uri.parse(google);
                Intent gotoGoogle = new Intent(Intent.ACTION_VIEW,webaddress);
                if(gotoGoogle.resolveActivity(getPackageManager())!= null)
                    startActivity(gotoGoogle);
            }
        });
    }
}
