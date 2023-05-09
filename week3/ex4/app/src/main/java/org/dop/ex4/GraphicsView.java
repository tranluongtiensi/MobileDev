package org.dop.ex4;


import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.media.MediaPlayer;
import android.view.MotionEvent;
import android.view.View;

public class GraphicsView  extends View {
    Bitmap[] frames = new Bitmap[15];
    int i = 0;
    long last_tick=0;
    long period=200;
    Context ctext;

    MediaPlayer mPlayer;
    public GraphicsView(Context context){
        super(context);
        ctext=context;
        frames[0] = BitmapFactory.decodeResource(getResources(),R.drawable.frame1);
        frames[1] = BitmapFactory.decodeResource(getResources(),R.drawable.frame2);
        frames[2] = BitmapFactory.decodeResource(getResources(),R.drawable.frame3);
        frames[3] = BitmapFactory.decodeResource(getResources(),R.drawable.frame4);
        frames[4] = BitmapFactory.decodeResource(getResources(),R.drawable.frame5);
        frames[5] = BitmapFactory.decodeResource(getResources(),R.drawable.frame6);
        frames[6] = BitmapFactory.decodeResource(getResources(),R.drawable.frame7);
        frames[7] = BitmapFactory.decodeResource(getResources(),R.drawable.frame8);
        frames[8] = BitmapFactory.decodeResource(getResources(),R.drawable.frame9);
        frames[9] = BitmapFactory.decodeResource(getResources(),R.drawable.frame10);
        frames[10] = BitmapFactory.decodeResource(getResources(),R.drawable.frame11);
        frames[11] = BitmapFactory.decodeResource(getResources(),R.drawable.frame12);
        frames[12] = BitmapFactory.decodeResource(getResources(),R.drawable.frame13);
        frames[13] = BitmapFactory.decodeResource(getResources(),R.drawable.frame14);
        frames[14] = BitmapFactory.decodeResource(getResources(),R.drawable.frame15);

        mPlayer = MediaPlayer.create(context, R.raw.bonk);
        mPlayer.setLooping(true);
        mPlayer.start();
    }
    @Override
    protected void onDraw(Canvas canvas) {
        if (i < 15)
        {
            long time = (System.currentTimeMillis() - last_tick);
            if (time >= period)
            {
                last_tick = System.currentTimeMillis();
                canvas.drawBitmap(frames[i], 10, 10, new Paint());
                i ++;
                postInvalidate();
            }
            else
            {
                canvas.drawBitmap(frames[i],10,10, new Paint());
                postInvalidate();
            }
        }
        else {
            i=0;
            postInvalidate();
        }
    }
//    @Override
//    public boolean onTouchEvent(MotionEvent event) {
//        i++;
//        return true;
//    }
}

