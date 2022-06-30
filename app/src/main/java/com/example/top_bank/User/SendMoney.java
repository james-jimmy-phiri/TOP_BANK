package com.example.top_bank.User;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.top_bank.R;
import com.example.top_bank.TransactionConfirm;

public class SendMoney extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_money);

        final EditText inputMobile = findViewById(R.id.inputMobile);
        final EditText inputAmount = findViewById(R.id.editTextAmount);
        Button proceedButton = findViewById(R.id.proceedButton);

        proceedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(inputMobile.getText().toString().trim().isEmpty()){
                    Toast.makeText(SendMoney.this,"Enter Mobile Number or account",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(inputAmount.getText().toString().trim().isEmpty()){
                    Toast.makeText(SendMoney.this,"Enter Amount to be sent",Toast.LENGTH_SHORT).show();
                    return;
                }
                Intent intent = new Intent(getApplicationContext(), TransactionConfirm.class);
                intent.putExtra("mobile",inputMobile.getText().toString());
                intent.putExtra("amount",inputAmount.getText().toString());
                startActivity(intent);
            }
        });

    }
}