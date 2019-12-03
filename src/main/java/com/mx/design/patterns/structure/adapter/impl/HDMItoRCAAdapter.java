package com.mx.design.patterns.structure.adapter.impl;

import com.mx.design.patterns.structure.adapter.HDMI;
import com.mx.design.patterns.structure.adapter.IRCA;

public class HDMItoRCAAdapter extends HDMI implements IRCA{

    public void getVideoAnalogic(){
       this.getVideoRCA();
    }

    public void getAudioAnalogic(){
        this.getAudioRCA();
    }
    
    private void getVideoRCA(){
    	this.getVideoHD();
        System.out.println("Convert video HD to Video RCA");
    }

    private void getAudioRCA(){
    	this.getAudioHD();
        System.out.println("Convert audio HD to audio RCA");
    }

}
