package com.example.holmes.homework1;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ContactList extends AppCompatActivity {

    ListView listView;
    static ArrayList<Contact> contacts = new ArrayList<Contact>();
    Context context;
    Contact contact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_list);
        setTitle("Contact List");
        context = getApplicationContext();
        Intent prevIntent = getIntent();

        if(prevIntent.hasExtra("contact")){
            contact = prevIntent.getParcelableExtra("contact");
            contacts.add(contact);
            Toast.makeText(context, "added contact " + contacts.get(0).getLastName(), Toast.LENGTH_SHORT).show();
        }

        CustomListAdapter listAdapter = new CustomListAdapter(this, R.layout.listview_row, contacts);
        listView = findViewById(R.id.lvContactList);
        listView.setAdapter(listAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(context, contacts.get(position).getBirthday(), Toast.LENGTH_SHORT).show();
                /*Intent intent = new Intent(ContactList.this, Contact.class);
                Contact contact = contacts.get(position);
                intent.putExtra("animal", message);
                startActivity(intent);*/
            }
        });


    }
}
