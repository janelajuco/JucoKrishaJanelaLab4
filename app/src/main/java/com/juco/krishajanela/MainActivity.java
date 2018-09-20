package com.juco.krishajanela;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("4ITE",  "onCreate() has executed.");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("4ITE",  "onStart() has executed.");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("4ITE", "onResume() has executed.");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("4ITE", "onPause() has executed.");
    }

    protected void onStop() {
        super.onStop();
        Log.d("4ITE",  "onStop() has executed.");
    }

    protected void onDestroy() {
        super.onDestroy();
        Log.d("4ITE",  "onDestroy() has executed.");
    }

    protected void onRestart() {
        super.onRestart();
        Log.d("4ITE",  "onRestart() has executed.");
    }

    public void showMessagetToast(View view) {
          Toast.makeText(this, "This is the Back Button", Toast.LENGTH_LONG).show();
        //Snackbar.make( view, "4ITE is the best", Snackbar.LENGTH_LONG).show();

    }

    public void showMessagetSnackbar(View view) {
        Snackbar.make( view, "This is the Next Button", Snackbar.LENGTH_LONG).show();

    }
}
