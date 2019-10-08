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

public class MosquesFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //inflater.inflate(R.layout.activity_mosques_fragment, container, false);
        View rootView = inflater.inflate(R.layout.activity_mosques_fragment, container, false);

        final ArrayList<Place> mosques = new ArrayList<Place>();
        mosques.add(new Place(R.drawable.azharmosque, "Al Azhar Mosque", "Fatemi Build Mosque", "Khan El Khalili Cairo"));
        mosques.add(new Place(R.drawable.amrmosque, "Amr Ibn El Aas Mosque", "First Mosque in Egypt", "old Egypt Cairo"));
        mosques.add(new Place(R.drawable.mohamedalimosque, "Mohammed Ali Mosque", "Citadel Mosque", "Citadel 3aesha area Cairo"));

        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Place}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), mosques);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called mosques_list_view, which is declared in the
        // mosques_list_view.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.mosques_list_view);

        // Make the {@link ListView} use the {@link PlaceAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Place} in the list.
        listView.setAdapter(adapter);

        return rootView;

    }


}
