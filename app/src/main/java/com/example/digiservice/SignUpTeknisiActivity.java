package com.example.digiservice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.digiservice.databinding.ActivitySignUpTeknisiBindingImpl;
import com.example.digiservice.model.ResponseModel;

import java.util.ArrayList;


public class SignUpTeknisiActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivitySignUpTeknisiBindingImpl binding = DataBindingUtil.setContentView(this, R.layout.activity_sign_up_teknisi);
        ServiceInterface serviceInterface = CombineApi.getApiService();
        initComponent(binding);
    }

    private void initComponent(ActivitySignUpTeknisiBindingImpl binding) {
        binding.btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SignUpTeknisiActivity.this, "Percobaan binding", Toast.LENGTH_SHORT).show();
                ArrayList<ResponseModel> response = new EndPointApi().inserTechnician();
            }
        });
    }
}