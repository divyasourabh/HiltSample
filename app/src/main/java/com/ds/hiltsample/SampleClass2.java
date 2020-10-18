package com.ds.hiltsample;

import android.util.Log;

import javax.inject.Inject;

public class SampleClass2 {

    @Inject
    public SampleClass2(Dosmthing dosmthing) {
        Log.d("Test123","In Constructor SampleClass2");
        dosmthing.soSmthing();
    }

    public void printSomeMessage () {
        Log.d("Test123","Say Hello in printSomeMessage");
    }
}
