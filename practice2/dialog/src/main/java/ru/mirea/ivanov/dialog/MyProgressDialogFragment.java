package ru.mirea.ivanov.dialog;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;

public class MyProgressDialogFragment {
    Context context;
    public MyProgressDialogFragment(Context context){
        this.context = context;
    }

    public void show(){
        ProgressDialog progressDialog = new ProgressDialog(context);
        progressDialog.setMessage("Идёт загрузка, подождите.");
        progressDialog.setCancelable(false);
        progressDialog.show();
    }

}
