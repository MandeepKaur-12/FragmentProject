package com.example.fragmentproject;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;
    ViewPageAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = (TabLayout)findViewById(R.id.tabLayout_id);
        viewPager = (ViewPager)findViewById(R.id.view_pager_id);
        adapter = new ViewPageAdapter(getSupportFragmentManager());

        //   Add tabs (fragments)
        adapter.addFragment(new FragmentCall(),"");
        adapter.addFragment(new FragmentContact(),"");
        adapter.addFragment(new FragmentFav(),"");

        //  Attach ViewPageAdapter to the ViewPager
        viewPager.setAdapter(adapter);

        //  Link the TabLayout to the ViewPager
        tabLayout.setupWithViewPager(viewPager);

        //  Set Icons
        tabLayout.getTabAt(0).setIcon(R.drawable.ic_call_white);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_group_black);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_star_black);

        // Remove shadow from action bar
        ActionBar actionBar = getSupportActionBar();
        actionBar.setElevation(0);


        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                onChangeTab(position);

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }


    private void onChangeTab(int position){                    //  Change tab icon colors

        if(position == 0){
            tabLayout.getTabAt(0).setIcon(R.drawable.ic_call_white);
            tabLayout.getTabAt(1).setIcon(R.drawable.ic_group_black);
            tabLayout.getTabAt(2).setIcon(R.drawable.ic_star_black);

        }
        if(position == 1){
            tabLayout.getTabAt(0).setIcon(R.drawable.ic_call_black);
            tabLayout.getTabAt(1).setIcon(R.drawable.ic_group_white);
            tabLayout.getTabAt(2).setIcon(R.drawable.ic_star_black);

        }
        if(position == 2){
            tabLayout.getTabAt(0).setIcon(R.drawable.ic_call_black);
            tabLayout.getTabAt(1).setIcon(R.drawable.ic_group_black);
            tabLayout.getTabAt(2).setIcon(R.drawable.ic_star_white);

        }


    }



}
