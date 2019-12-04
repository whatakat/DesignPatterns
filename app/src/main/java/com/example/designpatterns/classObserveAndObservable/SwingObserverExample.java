package com.example.designpatterns.classObserveAndObservable;

import android.net.wifi.p2p.WifiP2pManager;

public class SwingObserverExample {
    JFrame frame;

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go;
    }
    public void go(){
        frame = new JFrame();
        JButton button = new JButton("Should I do it?");
        button.addActionListener(new AngelListener());
        button.sddActionListener(new DevilListener());
    }
    class AngelListener {}

}
