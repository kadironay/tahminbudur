package com.tahminbudur.animations.libs;

import com.tahminbudur.animations.SlideInUpAnimator;
import com.tahminbudur.animations.ZoomOutAnimator;

public enum Techniques {

    SlideInUp(SlideInUpAnimator.class),
    ZoomOut(ZoomOutAnimator.class),
    Landing(LandingAnimator.class),
    TakingOff(TakingOffAnimator.class),
    FadeInUp(FadeInUpAnimator.class);

    private Class animatorClazz;

    private Techniques(Class clazz) {
        animatorClazz = clazz;
    }

    public BaseViewAnimator getAnimator() {
        try {
            return (BaseViewAnimator) animatorClazz.newInstance();
        } catch (Exception e) {
            throw new Error("Can not init animatorClazz instance");
        }
    }
}
