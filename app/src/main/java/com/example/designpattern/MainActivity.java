package com.example.designpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.designpattern.patterns.adapter.player.AudioPlayer;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button adapterBtn = (Button) findViewById(R.id.adapter_btn);
        adapterBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.adapter_btn:
                AudioPlayer player=new AudioPlayer();
                player.play(6,"hello");
                break;
        }
    }
}
