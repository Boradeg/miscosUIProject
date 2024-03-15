package com.example.miscosuiproject;

import android.app.AlertDialog;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.miscosuiproject.databinding.FragmentRolesAllocationBinding;
import com.example.miscosuiproject.databinding.FragmentSelectRoleBinding;

public class SelectRoleFragment extends Fragment {

    private FragmentSelectRoleBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentSelectRoleBinding.inflate(inflater, container, false);

        View rootView = inflater.inflate(R.layout.fragment_select_role, container, false);
        binding.close.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(requireContext(), "click", Toast.LENGTH_SHORT).show();
            }
        });
        binding.assignRolesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showCustomAlertDialog();

            }
        });
        return rootView;
    }

    private void showCustomAlertDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
        //builder.setTitle("Select Roles");

        // Inflate custom layout for AlertDialog
        View dialogView = getLayoutInflater().inflate(R.layout.dialogue_role_allocation, null);

        // Set up any listeners or additional configuration as needed

        builder.setView(dialogView);
       // builder.setPositiveButton("OK", null); // You can add OnClickListener here if needed

        AlertDialog dialog = builder.create();
        dialog.show();
    }
}