package com.example.holmes.homework1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CreateNewContact extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_new_contact);
        setTitle("Create New Contact");
        final EditText etFirst = findViewById(R.id.etFirst);
        final EditText etLastName = findViewById(R.id.etLast);
        final EditText etCompany = findViewById(R.id.etCompany);
        final EditText etPhone = findViewById(R.id.etPhone);
        final EditText etEmail = findViewById(R.id.etEmail);
        final EditText etURL = findViewById(R.id.etURL);
        final EditText etAddress = findViewById(R.id.etAddress);
        final EditText etBirthday = findViewById(R.id.etBirthday);
        final EditText etNickname = findViewById(R.id.etNickname);
        final EditText etFacebook = findViewById(R.id.etFacebook);
        final EditText etTwitter = findViewById(R.id.etTwitter);
        final EditText etSkype = findViewById(R.id.etSkype);
        final EditText etYoutube = findViewById(R.id.etYouTube);


        findViewById(R.id.btnSave).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pass = 0;
                Contact newContact = new Contact();
                newContact.setFirstName(etFirst.getText().toString());
                newContact.setLastName(etLastName.getText().toString());
                newContact.setCompany(etCompany.getText().toString());
                newContact.setPhone(etPhone.getText().toString());
                newContact.setEmail(etEmail.getText().toString());
                newContact.setURL(etURL.getText().toString());
                newContact.setAddress(etAddress.getText().toString());
                newContact.setBirthday(etBirthday.getText().toString());
                newContact.setNickname(etNickname.getText().toString());
                newContact.setFacebook(etFacebook.getText().toString());
                newContact.setTwitter(etTwitter.getText().toString());
                newContact.setSkype(etSkype.getText().toString());
                newContact.setYoutube(etYoutube.getText().toString());

                if(pass != 0){
                    //Pass the object
                    //Close the activity
                }else{
                    //Do not pass the object
                }
            }
        });

    }
}
