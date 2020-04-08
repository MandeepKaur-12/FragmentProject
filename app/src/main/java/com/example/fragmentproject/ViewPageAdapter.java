package com.example.fragmentproject;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPageAdapter extends FragmentPagerAdapter {              // When requested, this adapter returns a Fragment

    private final List<Fragment> fragmentList = new ArrayList<>();
    private final List<String>  listTitle = new ArrayList<>();

    public ViewPageAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        //   Return the Fragment associated with a specified position
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {

        //  Return the number of views available
        return listTitle.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        //  Obtain a title string to describe the specified page
        return listTitle.get(position);
    }


    public void addFragment(Fragment fragment, String title){
        fragmentList.add(fragment);
        listTitle.add(title);
    }

}
