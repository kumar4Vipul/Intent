package com.example.abc.intent;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.content.Intent;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class Bank extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank);

     Bundle applesData = getIntent().getExtras();
        if(applesData== null){
        return;
        }
        String applesMessage = applesData.getString("appleMessage");
        final  TextView banktext = (TextView) findViewById(R.id.banktext);
        banktext.setText(applesMessage);
    }
public void onClick(View view){
    Intent i =new Intent(this ,Apple.class);
    startActivity(i);
}


    }



