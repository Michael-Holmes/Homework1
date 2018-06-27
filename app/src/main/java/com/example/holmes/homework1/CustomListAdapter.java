package com.example.holmes.homework1;

import android.app.Activity;
import android.content.Context;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomListAdapter extends ArrayAdapter<Contact> {
    Context context;

    public CustomListAdapter(Activity context, int resource, ArrayList<Contact> contacts){
        super(context, resource, contacts);
        this.context = context;
    }


    @Override
    public View getView(int position, View view, ViewGroup parent) {
        Contact contact = getItem(position);
        ViewHolder viewHolder;

        if(view == null){
            view = LayoutInflater.from(context).inflate(R.layout.listview_row, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.name = view.findViewById(R.id.tvListItemName);
            viewHolder.phone = view.findViewById(R.id.tvListItemPhone);
            viewHolder.imageView = view.findViewById(R.id.ivListItem);
            view.setTag(viewHolder);
        } else{
            viewHolder = (ViewHolder) view.getTag();
        }

        viewHolder.name.setText(contact.getFirstName() + " " + contact.getLastName());
        viewHolder.phone.setText(contact.getPhone());
        if(contact.getProfilePicture() != null) {
            viewHolder.imageView.setImageBitmap(contact.getProfilePicture());
        } else {
            viewHolder.imageView.setImageResource(R.drawable.ic_launcher_background);
        }
        return view;

    };


    private static class ViewHolder{
        ImageView imageView;
        TextView name;
        TextView phone;
    }
}
