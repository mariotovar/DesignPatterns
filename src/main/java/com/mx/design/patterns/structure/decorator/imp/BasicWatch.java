package com.mx.design.patterns.structure.decorator.imp;

import com.mx.design.patterns.structure.decorator.Watch;

public class BasicWatch implements Watch {

    public void createFunctionality() {
        System.out.println(" Basic Watch with: ");
        this.addTimer();
    }

    private void addTimer() {
        System.out.print(" Timer");
    }

}