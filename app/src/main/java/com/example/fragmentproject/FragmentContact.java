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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FragmentContact extends Fragment {

    View view;
    private RecyclerView recyclerView;
    private List<Contacts> contactsList;


    public FragmentContact() {
        //  Required empty constructor (so that the fragment can be instantiated)
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //  Inflate the layout of the fragment
        view = inflater.inflate(R.layout.contact_fragment, container, false);


        //  Attach adapter to RecyclerView
        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_id);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(), contactsList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(recyclerViewAdapter);

        return view;
    }


    //  Initial creation of a fragment
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setHasOptionsMenu(true);                        //  Options menu in the fragment
        super.onCreate(savedInstanceState);

        contactsList = new ArrayList<>();

        String[] names = getResources().getStringArray(R.array.names);
        String[] phone = getResources().getStringArray(R.array.numbers);
        int[] photos = {R.drawable.c1, R.drawable.c2, R.drawable.c3, R.drawable.c4, R.drawable.c5, R.drawable.c6, R.drawable.c7, R.drawable.c8, R.drawable.c9, R.drawable.c10, R.drawable.c11, R.drawable.c12};


        //  Add items to RecyclerView list
        for(int i =0; i<names.length; i++){
            contactsList.add((new Contacts(names[i], phone[i], photos[i])));
        }

    }


    //  Inflate the menu
    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {

        inflater.inflate(R.menu.menu, menu);
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
        if(id == R.id.sub_item4_setting) {
            Toast.makeText(getContext(), "Settings: Sub item4", Toast.LENGTH_LONG).show();
        }
        if(id == R.id.action_more){
            Toast.makeText(getContext(), "More options Clicked", Toast.LENGTH_LONG).show();
        }
        if(id == R.id.action_add){
            Toast.makeText(getContext(), "Add contact", Toast.LENGTH_LONG).show();
        }
        if(id == R.id.sub_item1_add){
            Toast.makeText(getContext(), "Add: Sub item1", Toast.LENGTH_LONG).show();
        }
        if(id == R.id.sub_item2_add){
            Toast.makeText(getContext(), "Add: Sub item2", Toast.LENGTH_LONG).show();
        }
        if(id == R.id.action_search){
            Toast.makeText(getContext(), "Search contact", Toast.LENGTH_LONG).show();
        }


        return super.onOptionsItemSelected(item);
    }



}