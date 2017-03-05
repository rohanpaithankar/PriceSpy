package com.example.rohanpaithankar.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=(Button)findViewById(R.id.Search);
        b.setOnClickListener(this);
    }
    public void onClick(View v){
        if(v.getId()==R.id.Search){
          Intent i=new Intent(getApplicationContext(),search_activity.class);
            startActivity(i);

        }
    }
}
