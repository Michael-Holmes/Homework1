package com.example.holmes.homework1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button createButton, displayButton, updateButton, deleteButton, finishButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Contacts");
        ArrayList<Contact> contactList = new ArrayList<Contact>();

        createButton = findViewById(R.id.btnNew);
        displayButton = findViewById(R.id.btnDisplay);
        updateButton = findViewById(R.id.btnEdit);
        deleteButton = findViewById(R.id.btnDelete);
        finishButton = findViewById(R.id.btnFinish);

        // Takes you to Create New Contact activity
        createButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CreateNewContact.class);
                startActivity(intent);
            }
        });

        // Enables you to display saved contacts goes to contacts list then contact detail view
        displayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        // Enables you to edit contacts via contact list
        updateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        //Enables you to delete contacts via contact list then displays alert dialog
        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        //quits app
        finishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveTaskToBack(true);
                finish();
            }
        });


    }
}
