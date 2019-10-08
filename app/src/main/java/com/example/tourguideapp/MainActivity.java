package com.example.tourguideapp;

import android.content.Context;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Define and set the ViewPager .
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        // Define object from CustumFragmentAdapter.
        CustumFragmentPagerAdapter custumFragmentPagerAdapter = new CustumFragmentPagerAdapter(this, getSupportFragmentManager());

        // Set the ViewPager Adapter to our (custumFragmentPagerAdapter).
        viewPager.setAdapter(custumFragmentPagerAdapter);

        // Define and set the TabLayout .
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);

        // Set the TabLayout ViewPager to our (viewPager).
        tabLayout.setupWithViewPager(viewPager);
    }

}
