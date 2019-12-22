package com.example.designpatterns.facade;

import com.example.designpatterns.command.CeilingFan;
import com.example.designpatterns.command.Light;
import com.example.designpatterns.command.Stereo;
import com.example.designpatterns.command.Tv;

public class HomeTheaterFacade {
    Light light;
    Tv tv;
    Stereo stereo;
    CeilingFan ceilingFan;

    public HomeTheaterFacade(Light light, Tv tv, Stereo stereo, CeilingFan ceilingFan){
        this.ceilingFan = ceilingFan;
        this.light = light;
        this.stereo = stereo;
        this.tv = tv;
    }
    public void watchMovie(String movie){
        System.out.println("Get ready to watch movie...");
        light.on();
        tv.on();
        stereo.on();
        ceilingFan.low();
    }
    public void endMovie(){
        System.out.println("Shutting movie theater down...");
        ceilingFan.off();
        stereo.off();
        tv.off();
        light.off();
    }


}
