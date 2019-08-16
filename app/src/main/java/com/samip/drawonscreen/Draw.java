package com.samip.drawonscreen;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.view.View;

public class Draw extends View {

    private Paint greenBrush;
    private Paint redBrush;
    private LinearGradient linearGradient;
    private RadialGradient radialGradient;
    private SweepGradient sweepGradient;
    private Bitmap bitmap;

    public Draw(Context context) {
        super(context);
        init();
    }


    private void init(){
        // instantiating a paints
        greenBrush = new Paint(Paint.ANTI_ALIAS_FLAG);
        redBrush = new Paint(Paint.ANTI_ALIAS_FLAG);

        // instantiating a gradients
        linearGradient = new LinearGradient(0f,0f,200f,200f,Color.RED,Color.BLUE, Shader.TileMode.MIRROR);
        radialGradient = new RadialGradient(0f,0f,20,Color.GRAY,Color.BLACK, Shader.TileMode.REPEAT);
        sweepGradient = new SweepGradient(0f,0f,Color.YELLOW,Color.BLUE);

        // instantiating bitmap
        bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.test);

        // setting color
        greenBrush.setColor(Color.parseColor("green"));
        greenBrush.setStrokeWidth(30f);
        greenBrush.setShader(radialGradient);

        redBrush.setColor(Color.RED);
        redBrush.setShader(linearGradient);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        // draw circle and line on screen using canvas
//        canvas.drawCircle(getMeasuredWidth()/2,getMeasuredHeight()/2,400f,redBrush);
//        canvas.drawLine(getMeasuredWidth()/2,0f,100f,150f,greenBrush);

        // draw bitmap on canvas
        canvas.drawBitmap(bitmap,(getMeasuredWidth()/2) - (bitmap.getWidth()/2),(getMeasuredHeight()/2) - (bitmap.getHeight()/2),null);

        // to save
        canvas.save();
        super.onDraw(canvas);
    }
}
