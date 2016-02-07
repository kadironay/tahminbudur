package com.tahminbudur.animations;


import android.view.View;

import com.tahminbudur.animations.libs.BaseViewAnimator;
import com.nineoldandroids.animation.ObjectAnimator;

public class ZoomOutAnimator extends BaseViewAnimator{
    @Override
    protected void prepare(View target) {
        getAnimatorAgent().playTogether(
                ObjectAnimator.ofFloat(target,"alpha",1,0,0),
                ObjectAnimator.ofFloat(target,"scaleX",1,0.3f,0),
                ObjectAnimator.ofFloat(target,"scaleY",1,0.3f,0)
        );
    }
}
