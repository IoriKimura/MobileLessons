package com.mirea.ivanov.clickbuttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button buttonOk;
    private Button buttonCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.tvOut);
        buttonOk = (Button) findViewById(R.id.btnOK);
        buttonCancel = (Button) findViewById(R.id.btnCancel);

        View.OnClickListener oclBtnok = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Нажата кнопка OK");
            }
        };
        buttonOk.setOnClickListener(oclBtnok);
        View.OnClickListener oclBtnС = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Теперь нажата Cancel");
            }
        };
        buttonCancel.setOnClickListener(oclBtnС);

    }
}