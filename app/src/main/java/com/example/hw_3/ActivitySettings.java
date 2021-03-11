package com.example.hw_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toolbar;

public class ActivitySettings extends AppCompatActivity {


    Button btn_settings;
    EditText et_call;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        toolbar = findViewById(R.id.toolbar_top);
        setActionBar(toolbar);
        et_call=findViewById(R.id.et_city);
        btn_settings = findViewById(R.id.btn_serch);
        btn_settings.setOnClickListener(view -> {
            String url = "http://google.com/"+ et_call.getText().toString();
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });


    }
}