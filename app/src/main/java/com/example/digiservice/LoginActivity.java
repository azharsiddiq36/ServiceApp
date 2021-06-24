package com.example.digiservice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.digiservice.databinding.ActivityLoginBinding;
import com.google.android.material.snackbar.Snackbar;

public class LoginActivity extends AppCompatActivity {
    public static final int DIALOG_QUEST_CODE = 300;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityLoginBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_login);
//        setContentView(R.layout.activity_login);
//        parent_view = findViewById(android.R.id.content);


        binding.signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotomainactivity = new Intent(LoginActivity.this,MainActivity.class);
                startActivity(gotomainactivity);
            }
        });
        binding.tvSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               showDialogFullscreen();
            }
        });
    }
    private void showDialogFullscreen() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        DialogPaymentFragment newFragment = new DialogPaymentFragment();
        newFragment.setRequestCode(DIALOG_QUEST_CODE);
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        transaction.add(android.R.id.content, newFragment).addToBackStack(null).commit();
        newFragment.setOnCallbackResult(new DialogPaymentFragment.CallbackResult() {
            @Override
            public void sendResult(int requestCode) {
                Toast.makeText(getApplicationContext(), "Menu clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}