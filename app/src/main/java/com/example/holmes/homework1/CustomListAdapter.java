package com.example.holmes.homework1;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomListAdapter extends ArrayAdapter {


    /**
     * Example code can be found here: https://appsandbiscuits.com/listview-tutorial-android-12-ccef4ead27cc
    */
    private final Activity context;
    private final Integer[] imageIDarray;
    private final String[] nameArray;
    private final String[] phonearray;






    public CustomListAdapter(Activity context, String[] nameArrayParam, String[] infoArrayParam, Integer[] imageIDArrayParam){

        super(context,R.layout.listview_row , nameArrayParam);
        this.context=context;
        this.imageIDarray = imageIDArrayParam;
        this.nameArray = nameArrayParam;
        this.phonearray = infoArrayParam;

    }



    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.listview_row, null,true);

        //this code gets references to objects in the listview_row.xml file
        TextView nameTextField = (TextView) rowView.findViewById(R.id.tvListItemName);
        TextView infoTextField = (TextView) rowView.findViewById(R.id.tvListItemPhone);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.ivListItem);

        //this code sets the values of the objects to values from the arrays
        nameTextField.setText(nameArray[position]);
        infoTextField.setText(phonearray[position]);
        imageView.setImageResource(imageIDarray[position]);

        return rowView;

    };
}
