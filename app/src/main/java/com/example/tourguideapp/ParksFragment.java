package com.example.tourguideapp;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ParksFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //inflater.inflate(R.layout.activity_parks_fragment, container, false);
        View rootView = inflater.inflate(R.layout.activity_parks_fragment, container, false);
        // Create a list of Parks.
        ArrayList<Place> parks = new ArrayList<Place>();
        parks.add(new Place(R.drawable.azharpark, "Azhar Park", "Biggest Park in Egypt", "Azhar Square Cairo"));
        parks.add(new Place(R.drawable.aquapark, "Aqua Park", "Biggest Aqua Park in Egypt", "10 Obour Cairo"));

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called parks_list_view, which is declared in the
        // parks_list_view.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.parks_list_view);

        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Place}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), parks);

        // Make the {@link ListView} use the {@link PlaceAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Place} in the list.
        listView.setAdapter(placeAdapter);

        return rootView;
    }
}
