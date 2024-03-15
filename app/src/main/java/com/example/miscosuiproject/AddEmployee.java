package com.example.miscosuiproject;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.Dialog;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.miscosuiproject.databinding.FragmentAddEmployeeBinding;
import com.example.miscosuiproject.databinding.FragmentEmployeeDetailBinding;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputEditText;

public class AddEmployee extends Fragment {


    private FragmentAddEmployeeBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentAddEmployeeBinding.inflate(inflater, container, false);
        reduceDraawbleImageSize();
        binding.roles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showCustomAlertDialog();
            }
        });
        binding.existingRoles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toast.makeText(requireContext(), "clicked", Toast.LENGTH_SHORT).show();
                showCustomAlertDialog2();
            }
        });
        return binding.getRoot();
    }

    private void reduceDraawbleImageSize() {
        // Apply compound drawable modifications
        setCompoundDrawable(binding.firstName);
        setCompoundDrawable(binding.middleName);
        setCompoundDrawable(binding.lastName);
        setCompoundDrawable(binding.address);
        setCompoundDrawable(binding.number);
        setCompoundDrawable(binding.email);
    }

    private void showCustomAlertDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
        //builder.setTitle("Select Roles");

        // Inflate custom layout for AlertDialog
        View dialogView = getLayoutInflater().inflate(R.layout.dialogue_role_allocation, null);


        ImageView closeImage = dialogView.findViewById(R.id.closeImage);
        // Set up any listeners or additional configuration as needed

        builder.setView(dialogView);
        // builder.setPositiveButton("OK", null); // You can add OnClickListener here if needed

        AlertDialog dialog = builder.create();
        dialog.show();
        closeImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(requireContext(), "clicked", Toast.LENGTH_SHORT).show();
                dialog.cancel();
            }
        });


    }

    private void showCustomAlertDialog2() {
        AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
        //builder.setTitle("Select Roles");
        // Inflate custom layout for AlertDialog
        View dialogView = getLayoutInflater().inflate(R.layout.dialgue_select_role, null);

        ImageView closeImage = dialogView.findViewById(R.id.close);
        // Set up any listeners or additional configuration as needed

        builder.setView(dialogView);
        // builder.setPositiveButton("OK", null); // You can add OnClickListener here if needed

        AlertDialog dialog = builder.create();
        dialog.show();
        closeImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(requireContext(), "clicked", Toast.LENGTH_SHORT).show();
                dialog.cancel();
            }
        });


    }

    private void setCompoundDrawable(TextInputEditText editText) {
        // Get the Drawable from the TextInputEditText's compound drawables
        Drawable[] drawables = editText.getCompoundDrawables();

        // Check if the left compound drawable is not null
        if (drawables[0] != null) {
            // Set the width and height for the drawable (adjust values as needed)
            drawables[0].setBounds(0, 0, 70, 70);

            // Set the updated compound drawables back to the TextInputEditText
            editText.setCompoundDrawables(drawables[0], null, null, null);

            // Set visibility
            editText.setVisibility(View.VISIBLE);
        }
    }



}