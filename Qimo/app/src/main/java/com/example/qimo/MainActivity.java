package com.example.qimo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.qimo.activity.BaseActivity;
import com.example.qimo.activity.LoginActivity;
import com.example.qimo.activity.RegisterActivity;

public class MainActivity extends BaseActivity {

    private Button btn_login;
    private Button btn_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_login = findViewById(R.id.btn_login);

        /**
         * 登录页面跳转
         */
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
//                startActivity(intent);
                navigateTo(LoginActivity.class);
            }
        });
        btn_register = findViewById(R.id.btn_register);

        /**
         * 注册页面跳转
         */
        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
//                startActivity(intent);
                navigateTo(RegisterActivity.class);
            }
        });
    }

}