package com.example.fragmentproject;
//  Required empty constructor (so that the fragment can be instantiated)
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


public class FragmentCall extends Fragment {

    View view;


    public FragmentCall() {
        //  Required empty constructor (so that the fragment can be instantiated)
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

       //  Inflate the layout of the fragment
        view = inflater.inflate(R.layout.call_fragment, container, false);
        return view;
    }


    //  Initial creation of a fragment
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setHasOptionsMenu(true);                        //  Options menu in the fragment
        super.onCreate(savedInstanceState);
    }


    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {

        inflater.inflate(R.menu.menu, menu);                   //  Inflate the menu
        menu.findItem(R.id.action_add).setVisible(false);      // Hide the Add item in menu

        super.onCreateOptionsMenu(menu, inflater);
    }


    //  Event handling when menu items are clicked
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();

        if(id == R.id.action_setting){
            Toast.makeText(getContext(), "Settings Clicked", Toast.LENGTH_LONG).show();
        }
        if(id == R.id.sub_item1_setting){
            Toast.makeText(getContext(), "Settings: Sub item1", Toast.LENGTH_LONG).show();
        }
        if(id == R.id.sub_item2_setting){
            Toast.makeText(getContext(), "Settings: Sub item2", Toast.LENGTH_LONG).show();
        }
        if(id == R.id.sub_item3_setting){
            Toast.makeText(getContext(), "Settings: Sub item3", Toast.LENGTH_LONG).show();
        }
        if(id == R.id.sub_item4_setting){
            Toast.makeText(getContext(), "Settings: Sub item4", Toast.LENGTH_LONG).show();
        }
        if(id == R.id.action_more){
            Toast.makeText(getContext(), "More options Clicked", Toast.LENGTH_LONG).show();
        }
        if(id == R.id.action_search){
            Toast.makeText(getContext(), "Search Call", Toast.LENGTH_LONG).show();
        }


        return super.onOptionsItemSelected(item);
    }

}
