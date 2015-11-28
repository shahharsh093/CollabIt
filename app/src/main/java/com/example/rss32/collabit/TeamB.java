package com.example.rss32.collabit;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
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
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(TeamB.this);
                alertDialogBuilder.setMessage("Team A and Team B have finished answering the questions. Do you want to see the results ?");
                alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {
//                        Toast.makeText(TeamB.this, "You clicked yes button", Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(TeamB.this,Report.class);
                        startActivity(intent);
                        finish();

                    }
                });
                alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(TeamB.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }
        });

            }

}
