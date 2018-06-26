package com.example.holmes.homework1;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class CreateNewContact extends AppCompatActivity {
    Button saveButton;
    ImageButton profilePicture;
    static final int REQUEST_IMAGE_CAPTURE = 1;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_new_contact);
        setTitle("Create New Contact");
        context = getApplicationContext();

        saveButton = findViewById(R.id.btnSave);
        profilePicture = findViewById(R.id.ibProfilePicture);
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


        final Contact newContact = new Contact();

        profilePicture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getPhoto();
            }
        });


        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(profilePicture.getDrawable() != null) {
                    BitmapDrawable draw = (BitmapDrawable) profilePicture.getDrawable();
                    Bitmap imgBitmap = draw.getBitmap();
                    newContact.setProfilePicture(imgBitmap);
                }


                newContact.setFirstName(etFirst.getText().toString());
                newContact.setLastName(etLastName.getText().toString());
                newContact.setPhone(etPhone.getText().toString());
                newContact.setCompany(etCompany.getText().toString());
                newContact.setEmail(etEmail.getText().toString());
                newContact.setURL(etURL.getText().toString());
                newContact.setAddress(etAddress.getText().toString());
                newContact.setBirthday(etBirthday.getText().toString());
                newContact.setNickname(etNickname.getText().toString());
                newContact.setFacebook(etFacebook.getText().toString());
                newContact.setTwitter(etTwitter.getText().toString());
                newContact.setSkype(etSkype.getText().toString());
                newContact.setYoutube(etYoutube.getText().toString());
                if (isValid(newContact)) {
                    Intent intent = new Intent(CreateNewContact.this, ContactList.class);
                    intent.putExtra("contact", newContact);
                    startActivity(intent);
                }

            }
        });

    }

    private void getPhoto() {

        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
            Bundle extras = data.getExtras();
            Bitmap imageBitmap = (Bitmap) extras.get("data");
            profilePicture.setImageBitmap(imageBitmap);
        }
    }

    private boolean isValid(Contact contact) {
        if (contact.getFirstName() == null || contact.getFirstName().isEmpty()) {
            Toast.makeText(context, "Please enter in first name", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (contact.getLastName() == null || contact.getLastName().isEmpty()) {
            Toast.makeText(context, "Please enter in last name", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (contact.getPhone() == null || contact.getPhone().isEmpty()) {
            Toast.makeText(context, "Please enter in a phone number", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (!contact.getPhone().matches("^\\s*(?:\\+?(\\d{1,3}))?[-. (]*(\\d{3})[-. )]*(\\d{3})[-. ]*(\\d{4})(?: *x(\\d+))?\\s*$")) {
            Toast.makeText(context, "Please enter in a valid phone number", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }
}
