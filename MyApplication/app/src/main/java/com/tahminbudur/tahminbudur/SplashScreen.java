package com.tahminbudur.tahminbudur;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.nineoldandroids.animation.Animator;
import com.tahminbudur.animations.libs.Techniques;
import com.tahminbudur.animations.libs.YoYo;

public class SplashScreen extends Activity{

    private static final String TAG = SplashScreen.class.getSimpleName();
    // Splash screen timer
    private static int SPLASH_TIME_OUT = 1;
    private static boolean initialized = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(initialized)
        {
            Intent i = new Intent(SplashScreen.this, MainActivity.class);
            startActivity(i);

            // close this activity
            finish();
            return;
        }

        initialized = true;

        setContentView(R.layout.activity_splash);

        YoYo.with(Techniques.FadeInUp)
                .duration(1500)
                .withListener(new Animator.AnimatorListener() {
                    @Override
                    public void onAnimationStart(Animator animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animator animation) {

                        Intent i = new Intent(SplashScreen.this, MainActivity.class);
                        startActivity(i);

                        // close this activity
                        finish();
                    }

                    @Override
                    public void onAnimationCancel(Animator animation) {
                    }

                    @Override
                    public void onAnimationRepeat(Animator animation) {

                    }
                })
                .playOn(findViewById(R.id.splashImageView));
    }
}
