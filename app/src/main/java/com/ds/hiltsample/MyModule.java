package com.ds.hiltsample;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ApplicationComponent;

@InstallIn(ApplicationComponent.class)
@Module
class MyModule {

    @Singleton
    @Provides
    public String provideString() {
        return "Some String";
    };

    @Singleton
    @Provides
    public SomeInterfaceImpl provideSomeInterfaceImpl(String s) {
        return new SomeInterfaceImpl();
    }
}
