package com.example.designpattern.patterns.adapter.player;

import android.util.Log;

import com.example.designpattern.patterns.adapter.MediaAdapter;
import com.example.designpattern.patterns.adapter.interfaces.MediaPlayer;

/**
 * Created by Admin on 2/8/2017.
 */

public class AudioPlayer implements MediaPlayer {
    private MediaAdapter mediaAdapter;
    @Override
    public void play(int type, String fileName) {
        mediaAdapter=new MediaAdapter(type);
        if (type==0){
            mediaAdapter.play(type,fileName);
        }else if (type==1){
            mediaAdapter.play(type,fileName);
        }else{
            Log.i("MEDIA PLAYER","Audio");
        }
    }
}
