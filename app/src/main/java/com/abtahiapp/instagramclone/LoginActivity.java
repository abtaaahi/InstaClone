package com.abtahiapp.instagramclone;/*
package com.abtahiapp.instagramclone;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.text.TextWatcher;
import android.widget.Toast;
public class LoginActivity extends AppCompatActivity {
    EditText et1,et2; Button login; int count=3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();

        et1=findViewById(R.id.editTextText);
        et2=findViewById(R.id.editTextTextPassword);
        login=findViewById(R.id.button);
        login.setEnabled(false);
        login.setBackgroundTintList(getResources().getColorStateList(R.color.disabled_background_tint));
        login.setTextColor(getResources().getColor(R.color.disabled_text_color));
        et1.addTextChangedListener(textWatcher);
        et2.addTextChangedListener(textWatcher);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et1.getText().toString().equals("abc") && et2.getText().toString().equals("123")) {
                    Toast.makeText(getApplicationContext(),"Log In Successful..",Toast.LENGTH_SHORT).show();
                    Intent i=new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(i);
                }
                else{
                    Toast.makeText(getApplicationContext(),"Wrong Password",Toast.LENGTH_SHORT).show();
                    count--;
                    if(count==0){
                        Toast.makeText(getApplicationContext(),"Too many attempts\nTry after few minutes.",Toast.LENGTH_SHORT).show();
                        login.setEnabled(false);
                        login.setBackgroundTintList(getResources().getColorStateList(R.color.disabled_background_tint));
                        login.setTextColor(getResources().getColor(R.color.disabled_text_color));
                    }
                }
            }
        });
    }
    private TextWatcher textWatcher=new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            String email=et1.getText().toString();
            String password=et2.getText().toString();
            login.setEnabled(!email.isEmpty() && !password.isEmpty());
            if (login.isEnabled()) {
                login.setBackgroundTintList(getResources().getColorStateList(R.color.enabled_background_tint));
                login.setTextColor(Color.WHITE);
            } else {
                login.setBackgroundTintList(getResources().getColorStateList(R.color.disabled_background_tint));
                login.setTextColor(getResources().getColor(R.color.disabled_text_color));
            }
        }
        @Override
        public void afterTextChanged(Editable s) {
        }
    };
}
*/

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.abtahiapp.instagramclone.MainActivity;
import com.abtahiapp.instagramclone.R;

public class LoginActivity extends AppCompatActivity {
    EditText et1, et2;
    Button login;
    int count = 3;
    SharedPreferences sharedPref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();

        sharedPref = getSharedPreferences(getString(R.string.preference_file_key), Context.MODE_PRIVATE);

        et1 = findViewById(R.id.editTextText);
        et2 = findViewById(R.id.editTextTextPassword);
        login = findViewById(R.id.button);
        login.setEnabled(false);
        et1.addTextChangedListener(textWatcher);
        et2.addTextChangedListener(textWatcher);

        // Check if the user is already logged in
        if (sharedPref.getBoolean(getString(R.string.logged_in_key), false)) {
            // Start MainActivity
            Intent i = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(i);
            finish(); // Finish LoginActivity to prevent going back to it when pressing back
        }

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et1.getText().toString().equals("abc") && et2.getText().toString().equals("123")) {
                    Toast.makeText(getApplicationContext(),"Log In Successful..",Toast.LENGTH_SHORT).show();
                    // Save login state
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putBoolean(getString(R.string.logged_in_key), true);
                    editor.apply();

                    // Start MainActivity
                    Intent i = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(i);
                    finish(); // Finish LoginActivity to prevent going back to it when pressing back
                } else {
                    Toast.makeText(getApplicationContext(),"Wrong Password",Toast.LENGTH_SHORT).show();
                    count--;
                    if (count == 0) {
                        Toast.makeText(getApplicationContext(),"Too many attempts\nTry after few minutes.",Toast.LENGTH_SHORT).show();
                        login.setEnabled(false);
                    }
                }
            }
        });
    }

    private TextWatcher textWatcher=new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            String email = et1.getText().toString();
            String password = et2.getText().toString();
            login.setEnabled(!email.isEmpty() && !password.isEmpty());
        }

        @Override
        public void afterTextChanged(Editable s) {
        }
    };
}
