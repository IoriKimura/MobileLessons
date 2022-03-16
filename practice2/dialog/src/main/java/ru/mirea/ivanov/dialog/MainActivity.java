package ru.mirea.ivanov.dialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickShowDialog(View view){
        MyDialogFragment dialogFragment = new MyDialogFragment();
        dialogFragment.show(getSupportFragmentManager(), "MIREA");
    }

    public void onOkClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"Иду дальше\"!",
                Toast.LENGTH_LONG).show();
    }
    public void onCancelClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"Нет\"!",
                Toast.LENGTH_LONG).show();
    }
    public void onNeutralClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"На паузе\"!",
                Toast.LENGTH_LONG).show();
    }

    public void onClickTime(View view){
        MyTimeDialogFragment myTimeDialogFragment = new MyTimeDialogFragment();
        Calendar curTime = Calendar.getInstance();
        int hour = curTime.get(Calendar.HOUR_OF_DAY);
        int minute = curTime.get(Calendar.MINUTE);

        myTimeDialogFragment.TimePickerDialog(this, 0, ,hour, minute, true);
        myTimeDialogFragment.show();
    }

    public void onClickDate(View view){

    }

    public void onClickProgress(View view){

    }
}