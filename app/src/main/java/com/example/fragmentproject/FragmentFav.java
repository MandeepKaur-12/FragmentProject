package com.example.fragmentproject;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentFav extends Fragment {

    View view;

    public FragmentFav() {
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        setHasOptionsMenu(true);

        view = inflater.inflate(R.layout.fav_fragment, container, false);

        return view;
    }

    //  Inflate
    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {

        inflater.inflate(R.menu.menu, menu);
        menu.findItem(R.id.action_more).setVisible(false);

        super.onCreateOptionsMenu(menu, inflater);
    }

    //  When menu items are clicked
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();

        if(id == R.id.action_setting){
            Toast.makeText(getContext(), "Settings Clicked", Toast.LENGTH_LONG).show();
        }
        if(id == R.id.action_add){
            Toast.makeText(getContext(), "Add Favorite", Toast.LENGTH_LONG).show();
        }
        if(id == R.id.action_search){
            Toast.makeText(getContext(), "Search Favorite", Toast.LENGTH_LONG).show();
        }


        return super.onOptionsItemSelected(item);
    }

}
