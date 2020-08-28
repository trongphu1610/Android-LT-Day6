package com.ddona.day6;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
        private Button btnOk;
        private EditText edtName;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        btnOk = findViewById(R.id.btn_ok);
        edtName = findViewById(R.id.edt_name);
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = edtName.getText().toString();
                Intent intent = new Intent();
                intent.putExtra("key_name", name);
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
}
