package com.example.home_work_3_3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Second_Fragment extends Fragment {

    Button btn;
    Button button_skip;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second_, container, false);



    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        btn = view.findViewById(R.id.Next_btn1);
        button_skip = view.findViewById(R.id.Skip_btn1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                requireActivity().getSupportFragmentManager().beginTransaction().addToBackStack(null).
                        replace(R.id.container_FL, new Third_Fragment()).commit();
            }
        });

        button_skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                requireActivity().getSupportFragmentManager().beginTransaction().addToBackStack(null).
                        replace(R.id.container_FL,new First_Fragment()).commit();
            }
        });
    }
}