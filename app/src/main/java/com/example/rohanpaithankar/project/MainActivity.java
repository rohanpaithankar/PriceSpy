package com.example.rohanpaithankar.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button b1,b2;
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.Search);
        b2=(Button)findViewById(R.id.category);
        t=(TextView)findViewById(R.id.tap);
        b1.setOnClickListener(this);
        Animation animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
        b1.startAnimation(animation);
        b2.startAnimation(animation);
        t.startAnimation(animation);


    }
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.activity_main_menu,menu);
        return true;

    }
    public void onClick(View v){
        if(v.getId()==R.id.Search){
          Intent i=new Intent(getApplicationContext(),search_activity.class);
            startActivity(i);

        }
    }
}
