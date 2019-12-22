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


}
