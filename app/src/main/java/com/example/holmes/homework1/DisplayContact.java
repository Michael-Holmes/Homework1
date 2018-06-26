package com.example.holmes.homework1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayContact extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_contact);
        setTitle("Contact Display");



        TextView tvFirstDisplay = findViewById(R.id.tvFirstNameDisplay);
        TextView tvLastDisplay = findViewById(R.id.tvLastNameDisplay);
        TextView tvCompany = findViewById(R.id.tvCompanyDisplay);
        TextView tvPhone = findViewById(R.id.tvPhoneDisplay);
        TextView tvEmail = findViewById(R.id.tvEmailDisplay);
        TextView tvURL = findViewById(R.id.tvURLdisplay);
        TextView tvAddress = findViewById(R.id.tvAddressDisplay);
        TextView tvBirthday = findViewById(R.id.tvBirthdayDisplay);
        TextView tvNickname = findViewById(R.id.tvNicknameDisplay);
        TextView tvFacebook = findViewById(R.id.tvFacebookDisplay);
        TextView tvTwitter = findViewById(R.id.tvTwitterDisplay);
        TextView tvSkype = findViewById(R.id.tvSkypeDisplay);
        TextView tvYouTube = findViewById(R.id.tvYouTubeDisplay);

    }
}
