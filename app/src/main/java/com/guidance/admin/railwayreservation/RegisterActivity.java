package com.guidance.admin.railwayreservation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void onregisterClick(View v) {
        if (v.getId() == R.id.registerbutton) {

            EditText pass1 = (EditText) findViewById(R.id.etpassword);
            EditText pass2 = (EditText) findViewById(R.id.etcpassword);
            Button registerbutton = (Button) findViewById(R.id.registerbutton);

            String pass1str = pass1.getText().toString();
            String pass2str = pass2.getText().toString();

            if (!pass1str.equals(pass2str)) {
                //popup msg
                Toast pass = Toast.makeText(RegisterActivity.this, "Passwords dont match", Toast.LENGTH_SHORT);
                pass.show();
            } else {
                registerbutton.setOnClickListener(
                        new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent registerIntent = new Intent(RegisterActivity.this, LoginActivity.class);
                                RegisterActivity.this.startActivity(registerIntent);
                            }
                        }
                );
            }
        }
    }
}
