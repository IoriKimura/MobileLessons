package ru.mirea.ivanov.looper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Message;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MyLooper Looper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Looper = new MyLooper();
        Looper.start();
    }

    public void onClick(View view) {
        Message msg = new Message();
        Bundle bundle = new Bundle();
        bundle.putString("KEY", "19/Student");
        msg.setData(bundle);
        if (Looper != null) {
            Looper.handler.sendMessage(msg);
        }
    }
}