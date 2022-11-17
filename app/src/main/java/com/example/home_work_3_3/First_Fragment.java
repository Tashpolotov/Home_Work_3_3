package com.example.home_work_3_3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class First_Fragment extends Fragment {

        Button button_next;
        Button button_skip;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first_, container, false);


    }



    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        button_next = view.findViewById(R.id.Next_btn);
        button_skip = view.findViewById(R.id.Skip_btn);

        button_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Second_Fragment fragment = new Second_Fragment();

                requireActivity().getSupportFragmentManager().beginTransaction().addToBackStack(null).
                        replace(R.id.container_FL, fragment).commit();
            }
        });




    }
}