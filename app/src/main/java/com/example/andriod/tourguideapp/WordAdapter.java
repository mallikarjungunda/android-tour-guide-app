package com.example.andriod.tourguideapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by admin on 24-06-2016.
 */
public class WordAdapter extends ArrayAdapter<Word> {

    //Resource id for background color of list
    private int mColorResourceId;

    public WordAdapter(Activity context, ArrayList<Word> words, int colorResourceId) {
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final ViewHolder viewHolder ;
        if(null == convertView){
            convertView= LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        //get the object located at position
        Word word_item = getItem(position);
        viewHolder = new ViewHolder();
        //find the textview in list_item with id default_text_view
        viewHolder.objectName = (TextView) convertView.findViewById(R.id.object_name);
        //gets the default Translation and set it to the text of this textView
        viewHolder.objectName.setText(word_item.getmImageName());

        viewHolder.objectDescription = (TextView) convertView.findViewById(R.id.object_description);
        //gets the default Translation and set it to the text of this textView
        viewHolder.objectDescription.setText(word_item.getStrImageAddress());

        //find the image view with id image
        viewHolder.objectImage = (ImageView) convertView.findViewById(R.id.object_image);
        if(word_item.hasImage()) {

            //get the imageResource get and set it as source of the image view
            viewHolder.objectImage.setImageResource(word_item.getImageResourceId());

            //make the image view visible
            viewHolder.objectImage.setVisibility(View.VISIBLE);
        }
        else {
            viewHolder.objectImage.setVisibility(View.GONE);
        }

        //seach for the view with the give id
        viewHolder.textContainer = convertView.findViewById(R.id.text_container);

        // set its backgroung resource to the mColorResourceId
        viewHolder.textContainer.setBackgroundResource(mColorResourceId);

        return convertView;
    }

    // ViewHolder caches views
    static class ViewHolder {
        TextView objectName;
        TextView objectDescription;
        ImageView objectImage;
        View textContainer;
    }
}