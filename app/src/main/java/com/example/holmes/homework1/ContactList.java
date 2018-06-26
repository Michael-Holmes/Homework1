package com.example.holmes.homework1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class ContactList extends AppCompatActivity {

    ListView listView;

    //Example array
    String[] nameArray = {"Octopus","Pig","Sheep","Rabbit","Snake","Spider" };

    //Example array
    String[] infoArray = {
            "8 tentacled monster",
            "Delicious in rolls",
            "Great for jumpers",
            "Nice in a stew",
            "Great for shoes",
            "Scary."
    };

    //Example array
    Integer[] imageArray = {R.drawable.octopus,
            R.drawable.pig,
            R.drawable.sheep,
            R.drawable.rabbit,
            R.drawable.snake,
            R.drawable.spider};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_list);
        setTitle("Contact List");

        CustomListAdapter listAdapter = new CustomListAdapter(this, nameArray, infoArray, imageArray);
        listView = (ListView) findViewById(R.id.lvContactList);
        listView.setAdapter(listAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
    }
}
