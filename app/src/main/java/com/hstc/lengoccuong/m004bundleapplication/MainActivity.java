package com.hstc.lengoccuong.m004bundleapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public static final String KEY_PHONE = "KEY_PHONE";
    public static final String KEY_BUNDLE = "KEY_BUNDLE";
    EditText edtPhone;
    Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        edtPhone = findViewById(R.id.edt_phone);
        btnSend = findViewById(R.id.btn_send);
        btnSend.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_send:

                sendData();

                break;
            default:
                break;
        }
    }

    private void sendData() {

        Intent intent = new Intent(MainActivity.this,SecondActivity.class);


        Bundle bundle = new Bundle();
        bundle.putString(KEY_PHONE,edtPhone.getText().toString());
        intent.putExtra(KEY_BUNDLE,bundle);

        //intent.putExtra(KEY_PHONE,edtPhone.getText().toString());

        startActivity(intent);
    }
}
