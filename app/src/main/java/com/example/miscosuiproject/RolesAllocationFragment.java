package com.example.miscosuiproject;

import android.graphics.Typeface;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;

import com.example.miscosuiproject.databinding.FragmentEmployeeDetailBinding;
import com.example.miscosuiproject.databinding.FragmentRolesAllocationBinding;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class RolesAllocationFragment extends Fragment {
    private FragmentRolesAllocationBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentRolesAllocationBinding.inflate(inflater, container, false);

        // Get the layout where you want to add the CheckBoxes

        // Array of names for CheckBoxes
        String[] names = {"Aadesh Tripathi", "Ayush Saxena", "Smitha Pawar", "Sachin Anarthe"};

        // Loop to create CheckBoxes dynamically
        for (int i = 0; i < names.length; i++) {
            // Create a new CheckBox
            CheckBox checkBox = new CheckBox(requireContext());

            // Set CheckBox attributes
            checkBox.setId(i + 1); // Set a unique ID for each CheckBox
            checkBox.setText(names[i]);
            checkBox.setChecked(false);
            checkBox.setTextSize(17);
            checkBox.setTypeface(null, Typeface.BOLD);

            // Set layout parameters
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                    ViewGroup.LayoutParams.WRAP_CONTENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT
            );
            checkBox.setLayoutParams(params);

            // Add the CheckBox to the layout
            binding.checkboxLayout.addView(checkBox);

        }
        return binding.getRoot();
    }
}