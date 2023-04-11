package com.project.myapplication;

import android.app.Activity;
import android.app.AlertDialog;
import android.view.LayoutInflater;

public class newfilmins3 {

    Activity activity;
    AlertDialog alertDialog;

    newfilmins3(Activity myActivity)
    {
        activity = myActivity;
    }

    void startLoding(){
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);

        LayoutInflater inflater = activity.getLayoutInflater();
        builder.setView(inflater.inflate(R.layout.newfilm3, null));
        builder.setCancelable(false);


        alertDialog = builder.create();
        alertDialog.show();

    }

    public void dismis(){
        alertDialog.dismiss();
    }
}
