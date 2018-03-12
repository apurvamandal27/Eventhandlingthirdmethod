package com.example.android.eventhandlingthirdmethod;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

   public void display(View v){
       Toast.makeText(this, "event handling with direct way", Toast.LENGTH_SHORT).show();
   }
}
