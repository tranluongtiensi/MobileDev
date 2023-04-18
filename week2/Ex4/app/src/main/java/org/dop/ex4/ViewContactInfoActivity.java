package org.dop.ex4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ViewContactInfoActivity extends AppCompatActivity {

    private TextView txtNameValue;
    private TextView txtEmailValue;
    private TextView txtProjectValue;
    Button finishBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_contact_info);

        txtNameValue = findViewById(R.id.nameView);
        txtEmailValue = findViewById(R.id.emailView);
        txtProjectValue = findViewById(R.id.projectView);

        finishBtn =  findViewById(R.id.finishBtn);
        finishBtn.setOnClickListener(mClickListener);

        Bundle bundle = getIntent().getExtras();
        String name = bundle.getString("nameKey");
        String email = bundle.getString("emailKey");
        String project = bundle.getString("projectKey");

        txtNameValue.setText(name);
        txtEmailValue.setText(email);
        txtProjectValue.setText(project);
    }

    private View.OnClickListener mClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            finish();
        }
    };
}