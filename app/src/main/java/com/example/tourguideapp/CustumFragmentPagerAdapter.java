package com.example.tourguideapp;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CustumFragmentPagerAdapter extends FragmentPagerAdapter {


    // declaring Context .
    private Context mContext;

    /**
     * Declaring a constructor
     *
     * @param context current Context
     * @param fm      Fragment Manager
     */
    public CustumFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /*
    Swapping Between Fragments according to its position
     */
    @Override
    public Fragment getItem(int i) {
        if (i == 0) {
            return new ResturantsFragment();
        } else if (i == 1) {
            return new ParksFragment();
        } else if (i == 2) {
            return new MosquesFragment();
        } else
            return new MuseumsFragment();
    }

    // getting count of fragments
    @Override
    public int getCount() {
        return 4;
    }

    // setting out title of each fragment
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.resturantsFragmentName);
        } else if (position == 1) {
            return mContext.getString(R.string.ParksFragmentName);
        } else if (position == 2) {
            return mContext.getString(R.string.mosquesFragmentName);
        } else
            return mContext.getString(R.string.meseumsFragmentName);
    }
}
