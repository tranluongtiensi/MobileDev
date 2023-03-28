package org.dop.calculator;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class HistoryAdapter extends ArrayAdapter<String> {

    private Context context;
    private List<String> history;

    public HistoryAdapter(@NonNull Context context, List<String> history) {
        super(context,0, history);
        this.context = context;
        this.history = history;
    }

    @SuppressLint("SetTextI18n")
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.text_color_layout, parent, false);
        }

        String item = history.get(position);
        TextView textView = convertView.findViewById(R.id.textView);
        textView.setText("=" + item);
        return convertView;
    }
}
