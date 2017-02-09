package com.example.designpattern.patterns.adapter.player;

import android.util.Log;

import com.example.designpattern.patterns.adapter.interfaces.AdvanceMediaPlayer;

/**
 * Created by Admin on 2/8/2017.
 */

public class VclPlayer implements AdvanceMediaPlayer{
    @Override
    public void playMp4(String fileName) {
        //do nothing
    }

    @Override
    public void playVcl(String fileName) {
        Log.i("MEDIA PLAYER","play vcl");
    }
}
