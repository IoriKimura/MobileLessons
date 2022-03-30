package ru.mirea.ivanov.practice3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle arguments = getIntent().getExtras();
        String time = arguments.get("time").toString();
        TextView textView = findViewById(R.id.textView);
        textView.setText(time);
    }
}