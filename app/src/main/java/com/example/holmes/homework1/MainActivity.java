package com.example.holmes.homework1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button createButton, displayButton, updateButton, deleteButton, finishButton;
    public static final int CREATE = 0;
    public static final int DISPLAY = 1;
    public static final int EDIT = 2;
    public static final int DELETE = 3;
    public static final String CONTACT = "contact";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Contacts");


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
                Intent intent = new Intent(MainActivity.this,ContactList.class);
                intent.putExtra("BUTTON_PRESS", DISPLAY);
                startActivity(intent);
            }
        });

        // Enables you to edit contacts via contact list
        updateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ContactList.class);
                intent.putExtra("BUTTON_PRESS", EDIT);
                startActivity(intent);
            }
        });

        //Enables you to delete contacts via contact list then displays alert dialog
        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ContactList.class);
                intent.putExtra("BUTTON_PRESS", DELETE);
                startActivity(intent);
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
