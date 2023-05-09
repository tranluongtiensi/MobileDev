package org.dop.ex3;



import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

public class GraphicsView  extends View {
    Bitmap[] frames = new Bitmap[15];
    int i = 0;
    public GraphicsView(Context context){
        super(context);
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
    }
    @Override
    protected void onDraw(Canvas canvas) {
        if(i<15){
            canvas.drawBitmap(frames[i],10,10, new Paint());
        } else {
            i=0;
        }
        invalidate();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        i++;
        return true;
    }
}

