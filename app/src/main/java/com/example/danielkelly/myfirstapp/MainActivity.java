package com.example.danielkelly.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onButtonTap1 (View v) {
        Toast myToast = Toast.makeText(
                getApplicationContext(),
                "Oops!",
                Toast.LENGTH_LONG);
        myToast.show();

    }
    public void onButtonTap2 (View v) {
        Toast myToast = Toast.makeText(
                getApplicationContext(),
                "I",
                Toast.LENGTH_LONG);
        myToast.show();

    }
    public void onButtonTap3 (View v) {
        Toast myToast = Toast.makeText(
                getApplicationContext(),
                "did",
                Toast.LENGTH_LONG);
        myToast.show();

    }
    public void onButtonTap4 (View v) {
        Toast myToast = Toast.makeText(
                getApplicationContext(),
                "it",
                Toast.LENGTH_LONG);
        myToast.show();

    }
    public void onButtonTap5 (View v) {
        Toast myToast = Toast.makeText(
                getApplicationContext(),
                "again",
                Toast.LENGTH_LONG);
        myToast.show();

    }

}
