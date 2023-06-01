package com.confidenceb.ordersafely;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DefaultSignUpPage extends AppCompatActivity {

    Button msignup, sSignup, cSignup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_default_sign_up_page);

        msignup = findViewById(R.id.merchant_signInbtn);
        sSignup = findViewById(R.id.serviceprovider_signupbtn);
        cSignup = findViewById(R.id.customer_signupbtn);

        msignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DefaultSignUpPage.this, MerchantSignUp.class);
                startActivity(intent);
            }
        });

        sSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DefaultSignUpPage.this, ServiceProviderSignUp.class);
                startActivity(intent);
            }
        });

        cSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DefaultSignUpPage.this, CustomerSignUp.class);
                startActivity(intent);
            }
        });
    }
}