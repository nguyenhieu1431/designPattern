package com.example.designpattern.patterns.adapter;

import com.example.designpattern.patterns.adapter.interfaces.AdvanceMediaPlayer;
import com.example.designpattern.patterns.adapter.interfaces.MediaPlayer;
import com.example.designpattern.patterns.adapter.player.Mp4Player;
import com.example.designpattern.patterns.adapter.player.VclPlayer;

/**
 * Created by Admin on 2/8/2017.
 */

public class MediaAdapter implements MediaPlayer {
    private AdvanceMediaPlayer mAdvanceMediaPlayer;

    public MediaAdapter(int type) {
        if (type == 0) {
            mAdvanceMediaPlayer = new VclPlayer();
        } else if (type == 1) {
            mAdvanceMediaPlayer = new Mp4Player();
        }
    }


    @Override
    public void play(int type, String fileName) {
        if (type == 0) {
            mAdvanceMediaPlayer.playVcl(fileName);
        } else if (type == 1) {
            mAdvanceMediaPlayer.playMp4(fileName);
        }
    }
}
