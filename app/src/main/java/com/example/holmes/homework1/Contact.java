package com.example.holmes.homework1;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;

public class Contact implements Parcelable{

    private String firstName, lastName, company,
            phone, email, URL, address,
            birthday, nickname, facebook,
            twitter, skype, youtube;
    private Bitmap profilePicture;

    protected Contact(Parcel in){
        firstName = in.readString();
        lastName = in.readString();
        company = in.readString();
        phone = in.readString();
        email = in.readString();
        URL = in.readString();
        address = in.readString();
        birthday = in.readString();
        nickname = in.readString();
        facebook = in.readString();
        twitter = in.readString();
        skype = in.readString();
        youtube = in.readString();
        profilePicture = (Bitmap) in.readValue(Bitmap.class.getClassLoader());
    }

    public Contact(){

    }

    @Override
    public int describeContents(){
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(firstName);
        dest.writeString(lastName);
        dest.writeString(email);
        dest.writeString(company);
        dest.writeString(phone);
        dest.writeString(URL);
        dest.writeString(address);
        dest.writeString(birthday);
        dest.writeString(nickname);
        dest.writeString(facebook);
        dest.writeString(twitter);
        dest.writeString(skype);
        dest.writeString(youtube);
        dest.writeValue(profilePicture);
    }

    public static final Parcelable.Creator<Contact> CREATOR = new Parcelable.Creator<Contact>() {
        @Override
        public Contact createFromParcel(Parcel in) {
            return new Contact(in);
        }

        @Override
        public Contact[] newArray(int size) {
            return new Contact[size];
        }
    };

    public Bitmap getProfilePicture() { return profilePicture; }

    public void setProfilePicture(Bitmap profilePicture) { this.profilePicture = profilePicture; }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public String getYoutube() {
        return youtube;
    }

    public void setYoutube(String youtube) {
        this.youtube = youtube;
    }
}
