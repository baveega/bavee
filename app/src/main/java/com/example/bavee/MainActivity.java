package com.example.bavee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button showProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showProfile = findViewById(R.id.showButton);

        showProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lanchActivity();

            }
        });
    }

    public void lanchActivity() {
        Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);
    }
}