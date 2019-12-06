package com.mx.design.patterns.structure.decorator.imp;

import com.mx.design.patterns.structure.decorator.Watch;

public abstract class WatchDecorator implements Watch {

    private final Watch watch;

    public WatchDecorator(Watch watch) {
        this.watch = watch;
    }

    public void createFunctionality() {
        this.watch.createFunctionality();
    }

}
