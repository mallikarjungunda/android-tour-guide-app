package com.example.andriod.tourguideapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

/**
 * A simple {@link Fragment} subclass.
 */
public class AttractionsFragment extends Fragment {

    public AttractionsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        Log.i("Attractons ->", DataRepository.getAttractionsRepository().toString());

        // setting up the array adapter
        final WordAdapter itemsAdapter= new WordAdapter(getActivity(), DataRepository.getAttractionsRepository(), R.color.category_colors);

        // finding the listView and setting the adapter to it
        final ListView listView = (ListView)rootView.findViewById(R.id.word_list);
        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent moreDetailsIntent = new Intent(getContext(), MoreDetails.class);

                DisplayMoreDetailsUtil.handleOnClick(moreDetailsIntent, itemsAdapter, position);
                startActivity(moreDetailsIntent);
            }
        });
        return rootView;
    }
}
