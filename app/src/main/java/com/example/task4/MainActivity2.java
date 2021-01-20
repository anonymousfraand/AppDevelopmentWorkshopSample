package com.example.task4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
SmsManager smsManager;
EditText editText;
String num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        smsManager = SmsManager.getDefault();

        editText= findViewById(R.id.editTextTextPersonName3);
        Intent obj = new Intent(MainActivity2.this,MainActivity.class);
        obj.putExtra("", num);
        startActivity(obj);
    }

    public void sen(View view) {
        num=editText.getText().toString();
    }
}