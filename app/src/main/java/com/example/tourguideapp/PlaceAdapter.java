package com.example.tourguideapp;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link PlaceAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Place} objects.
 */
public class PlaceAdapter extends ArrayAdapter<Place> {

    /**
     * Create a new {@link PlaceAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param places  is the list of {@link Place}s to be displayed.
     */
    public PlaceAdapter(Context context, ArrayList<Place> places) {
        super(context, 0, places);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        // Check if an existing view is being reused, otherwise inflate the view
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.listitem, parent, false);
        }

        // Get the {@link Place} object located at this position in the list
        Place currentPlace = getItem(position);

        // Find the TextView in the listitem.xml layout with the ID list_item_name.
        TextView placeName = (TextView) listItemView.findViewById(R.id.list_item_name);
        // Get the Name of the Place from the currentPlace object and set this text on
        // the placeName TextView.
        placeName.setText(currentPlace.getPlaceName());

        // Find the TextView in the listitem.xml layout with the ID list_item_description.
        TextView placeDescription = (TextView) listItemView.findViewById(R.id.list_item_description);
        // Get the Description of the Place from the currentPlace object and set this text on
        // the placeDescription TextView.
        placeDescription.setText(currentPlace.getPlaceDescription());

        // Find the TextView in the listitem.xml layout with the ID list_item_address.
        TextView placeAddress = (TextView) listItemView.findViewById(R.id.list_item_address);
        // Get the Address of the Place from the currentPlace object and set this text on
        // the placeAddress TextView.
        placeAddress.setText(currentPlace.getPlaceAddress());

        // Find the ImageView in the listitem.xml layout with the ID list_item_image.
        ImageView placeImageView = (ImageView) listItemView.findViewById(R.id.list_item_image);
        // Get the Image Resource Id of the Place from the currentPlace object and set Resource Id on
        // the placeImageView ImageView.
        placeImageView.setImageResource(currentPlace.getPlaceImage());

        // Return the whole list item layout (containing 3 TextViews and 1 ImageView) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}