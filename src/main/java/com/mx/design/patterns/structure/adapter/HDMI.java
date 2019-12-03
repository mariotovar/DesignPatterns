package com.mx.design.patterns.structure.adapter;

public class HDMI{
	
    public HDMI(){
    	System.out.println("Create new connector HDMI.");
    }

    public void getVideoHD(){
    	System.out.println("Video HDMI.");
    }

    public void getAudioHD(){
    	System.out.println("Audio HDMI.");
    }

}