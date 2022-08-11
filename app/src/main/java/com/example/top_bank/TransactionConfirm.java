package com.example.top_bank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.top_bank.User.SendMoney;

public class TransactionConfirm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction_confirm);

        TextView textmobile = findViewById(R.id.recipientNumber);
        textmobile.setText(String.format(getIntent().getStringExtra("mobile")));

        TextView textAmount = findViewById(R.id.amountSent);
        textAmount.setText(String.format(getIntent().getStringExtra("amount")));
        Button confirmButton = findViewById(R.id.confirm_button);

        confirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), PinVerify.class);
                intent.putExtra("mobile1",textmobile.getText().toString());
                startActivity(intent);
            }
        });


    }

    public void onCancelButton(View View){
        startActivity(new Intent(this, SendMoney.class));
        overridePendingTransition(R.anim.slide_in_right,R.anim.stay);

    }
}