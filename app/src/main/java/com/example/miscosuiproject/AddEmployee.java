package com.example.miscosuiproject;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;

import com.example.miscosuiproject.databinding.FragmentAddEmployeeBinding;
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

    @SuppressLint("UseCompatLoadingForDrawables")
    private void reduceDraawbleImageSize() {
        // Apply compound drawable modifications
        setCompoundDrawable(binding.firstName,getResources().getDrawable(R.drawable.user_image));
        setCompoundDrawable(binding.middleName,getResources().getDrawable(R.drawable.user_image));
        setCompoundDrawable(binding.lastName,getResources().getDrawable(R.drawable.user_image));
        setCompoundDrawable(binding.address,getResources().getDrawable(R.drawable.gps));
        setCompoundDrawable(binding.number,getResources().getDrawable(R.drawable.call));
        setCompoundDrawable(binding.email,getResources().getDrawable(R.drawable.email));
        //etCompoundDrawable(binding.roles);
        setCompoundDrawable2(binding.roles, getResources().getDrawable(R.drawable.briefcase));
        setCompoundDrawable2(binding.existingRoles, getResources().getDrawable(R.drawable.briefcase));
        setCompoundDrawable2(binding.gisDrones, getResources().getDrawable(R.drawable.briefcase));
        setCompoundDrawable2(binding.headOfDept, getResources().getDrawable(R.drawable.briefcase));
        setCompoundDrawable2(binding.existingAllocatedRole, getResources().getDrawable(R.drawable.briefcase));
//        setCompoundDrawable2(binding.existingRoles, getResources().getDrawable(R.drawable.briefcase));
//        setCompoundDrawable2(binding.roles, getResources().getDrawable(R.drawable.briefcase));

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
    private void setCompoundDrawable2(AutoCompleteTextView editText, Drawable drawable) {
        // Set the width and height for the drawable (adjust values as needed)
        drawable.setBounds(0, 0, 70, 70);

        // Set the compound drawable to the left of the TextInputEditText
        editText.setCompoundDrawablesRelative(drawable, null, null, null);

        // Set visibility
        editText.setVisibility(View.VISIBLE);
    }

    private void setCompoundDrawable(TextInputEditText editText, Drawable drawable) {
        // Set the width and height for the drawable (adjust values as needed)
        drawable.setBounds(0, 0, 70, 70);

        // Set the updated compound drawables back to the TextInputEditText
        editText.setCompoundDrawables(drawable, null, null, null);

        // Set visibility
        editText.setVisibility(View.VISIBLE);
    }




}