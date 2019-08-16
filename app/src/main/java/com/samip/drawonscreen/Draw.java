package com.samip.drawonscreen;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.print.PrintAttributes;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class Draw extends View {

    private Paint greenBrush;
    private Paint redBrush;

    public Draw(Context context) {
        super(context);
    }


    private void init(){
        greenBrush = new Paint(Paint.ANTI_ALIAS_FLAG);
        redBrush = new Paint(Paint.ANTI_ALIAS_FLAG);

        // setting color
        greenBrush.setColor(Color.parseColor("green"));
        redBrush.setColor(Color.RED);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        // to draw on screen using canvas
        canvas.drawCircle(getMeasuredWidth()/2,getMeasuredHeight()/2,100f,redBrush);
        canvas.drawLine(getMeasuredWidth()/2,0f,100f,150f,greenBrush);

        // to save
        canvas.save();
        super.onDraw(canvas);
    }
}
