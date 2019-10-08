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

public class ResturantsFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //inflater.inflate(R.layout.activity_resturants_fragment, container, false);
        View rootView = inflater.inflate(R.layout.activity_resturants_fragment, container, false);

        // Create a list of Restaurants
        final ArrayList<Place> restuarants = new ArrayList<Place>();
        restuarants.add(new Place(R.drawable.aboushakra, "Abou Shakra", "Egyptian Food", "13 Down Town Cairo"));
        restuarants.add(new Place(R.drawable.faragrestaurant, "Khaled Abou Farag", "Meats Food", "20 Tahrir Square Cairo"));
        restuarants.add(new Place(R.drawable.greekclubrestaurant, "Greek Club", "Sea Food", "5 Ramsis Square Cairo"));
        restuarants.add(new Place(R.drawable.zoobarestaurant, "Zooba", "Pizza", "12 Abbasia Cairo"));

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called resturant_list_view, which is declared in the
        // resturant_list_view.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.resturant_list_view);

        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Place}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), restuarants);

        // Make the {@link ListView} use the {@link PlaceAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Place} in the list.
        listView.setAdapter(placeAdapter);

        return rootView;
    }
}

