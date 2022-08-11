package com.example.top_bank.User;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.top_bank.Database.UserHelperClass;
import com.example.top_bank.R;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class RegisterActivity extends AppCompatActivity {
    private EditText fname1, lname1, email1, phone1, account1, pin1,pin2;
    TextInputLayout firstname11,lastname11,email11,phoneNumber11,accountNumber11,pin11;
    String firstname,lastname,email,phoneNo,account,pin,confirmPin;
    TextInputLayout phoneNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        firstname11 = findViewById(R.id.textInputfirstName);
        lastname11 = findViewById(R.id.textInputlastName);
        email11 = findViewById(R.id.textInputEmail);
        phoneNumber11= findViewById(R.id.phonenumber);
        accountNumber11 = findViewById(R.id.textInputAccount);
        pin11 = findViewById(R.id.textInputPassword);



        fname1 = findViewById(R.id.editfirstName);
        lname1 = findViewById(R.id.editlastName);
        email1= findViewById(R.id.editTextEmail);
        phone1= findViewById(R.id.editTextMobile);
        account1 = findViewById(R.id.editAccount);
        pin1 = findViewById(R.id.editTextPassword);
        pin2 = findViewById(R.id.editTextPassword2);





    }




    public void onLoginClick(View view){


        startActivity(new Intent(this,LoginActivity.class));
        overridePendingTransition(R.anim.slide_in_left,android.R.anim.slide_out_right);

    }
    public void registerButton(View view){

        firstname = fname1.getText().toString().trim();
        lastname = lname1.getText().toString().trim();
        email = email1.getText().toString().trim();
        phoneNo  = phone1.getText().toString().trim();
        account  = account1.getText().toString().trim();
        pin = pin1.getText().toString().trim();
        confirmPin = pin2.getText().toString().trim();
        String checkDigits = "[0-9]+";
        String checkEmail = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

        // the firstname
        if(firstname.isEmpty()){
            firstname11.setError("Enter Firstname,Field Cannot be Empty");
            firstname11.requestFocus();
            return;
        }
        // the Lastname
        if(lastname.isEmpty()){
            lastname11.setError("Enter Lastname, Field Cannot be Empty");
            lastname11.requestFocus();
            return;
        }
        // the Email
        if(email.isEmpty()){
            email11.setError("Enter Field Cannot be Empty");
            return;
        }
        if(!email.matches(checkEmail)){
            email11.setError("Invalid Email");
            email11.requestFocus();
            return;
        }
        //phonenumber
        if(phoneNo.isEmpty()){
            phoneNumber11.setError("Phone number is required");
            phoneNumber11.requestFocus();
            return;
        }
        if(!phoneNo.matches(checkDigits)){
            phoneNumber11.setError("Phone number must have digits only");
            phoneNumber11.requestFocus();
            return;
        }
        if(phoneNo.length()!= 9){
            phoneNumber11.setError("Phone Number must have 9 digits ");
            phoneNumber11.requestFocus();
            return;
        }

        // the account
        if(account.isEmpty()){
            accountNumber11.setError("Enter PIN,Field Cannot be Empty");
            return;
        }
        if(account.length()!= 10){
            accountNumber11.setError("Account must have 10 digits");
            accountNumber11.requestFocus();
            return;
        }

        // the pin
        if(pin.isEmpty()){
            pin11.setError("Enter PIN,Field Cannot be Empty");
            return;
        }
        if(confirmPin.length()!= 6){
            pin11.setError("Pin must have 6 digits");
            pin11.requestFocus();
            return;
        }
        if(!pin.matches(confirmPin)){
            pin11.setError("PIN does not Match");
            pin11.requestFocus();
            return;
        }





        storeNewUserData();
        startActivity(new Intent(this,UserDashboard.class));
        overridePendingTransition(R.anim.slide_in_left,android.R.anim.slide_out_right);


    }


    private void storeNewUserData() {

        FirebaseDatabase rootNode = FirebaseDatabase.getInstance();
        DatabaseReference reference = rootNode.getReference("User");

        UserHelperClass addNewUser = new UserHelperClass(firstname,lastname,email,phoneNo,account,pin);

        reference.child(phoneNo).setValue(addNewUser);

        startActivity(new Intent(this,LoginActivity.class));
        overridePendingTransition(R.anim.slide_in_left,android.R.anim.slide_out_right);



    }





}