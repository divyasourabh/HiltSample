package com.ds.hiltsample;

import android.util.Log;

import javax.inject.Inject;

public class Dosmthing {

    @Inject
    public Dosmthing() {
        Log.d("Test123","In Constructor Dosmthing");
    }


    public void soSmthing() {
        Log.d("Test123","Doing Something");
    }
}
