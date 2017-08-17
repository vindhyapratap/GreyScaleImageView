package com.grayscaleimageview;

import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.support.annotation.Nullable;
import android.util.AttributeSet;

/**
 * Created by Vindhya Pratap on 17-08-2017.
 * Simple Image View for making an Image Black and white
 */

public class GrayScaleImageView extends android.support.v7.widget.AppCompatImageView{
    public GrayScaleImageView(Context context) {
        super(context);
    }

    public GrayScaleImageView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public GrayScaleImageView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        ColorMatrix matrix = new ColorMatrix();
        matrix.setSaturation(0);

        ColorMatrixColorFilter filter = new ColorMatrixColorFilter(matrix);
        setColorFilter(filter);
    }
}
