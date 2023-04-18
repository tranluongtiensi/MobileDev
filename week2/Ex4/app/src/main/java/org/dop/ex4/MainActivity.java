package org.dop.ex4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.QuickViewConstants;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    private Button button;
    private EditText edt1,edt2,edt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.viewBtn);
        edt1 = findViewById(R.id.nameEdt);
        edt2 = findViewById(R.id.emailEdt);
        edt3 = findViewById(R.id.projectEdt);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iGetContactInfo = new Intent(getApplicationContext(), ViewContactInfoActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("nameKey", edt1.getText().toString());
                bundle.putString("emailKey", edt2.getText().toString());
                bundle.putString("projectKey", edt3.getText().toString());
                iGetContactInfo.putExtras(bundle);

                startActivity(iGetContactInfo);
            }
        });
    }

}