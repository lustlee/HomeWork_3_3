package com.example.hw_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivityCity extends AppCompatActivity {

    Button btn_save;
    EditText et_city;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city);
        btn_save = findViewById(R.id.btn_save);
        et_city = findViewById(R.id.et_city);

        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = getIntent();
                intent.putExtra("1",et_city.getText().toString());
                setResult(RESULT_OK,intent);
                finish();
            }
        });

    }
}