package com.example.rss32.collabit;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

/**
 * Created by rss32 on 27/11/15.
 */
public class TeamB extends Activity {
    private RadioGroup firstRadioGroup;
    private RadioButton radioButton;
    Button submitAnswer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teamb);
        submitAnswer = (Button) findViewById(R.id.submitAnswersButton);
        submitAnswer.hasOnClickListeners();
        submitAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(TeamB.this,"Submitted Answers.Generating Report",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(TeamB.this,Report.class);
                startActivity(intent);
                finish();

            }
        });
    }
}
