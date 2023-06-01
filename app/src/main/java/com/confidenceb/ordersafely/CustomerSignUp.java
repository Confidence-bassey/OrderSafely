package com.confidenceb.ordersafely;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CustomerSignUp extends AppCompatActivity {

    EditText fName, lName, email, pword;
    Button createAccBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_sign_up);

        fName = findViewById(R.id.CusfNname);
        lName = findViewById(R.id.CustlName);
        email = findViewById(R.id.cusEmail);
        pword = findViewById(R.id.cusPassword);
        createAccBtn = findViewById(R.id.CreateAccbtn);

        createAccBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CustomerSignUp.this, LoginPage.class);
                startActivity(intent);
            }
        });
    }
}