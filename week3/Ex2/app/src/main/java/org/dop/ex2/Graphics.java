package org.dop.ex2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Graphics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new GraphicsView(this));
    }
}