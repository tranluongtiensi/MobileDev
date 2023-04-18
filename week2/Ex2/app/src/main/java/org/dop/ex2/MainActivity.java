package org.dop.ex2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radioGroup);


        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                switch (checkedId) {
                    case R.id.redRadio:
                        getWindow().getDecorView().setBackgroundColor(Color.RED);
                        break;
                    case R.id.greenRadio:
                        getWindow().getDecorView().setBackgroundColor(Color.GREEN);
                        break;
                    case R.id.blueRadio:
                        getWindow().getDecorView().setBackgroundColor(Color.BLUE);
                        break;
                }
            }
        });
    }
}