package com.ddona.day6;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final int REQUEST_NAME = 1;
    private Button btnOk, btnSayHi;
    private TextView tvName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("doanpt", "onCreate");
        btnOk = findViewById(R.id.button);
        btnSayHi = findViewById(R.id.button2);
        tvName = findViewById(R.id.textView);
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });

        btnSayHi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivityForResult(intent, REQUEST_NAME);
            }
        });
        btnSayHi.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Toast.makeText(MainActivity.this, "On long click", Toast.LENGTH_LONG).show();
                return true;
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == REQUEST_NAME) {
            if(resultCode == RESULT_OK) {
                String name = data.getStringExtra("key_name");
                tvName.setText("Hello:" + name + " Dep troai!");
            }
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("doanpt", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("doanpt", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("doanpt", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("doanpt", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("doanpt", "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("doanpt", "onRestart");
    }
}
