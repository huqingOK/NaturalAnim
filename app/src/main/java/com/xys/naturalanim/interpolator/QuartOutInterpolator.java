package com.xys.naturalanim.interpolator;

import com.xys.naturalanim.Calculator;

/**
 * 自定义Interpolator
 * <p>
 * Created by xuyisheng on 16/9/27.
 */
public class QuartOutInterpolator extends Calculator {

    @Override
    public float getInterpolation(float input) {
        return 1 - (input - 1) * (input - 1) * (input - 1) * (input - 1);
    }
}
