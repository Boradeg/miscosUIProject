package com.example.miscosuiproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button showEmployee;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        replaceFragment(new employeeDetail());
    }
    public void replaceFragment(employeeDetail fragment) {
        // Begin the transaction
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        // Replace the contents of the container with the new fragment
        transaction.replace(R.id.fragment_container, fragment);
        // Complete the changes added above
        transaction.addToBackStack(null);
        // Commit the transaction
        transaction.commit();
    }
}