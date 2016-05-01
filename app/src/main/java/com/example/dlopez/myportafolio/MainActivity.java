package com.example.dlopez.myportafolio;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button app1 = (Button) findViewById(R.id.app1);
        app1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                generateToast("Access to Popular Movies");
            }
        });

        Button app2 = (Button) findViewById(R.id.app2);
        app2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                generateToast("Access to Stock Hawk");
            }
        });

        Button app3 = (Button) findViewById(R.id.app3);
        app3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                generateToast("Access to Build it Bigger");
            }
        });

        Button app4 = (Button) findViewById(R.id.app4);
        app4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                generateToast("Access to Make Your Go Ubiquitous");
            }
        });

        Button app5 = (Button) findViewById(R.id.app5);
        app5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                generateToast("Access to Go Ubiquitous");
            }
        });

        Button app6 = (Button) findViewById(R.id.app6);
        app6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                generateToast("Access to Capstone" +
                        "");
            }
        });

    }

    private void generateToast(String msg){
        Toast toast = Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG);
        toast.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
