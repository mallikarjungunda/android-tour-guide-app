package com.example.andriod.tourguideapp;

import android.content.Intent;
import android.util.Log;

public class DisplayMoreDetailsUtil {

    public static void handleOnClick(Intent moreDetailsIntent, WordAdapter itemsAdapter, int position){
        Word word = (Word)itemsAdapter.getItem(position);
        Log.i("Word ------------> : ", word.toString());
        int imageName;
        int image;
        int imageDescription;
        int address;

        imageName = word.getmImageName();
        image = word.getImageResourceId();
        imageDescription = word.getStrImageDescription();
        address=word.getStrImageAddress();

        moreDetailsIntent.putExtra(TourGuideConstants.IMAGE_NAME, imageName);
        moreDetailsIntent.putExtra(TourGuideConstants.IMAGE, image);
        moreDetailsIntent.putExtra(TourGuideConstants.IMAGE_DESC, imageDescription);
        moreDetailsIntent.putExtra(TourGuideConstants.IMAGE_ADDRESS, address);

    }
}
