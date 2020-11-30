package com.example.worldskillsbank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TableLayout;

public class MainActivity extends AppCompatActivity {

    private Button act_two;
    private TableLayout act_curs;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        addListenerOnButton();
    }
    public void addListenerOnButton(){
        act_two = (Button) findViewById(R.id.button2);
        act_curs = (TableLayout) findViewById(R.id.qqqq);

        act_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("android.intent.action.ScrollingActivity");
                startActivity(intent);
            }
        });
        act_curs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("android.intent.action.Curs");
                startActivity(intent);
            }
        });
    }

}