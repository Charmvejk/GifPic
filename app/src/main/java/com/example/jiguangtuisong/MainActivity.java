package com.example.jiguangtuisong;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.GlideDrawable;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.ViewTarget;

import pl.droidsonroids.gif.GifImageView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout rlTheme = findViewById(R.id.rl_theme);
        glidePic(rlTheme);
    }

    private void glidePic(LinearLayout rlTheme) {
        Glide.with(this).load(R.drawable.theme)
                .into(new ViewTarget<View, GlideDrawable>(rlTheme) {
                    //括号里为需要加载的控件
                    @Override
                    public void onResourceReady(GlideDrawable resource,
                                                GlideAnimation<? super GlideDrawable> glideAnimation) {
                        this.view.setBackground(resource.getCurrent());
                    }
                });

    }
}
