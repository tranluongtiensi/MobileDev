package org.dop.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import org.dop.calculator.databinding.ActivityHistoryBinding;

import java.util.ArrayList;
import java.util.List;

public class HistoryActivity extends AppCompatActivity {
    private ListView historyListView;
    private Button clearButton;



    private ActivityHistoryBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityHistoryBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setListeners();

        historyListView = findViewById(R.id.history_list_view);
        clearButton = findViewById(R.id.clear_button);

        Intent intent = getIntent();
        List<String> history = intent.getStringArrayListExtra("history");

        HistoryAdapter adapter = new HistoryAdapter(this, history);
        historyListView.setAdapter(adapter);


        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Clear the history list
                history.clear();

                // Update the list view
                HistoryAdapter adapter = (HistoryAdapter) historyListView.getAdapter();
                adapter.notifyDataSetChanged();
            }
        });
    }

    private void setListeners() {
        binding.calculateBtn.setOnClickListener(v -> onBackPressed());
    }
}