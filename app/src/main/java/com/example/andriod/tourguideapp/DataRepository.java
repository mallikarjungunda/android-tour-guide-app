package com.example.andriod.tourguideapp;

import java.util.ArrayList;

public class DataRepository {

    public static ArrayList<Word> getAttractionsRepository(){

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.attraction_1,R.string.wtc_desc, R.string.wtc_addr,  R.drawable.wtc_newyork));  // resource id is of integer type
        words.add(new Word(R.string.attraction_2, R.string.brooklyn_bridge_desc,R.string.brooklyn_bridge_addr,  R.drawable.brooklyn_bridge));
        words.add(new Word(R.string.attraction_3, R.string.liberty_statue_desc, R.string.liberty_statue_addr , R.drawable.liberty_statue));
        words.add(new Word(R.string.attraction_4, R.string.charging_bull_desc, R.string.charging_bull_addr, R.drawable.charging_bull_statue));

        return words;
    }

    public static ArrayList<Word> getMonumentsRepository(){
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.monument_1, R.string.fort_stanwix_desc, R.string.fort_stanwix_addr, R.drawable.fort_stanwix_national_monument));
        words.add(new Word(R.string.monument_2, R.string.african_national_monument_desc, R.string.african_monument_addr, R.drawable.african_national_monument));
        words.add(new Word(R.string.monument_3, R.string.castle_clinton_desc, R.string.castle_clinton_addr, R.drawable.castle_clinton_national_monument));
        words.add(new Word(R.string.monument_4, R.string.stonewall_national_monument_desc, R.string.stonewall_addr, R.drawable.stonewall_national_monument));

        return words;
    }

    public static ArrayList<Word> getNationalParksRepository(){
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.park_1, R.string.battery_park_desc, R.string.battery_park_addr, R.drawable.battery_park));
        words.add(new Word(R.string.park_2, R.string.central_park_desc, R.string.central_park_addr, R.drawable.central_park));
        words.add(new Word(R.string.park_3, R.string.high_line_park_desc, R.string.high_line_park_addr, R.drawable.high_line_park));
        words.add(new Word(R.string.park_4, R.string.washington_square_park_desc, R.string.washington_square_park_addr, R.drawable.washington_square_park));

        return words;
    }

    public static ArrayList<Word> getRestaurantsRepository(){
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.restaurant_1, R.string.charging_bull_desc, R.string.catch_addr, R.drawable.catch_nyc_res));
        words.add(new Word(R.string.restaurant_2, R.string.nur_desc, R.string.nur_addr, R.drawable.nur_res));
        words.add(new Word(R.string.restaurant_3, R.string.del_posto_desc, R.string.del_posto_addr, R.drawable.del_posto_res));
        words.add(new Word(R.string.restaurant_4, R.string.blue_hill_desc, R.string.blue_hill_addr, R.drawable.blue_hill_res));

        return words;
    }
}
