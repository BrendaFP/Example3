package com.example.brend.myfirstapp;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        context = getApplicationContext();


        /* Toast--------------------------------------------------------------------------*/

        Toast MyToast = new Toast(context);
        MyToast.makeText(context, "This is a Toast Message in this Lab", Toast.LENGTH_LONG).show();


        /* Input Text Dialog -------------------------------------------------------------*/


        AlertDialog.Builder DialogConf = new AlertDialog.Builder(this);

        DialogConf.setTitle("Confirmation Dialog");
        DialogConf.setMessage("This is the Text of the Dialog");
        DialogConf.setIcon(R.mipmap.ic_launcher);

        DialogConf.setNeutralButton("Close",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Toast.makeText(context, "You closed the dialog.", Toast.LENGTH_LONG).show();
                    }
                });


        AlertDialog MyDialog = DialogConf.create();
        MyDialog.show();


        /*Buttons ----------------------------------------------------------------*/

        AlertDialog.Builder SecondDialogConf = new AlertDialog.Builder(this);

        SecondDialogConf.setTitle("Confirmation Dialog");
        SecondDialogConf.setMessage("This is the Text of the Dialog");
        SecondDialogConf.setIcon(R.mipmap.ic_launcher);

        SecondDialogConf.setPositiveButton("Yes",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Toast.makeText(context, "You answer Yes.", Toast.LENGTH_LONG).show();

                    }
                });

        SecondDialogConf.setNegativeButton("No",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Toast.makeText(context, "You answer No.", Toast.LENGTH_LONG).show();
                    }
                });

        SecondDialogConf.setNeutralButton("Close",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Toast.makeText(context, "You closed the dialog.", Toast.LENGTH_LONG).show();
                    }
                });

        AlertDialog MySecondDialog = SecondDialogConf.create();
        MySecondDialog.show();


        /*Text Input Notification --------------------------------------------------------*/


        AlertDialog.Builder ThirdDialogConf = new AlertDialog.Builder(this);

        ThirdDialogConf.setTitle("Confirmation Dialog");
        ThirdDialogConf.setMessage("This is the Text of the Dialog");
        ThirdDialogConf.setIcon(R.mipmap.ic_launcher);
        final EditText TextInput = new EditText(context);
        TextInput.setTextColor(Color.BLUE);
        ThirdDialogConf.setView(TextInput);


        ThirdDialogConf.setNeutralButton("Close",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        String str = TextInput.getEditableText().toString();
                        Toast.makeText(context, "You wrote this in the dialog: " + str, Toast.LENGTH_LONG).show();
                    }
                });

        AlertDialog MyThirdDialog = ThirdDialogConf.create();
        MyThirdDialog.show();

    }
}
