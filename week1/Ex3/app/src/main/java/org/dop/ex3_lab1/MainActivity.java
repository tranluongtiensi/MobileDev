package org.dop.ex3_lab1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.text.DateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    Button btnViewTime;

    AlertDialog ad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnViewTime = findViewById(R.id.btn_viewTime);
        ad = new AlertDialog.Builder(this).create();
        btnViewTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Date t = new Date();
                DateFormat dateFormat = DateFormat.getDateTimeInstance();
                String message="thoi gian hien hanh "+ dateFormat.format(t);
                ad.setMessage(message);
                ad.show();
            }
        });
    }
}