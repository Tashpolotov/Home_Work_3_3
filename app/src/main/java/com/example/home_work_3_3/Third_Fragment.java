package com.example.home_work_3_3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class Third_Fragment extends Fragment {

    Button Button_next;
    Button Button_skip;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third_, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button_skip = view.findViewById(R.id.Skip_btn2);
        Button_next = view.findViewById(R.id.Next_btn2);

        Button_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(getActivity().getApplicationContext(), "Nel'z9 bro Nel'z9", Toast.LENGTH_LONG);toast.show();
            }
        });

        Button_skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                requireActivity().getSupportFragmentManager().beginTransaction().addToBackStack(null).
                        replace(R.id.container_FL,new Second_Fragment()).commit();
            }
        });




    }
}