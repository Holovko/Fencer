package com.holovko.fencer;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;

/**
 * Created by andreyholovko on 2017-12-05.
 */

public class FencerApplication extends DaggerApplication {
    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return null;
    }
}
