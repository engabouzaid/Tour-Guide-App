package com.example.tourguideapp;

/**
 * {@link Place} represents a Place we will show to the user.
 * It contains a image and description about this place and its address.
 */
public class Place {

    /**
     * Image of the place
     */
    private int placeImage;
    /**
     * Name the place
     */
    private String placeName;
    /**
     * Description of the place
     */
    private String placeDescription;
    /**
     * Address of the place
     */
    private String placeAddress;

    /**
     * Create a new Place object.
     *
     * @param placeImage       Image of the place
     * @param placeName        Name the place
     * @param placeDescription Description of the place
     * @param placeAddress     is the Address of the place
     */
    public Place(int placeImage, String placeName, String placeDescription, String placeAddress) {
        this.placeImage = placeImage;
        this.placeName = placeName;
        this.placeDescription = placeDescription;
        this.placeAddress = placeAddress;


    }

    /**
     * Get the Image of the place.
     */
    public int getPlaceImage() {
        return placeImage;
    }

    /**
     * Get the Name of the place.
     */
    public String getPlaceName() {
        return placeName;
    }

    /**
     * Get the Description of the place.
     */
    public String getPlaceDescription() {
        return placeDescription;
    }

    /**
     * Get the Address of the place.
     */
    public String getPlaceAddress() {
        return placeAddress;
    }


}
