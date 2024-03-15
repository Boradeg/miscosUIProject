package com.example.miscosuiproject;

import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.miscosuiproject.Adapter.UserAdapter;
import com.example.miscosuiproject.DataClass.User;
import com.example.miscosuiproject.databinding.FragmentEmployeeDetailBinding;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class employeeDetail extends Fragment {
    private FragmentEmployeeDetailBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentEmployeeDetailBinding.inflate(inflater, container, false);

        binding.addEmployeeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment();
            }
        });

        binding.recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        // Create dummy data
        List<User> userList = new ArrayList<>();
        userList.add(new User("Ayush Saxena", "Project Manager",R.drawable.man));
        userList.add(new User("Punam Borade", "Developer",R.drawable.woman));
        userList.add(new User("Rakesh Ghadage", "Project Manager",R.drawable.woman_f));
        userList.add(new User("Dhanraj Pawar", "Project Manager | Admin",R.drawable.woman_s));
        userList.add(new User("Gokul Ghadage", "Project Manager",R.drawable.woman_t));
        userList.add(new User("Sanket Sonawane", "Project Manager",R.drawable.businesswoman));
        userList.add(new User("Payal Saxena", "Contacter",R.drawable.man));
        userList.add(new User("Rimzim Ghadage", "Project Manager",R.drawable.woman));
        userList.add(new User("Ganesh Ghadage", "Project Manager",R.drawable.woman_f));
        userList.add(new User("Shreeram Pawar", "Project Manager",R.drawable.woman_s));
        userList.add(new User("Ravan Ghadage", "Project Manager",R.drawable.woman_t));
        userList.add(new User("Krushna Shinde", "Project Manager",R.drawable.businesswoman));
        // Add more users as needed
        // Set adapter
        binding.recyclerView.setAdapter(new UserAdapter(userList));
        return binding.getRoot();
    }

    private void replaceFragment() {
        // Create a new instance of the fragment you want to open
        AddEmployee fragment = new AddEmployee();

        // Get the fragment manager associated with the current fragment
        FragmentManager fragmentManager = getParentFragmentManager();

        // Begin the fragment transaction
        FragmentTransaction transaction = fragmentManager.beginTransaction();

        // Replace the current fragment with the new one
        transaction.replace(R.id.fragment_container, fragment);

        // Add the transaction to the back stack to allow back navigation
        transaction.addToBackStack(null);

        // Commit the transaction
        transaction.commit();
    }

}