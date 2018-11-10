package com.example.lewis.ipract;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button sign_upBtn=(Button)findViewById(R.id.sign_upBtn);
        sign_upBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sign_upActivity = new Intent(getApplicationContext(), sign_upActivity.class);
                startActivity(sign_upActivity);
            }
        });

        Button sign_inBtn =(Button)findViewById(R.id.sign_inBtn);
        sign_inBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sign_inActivity = new Intent(getApplicationContext(), sign_inActivity.class);
                startActivity(sign_inActivity);
            }
        });


    }
}
