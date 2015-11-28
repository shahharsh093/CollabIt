package com.example.rss32.collabit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Join extends AppCompatActivity {
    Button beginButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join);
        beginButton = (Button) findViewById(R.id.joinButton);
        beginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Join.this,TeamA.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
