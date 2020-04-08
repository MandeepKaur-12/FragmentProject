package com.example.fragmentproject;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class FragmentCall extends Fragment {

    View view;


    public FragmentCall() {
    }



    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.call_fragment, container, false);



        return view;
    }

    //  Options menu in the fragment
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {

        setHasOptionsMenu(true);
        super.onCreate(savedInstanceState);
    }

    //  Inflate
    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {

        inflater.inflate(R.menu.menu, menu);
        menu.findItem(R.id.action_add).setVisible(false);

        super.onCreateOptionsMenu(menu, inflater);
    }

    //  When menu items are clicked
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
