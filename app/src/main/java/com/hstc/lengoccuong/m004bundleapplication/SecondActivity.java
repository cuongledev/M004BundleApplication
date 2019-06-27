package com.hstc.lengoccuong.m004bundleapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    EditText editShow;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_second);

        iniViews();

    }

    private void iniViews() {
        editShow = findViewById(R.id.edt_show_phone);
        Intent data = SecondActivity.this.getIntent();
        if(data==null) return;

        Bundle bundle = data.getBundleExtra(MainActivity.KEY_BUNDLE);

        editShow.setText(bundle.getString(MainActivity.KEY_PHONE));
    }
}
