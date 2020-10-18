package com.ds.hiltsample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class MainActivity extends AppCompatActivity {

    @Inject
    Dosmthing dosmthing;

    @Inject
    SampleClass2 sampleClass2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dosmthing.soSmthing();
        Log.d("Test123","Second Method");
        sampleClass2.printSomeMessage();
    }

}