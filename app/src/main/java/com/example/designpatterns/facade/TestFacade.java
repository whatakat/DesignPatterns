package com.example.designpatterns.facade;

import com.example.designpatterns.command.CeilingFan;
import com.example.designpatterns.command.Light;
import com.example.designpatterns.command.Stereo;
import com.example.designpatterns.command.Tv;

public class TestFacade {
    public static void main(String[] args) {
        Light lt = new Light("My Room");
        Tv tv = new Tv("My Room");
        Stereo st = new Stereo("my stereo");
        CeilingFan cf = new CeilingFan("my room");

        HomeTheaterFacade ht = new HomeTheaterFacade(lt,tv,st,cf);
        ht.watchMovie("Brother");
        ht.endMovie();
    }
}
