package com.Dyuti.Trial_6_Comb;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.unity3d.player.UnityPlayerActivity;

public class IntroActivity extends AppCompatActivity {

    Animation sAnim;
    TextView intro,tv3,tv4,tv5;
    Button skip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        sAnim = AnimationUtils.loadAnimation(this,R.anim.slide);
        intro = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);
        tv4 = findViewById(R.id.tv4);
        tv5 = findViewById(R.id.tv5);
        skip = findViewById(R.id.button);

        intro.setAnimation(sAnim);
        tv3.setAnimation(sAnim);
        tv4.setAnimation(sAnim);
        tv5.setAnimation(sAnim);

        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(IntroActivity.this, UnityPlayerActivity.class));
            }
        });

    }
}