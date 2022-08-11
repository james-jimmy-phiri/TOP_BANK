package com.example.top_bank;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class TransactionDone extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction_done);

        TextView textmobile = findViewById(R.id.TDNumber);
        textmobile.setText(String.format(getIntent().getStringExtra("mobile1")));

    }
}