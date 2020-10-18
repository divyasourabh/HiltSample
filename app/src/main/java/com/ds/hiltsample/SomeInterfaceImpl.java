package com.ds.hiltsample;

import javax.inject.Inject;

public class SomeInterfaceImpl implements SomeInterface {

    @Inject
    public SomeInterfaceImpl() {
    }

    @Inject
    @Override
    public String getAString() {
        return "String for Sample ";
    }
}
