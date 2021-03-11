package com.example.hw_3;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageButton btn_city, btn_camera, btn_contacts, btn_settings;
    Button btn_toast;

    String st;

    TextView tv_b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_city = findViewById(R.id.btn_city);
        btn_camera = findViewById(R.id.btn_camera);
        btn_contacts = findViewById(R.id.btn_contacts);
        btn_settings = findViewById(R.id.btn_settings);
        btn_toast = findViewById(R.id.btn_toast);
        tv_b = findViewById(R.id.tv_bishkek);



        btn_toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(MainActivity.this, "Тоаст =)", Toast.LENGTH_LONG);
                toast.show();

            }
        });


        btn_camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Activity_camera.class);
                startActivity(intent);
            }
        });


        btn_contacts.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, ActivityContacts.class);
            startActivity(intent);
        });

        btn_settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ActivitySettings.class);
                startActivity(intent);
            }
        });
        btn_city.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainActivity.this, ActivityCity.class);
                startActivityForResult(intent2, 202);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 202 && resultCode == RESULT_OK && data != null) {
            st = data.getStringExtra("1");
            tv_b.setText(st);
        }
    }
}