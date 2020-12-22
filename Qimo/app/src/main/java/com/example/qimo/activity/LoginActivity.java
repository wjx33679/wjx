package com.example.qimo.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.qimo.MainActivity;
import com.example.qimo.R;
import com.example.qimo.util.AppConfig;
import com.example.qimo.util.StringUtils;

import org.json.JSONObject;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class LoginActivity extends BaseActivity {

    private EditText et_Account;
    private EditText et_Pwd;
    private Button btn_Login;
    private ImageButton Login_QQ;
    private ImageButton Login_Wecaht;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        et_Account = findViewById(R.id.ed_account);
        et_Pwd = findViewById(R.id.et_pwd);
        btn_Login = findViewById(R.id.btn_login);
        Login_QQ = findViewById(R.id.login_qq);
        Login_Wecaht = findViewById(R.id.login_wechat);

        /**
         * QQ登录页面跳转
         */
        Login_QQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigateTo(QQ_Login_Activity.class);
            }
        });

        /**
         * 微信登录页面跳转
         */
        Login_Wecaht.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigateTo(Wechat_Login_Activity.class);
            }
        });

        btn_Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String account = et_Account.getText().toString().trim();
                String pwd = et_Pwd.getText().toString().trim();
                login(account, pwd);
            }

            private void login(String account, String pwd) {
                if (StringUtils.isEmpty(account)) {
//                    Toast.makeText(LoginActivity.this, "请输入账号", Toast.LENGTH_SHORT).show();
                    showToast("请输入账号");
                    return;
                }
                if (StringUtils.isEmpty(pwd)) {
//                    Toast.makeText(LoginActivity.this, "请输入密码", Toast.LENGTH_SHORT).show();
                    showToast("请输入密码");
                    return;
                }
//                /**
//                 * 创建okhttpclient
//                 */
//                OkHttpClient client =new OkHttpClient.Builder().build();
//                Map m = new HashMap();
//                m.put("mobile", account);
//                m.put("password", pwd);
//                JSONObject jsonObject = new JSONObject(m);
//                String jsonStr = jsonObject.toString();
//                RequestBody requestBodyJson = RequestBody.create(MediaType.parse("application/json;charset=utf-8"), jsonStr);
//
//                /**
//                 * 创建Rquest
//                 */
//                Request request = new Request.Builder().
//                        url(AppConfig.BASE_URl + "/app/login")
//                        .addHeader("contentType", "application/json;charset=UTF-8")
//                        .post(requestBodyJson)
//                        .build();
//
//                 //创建call回调对象
//                final Call call = client.newCall(request);
//                //发起请求
//                call.enqueue(new Callback() {
//                    @Override
//                    public void onFailure(Call call, IOException e) {
//                        Log.e("onFailure", e.getMessage());
//                    }
//
//                    @Override
//                    public void onResponse(Call call, Response response) throws IOException {
//                        String result = response.body().string();
//                        runOnUiThread(new Runnable() {
//                            @Override
//                            public void run() {
//                                showToast(result);
//                            }
//                        });
//
//                    }
//                });

            }
        });


    }
}