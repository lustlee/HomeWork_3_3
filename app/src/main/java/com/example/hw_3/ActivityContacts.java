package com.example.hw_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toolbar;

public class ActivityContacts extends AppCompatActivity {

    Button btn_call;
    EditText editText;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);

        btn_call = findViewById(R.id.btn_call);
        editText = findViewById(R.id.et_contacts);
        toolbar= findViewById(R.id.toolbar_top);
        setActionBar(toolbar);

        btn_call.setOnClickListener(view -> {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            Uri uri = Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_URI, String.valueOf(editText.getText().toString()));
            intent.setDataAndType(uri, "vnd.android.cursor.dir/contact");
            startActivity(intent);
        });


    }
}