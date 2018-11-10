package com.example.lewis.ipract;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class sign_inActivity extends AppCompatActivity {
    private static EditText Reg_no;
    private static EditText password;
    private static TextView attempts;
    private static Button signInBtn;

    int attempt_counter = 5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        SignInButton();
    }

    public void SignInButton(){
        Reg_no=(EditText)findViewById(R.id.reg_noplaintxt);
        password=(EditText)findViewById(R.id.Id_PlainTxt);
        attempts = (TextView)findViewById(R.id.attempt_count);
        signInBtn = (Button)findViewById(R.id.signInBtn);

        attempts.setText(Integer.toString(attempt_counter));

        signInBtn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View p) {
                        if(Reg_no.getText().toString().equals("SCCI/00255/2016") &&
                                password.getText().toString().equals("g") ) {
                            Toast.makeText(sign_inActivity.this, "username and password is correct",
                                    Toast.LENGTH_SHORT) .show();
                            Intent departmentActivity = new Intent(getApplicationContext(), departmentActivity.class);
                            startActivity(departmentActivity);
                        } else {
                            Toast.makeText(sign_inActivity.this, "username or password is not correct",
                                    Toast.LENGTH_SHORT) .show();
                            attempt_counter -- ;
                            attempts.setText(Integer.toString(attempt_counter));
                            if(attempt_counter == 0){
                                signInBtn.setEnabled(false);
                            }
                        }
                    }
                }
        );
    }

}
