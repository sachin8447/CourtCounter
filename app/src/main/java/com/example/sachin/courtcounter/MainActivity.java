package com.example.sachin.courtcounter;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int a,b;
    static TextView tv1;
   static TextView tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(savedInstanceState!=null)
            onRestoreInstanceState(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle("Court Counter");


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
        if (id == R.id.exit) {
            finish();
        }

        return super.onOptionsItemSelected(item);
    }

    public void DisplayA(int no)
    {
        tv1=(TextView)findViewById(R.id.Atext);
        tv1.setText(" "+no);
    }

    public void DisplayB(int no)
    {
        tv2=(TextView)findViewById(R.id.Btext);
        tv2.setText(" "+no);
    }

    public void AaddT(View v)
    {
        a=a+3;
        DisplayA(a);
    }
    public void Aaddt(View v)
    {
        a=a+2;
        DisplayA(a);
    }
    public void BaddT(View v)
    {
        b=b+3;
        DisplayB(b);
    }
    public void Baddt(View v)
    {
       b=b+2;
        DisplayB(b);
    }
    public void Reset(View v)
    {
        a=00;
        b=00;
        DisplayB(b);
        DisplayA(a);
    }
    public void Afree(View v)
    {
        a=a-1;
        DisplayA(a);
    }
    public void Bfree(View v)
    {
        b=b-1;
        DisplayB(b);
    }
}
