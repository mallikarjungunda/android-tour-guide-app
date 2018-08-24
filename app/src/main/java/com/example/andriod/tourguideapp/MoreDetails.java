package com.example.andriod.tourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class MoreDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_more_details);

        Intent intent = getIntent();
        int imageName = intent.getIntExtra(TourGuideConstants.IMAGE_NAME, 0);
        int image = intent.getIntExtra(TourGuideConstants.IMAGE,0);
        int imageDescription = intent.getIntExtra(TourGuideConstants.IMAGE_DESC,0);
        int address = intent.getIntExtra(TourGuideConstants.IMAGE_ADDRESS,0);

        //find the image view with id image
        ImageView mImageView = (ImageView) findViewById(R.id.detail_image_view);
        mImageView.setImageResource(image);

        //find the textview in list_item with id default_text_view
        TextView objectName = (TextView) findViewById(R.id.detail_object_name);
        //gets the default Translation and set it to the text of this textView
        objectName.setText(imageName);

        //find the textview in list_item with id default_text_view
        TextView addressView = (TextView) findViewById(R.id.address_text);
        //gets the default Translation and set it to the text of this textView
        addressView.setText(address);

        //find the textview in list_item with id default_text_view
        TextView imageDescriptionView = (TextView) findViewById(R.id.detail_long_desc);
        //gets the default Translation and set it to the text of this textView
        imageDescriptionView.setText(imageDescription);
    }
}
