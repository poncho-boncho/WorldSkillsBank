package com.example.worldskillsbank;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Curs extends AppCompatActivity {

    private Button act_home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_curs);
        getSupportActionBar().hide();
        addListenerOnButton();
    }

    public void addListenerOnButton(){
        act_home = (Button) findViewById(R.id.b2);

        act_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}