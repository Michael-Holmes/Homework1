package com.example.holmes.homework1;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class DisplayContact extends AppCompatActivity {
    Context context;
    TextView firstName, lastName, company, phone, email, url,
            address, birthday, nickname, facebook, twitter, skype, youtube;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_contact);
        setTitle("Contact Display");
        context = getApplicationContext();

        firstName = findViewById(R.id.tvFirstNameDisplay);
        lastName = findViewById(R.id.tvLastNameDisplay);
        company = findViewById(R.id.tvCompanyDisplay);
        phone = findViewById(R.id.tvPhoneDisplay);
        email = findViewById(R.id.tvEmailDisplay);
        url = findViewById(R.id.tvURLdisplay);
        address = findViewById(R.id.tvAddressDisplay);
        birthday = findViewById(R.id.tvBirthdayDisplay);
        nickname = findViewById(R.id.tvNicknameDisplay);
        facebook = findViewById(R.id.tvFacebookDisplay);
        twitter = findViewById(R.id.tvTwitterDisplay);
        skype = findViewById(R.id.tvSkypeDisplay);
        youtube = findViewById(R.id.tvYouTubeDisplay);

        Intent prevIntent = getIntent();
        Contact contact = prevIntent.getParcelableExtra("contact");

        if (!isEmpty(contact.getFirstName())) {
            firstName.setVisibility(View.VISIBLE);
            firstName.setText(contact.getFirstName());
        }
        if (!isEmpty(contact.getLastName())) {
            lastName.setVisibility(View.VISIBLE);
            lastName.setText(contact.getLastName());
        }
        if (!isEmpty(contact.getCompany())) {
            company.setVisibility(View.VISIBLE);
            company.setText(contact.getCompany());
        }
        if (!isEmpty(contact.getPhone())) {
            phone.setVisibility(View.VISIBLE);
            phone.setText(contact.getPhone());
        }
        if (!isEmpty(contact.getEmail())) {
            email.setVisibility(View.VISIBLE);
            email.setText(contact.getEmail());
        }
        if (!isEmpty(contact.getURL())) {
            url.setVisibility(View.VISIBLE);
            url.setText(contact.getURL());
            hyperlink(url, contact.getURL());
        }
        if (!isEmpty(contact.getAddress())) {
            address.setVisibility(View.VISIBLE);
            address.setText(contact.getAddress());
        }
        if (!isEmpty(contact.getBirthday())) {
            birthday.setVisibility(View.VISIBLE);
            birthday.setText(contact.getBirthday());
        }
        if (!isEmpty(contact.getNickname())) {
            nickname.setVisibility(View.VISIBLE);
            nickname.setText(contact.getNickname());
        }
        if (!isEmpty(contact.getFacebook())) {
            facebook.setVisibility(View.VISIBLE);
            facebook.setText(contact.getFacebook());
            hyperlink(facebook, contact.getFacebook());
        }
        if (!isEmpty(contact.getTwitter())) {
            twitter.setVisibility(View.VISIBLE);
            twitter.setText(contact.getTwitter());
            hyperlink(twitter, contact.getTwitter());
        }
        if (!isEmpty(contact.getSkype())) {
            skype.setVisibility(View.VISIBLE);
            skype.setText(contact.getSkype());
            hyperlink(skype, contact.getSkype());
        }
        if (!isEmpty(contact.getYoutube())) {
            youtube.setVisibility(View.VISIBLE);
            youtube.setText(contact.getYoutube());
            hyperlink(youtube, contact.getYoutube());
        }
    }

    private boolean isEmpty(String value) {
        return value == null || value.isEmpty();
    }

    private void hyperlink(TextView textView, String link) {
        final String url = link;
        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, url, Toast.LENGTH_SHORT).show();
            }
        };
        textView.setOnClickListener(onClickListener);

    }


}
