package com.example.andriod.tourguideapp;

/**
 * Created by admin on 24-06-2016.
 */
public class Word {

    //Default Translation for the words
    private int  mImageName;


    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    private int strImageDescription;
    private int strImageAddress;

    // constructor for the new word object
    public Word(int imageName, int imageDescription, int imageAddress, int ImageResourceId){
        mImageName = imageName;
        mImageResourceId= ImageResourceId;
        strImageDescription = imageDescription;
        strImageAddress = imageAddress;
    }

    //get the imageName
    public int getmImageName(){
        return mImageName;
    }


    //get the image resource Id
    public int getImageResourceId() {
        return mImageResourceId;
    }

    // check whether image resource id is provided or not
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public int getStrImageDescription(){return strImageDescription;}

    public int getStrImageAddress(){return strImageAddress;}
}
